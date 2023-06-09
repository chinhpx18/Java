import java.util.ArrayList;
import java.util.List;

public class QuickFit {

    private final int[] sizes;
    private final List<Integer>[] freeList;

    public QuickFit(int[] sizes) {
        this.sizes = sizes;
        this.freeList = new List[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            this.freeList[i] = new ArrayList<>();
            // Initialize freeList with all blocks of each size
            for (int j = 0; j < sizes.length; j++) {
                if (sizes[j] == sizes[i]) {
                    this.freeList[i].add(j);
                }
            }
        }
    }

    public void allocate(int size) {
        int index = -1;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i] >= size && !freeList[i].isEmpty()) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalStateException("No suitable block found");
        }
        int block = freeList[index].remove(0);
        if (sizes[index] > size) {
            int remaining = sizes[index] - size;
            int remainingIndex = -1;
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i] == remaining) {
                    remainingIndex = i;
                    break;
                }
            }
            if (remainingIndex == -1) {
                throw new IllegalStateException("No suitable block found");
            }
            freeList[remainingIndex].add(block + size);
        }
        System.out.println("Allocated block " + block + " of size " + size);
    }

    public void deallocate(int block, int size) {
        int index = -1;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i] == size) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalStateException("Invalid block size");
        }
        freeList[index].add(block);
        System.out.println("Deallocated block " + block + " of size " + size);
    }

    public static void main(String[] args) {
        int[] sizes = {16, 32, 64, 128};
        QuickFit allocator = new QuickFit(sizes);
        allocator.allocate(32);
        allocator.allocate(64);
        allocator.allocate(16);
        allocator.deallocate(0, 32);
        allocator.allocate(128);
        allocator.deallocate(1, 64);
        allocator.allocate(32);
    }
}