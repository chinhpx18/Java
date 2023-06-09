
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PageReplacementAlgorithms {

        public static void main(String[] args) {
            int[] pages = {3, 8, 2, 3, 9, 1, 6, 3, 8, 9, 3, 6, 2, 1, 3};
            int numFrames = 5;

            System.out.println("FIFO: " + fifo(pages, numFrames));
            System.out.println("LRU: " + lru(pages, numFrames));
        }

        public static int fifo(int[] pages, int numFrames) {
            Queue<Integer> queue = new LinkedList<>();
            int faults = 0;
            for (int i = 0; i < pages.length; i++) {
                if (!queue.contains(pages[i])) {
                    if (queue.size() == numFrames) {
                        queue.poll();
                    }
                    queue.add(pages[i]);
                    faults++;
                }
            }
            return faults;
        }

        public static int lru(int[] pages, int numFrames) {
            List<Integer> list = new ArrayList<>();
            int faults = 0;
            for (int i = 0; i < pages.length; i++) {
                if (!list.contains(pages[i])) {
                    if (list.size() == numFrames) {
                        int removeIndex = -1;
                        int farthestAccess = Integer.MAX_VALUE;
                        for (int j = 0; j < list.size(); j++) {
                            int page = list.get(j);
                            int lastAccess = -1;
                            for (int k = i - 1; k >= 0; k--) {
                                if (pages[k] == page) {
                                    lastAccess = k;
                                    break;
                                }
                            }
                            if (lastAccess < farthestAccess) {
                                farthestAccess = lastAccess;
                                removeIndex = j;
                            }
                        }
                        list.remove(removeIndex);
                    }
                    list.add(pages[i]);
                    faults++;
                } else {
                    list.remove(list.indexOf(pages[i]));
                    list.add(pages[i]);
                }
            }
            return faults;
        }
    }

