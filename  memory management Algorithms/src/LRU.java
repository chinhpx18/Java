
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class LRU {

    // Method to find page faults using indexes
    static int pageFaults(int pages[], int n, int capacity) {
        HashSet<Integer> s = new HashSet<>(capacity);

        HashMap<Integer, Integer> indexes = new HashMap<>();

        int page_faults = 0;
        for (int i = 0; i < n; i++) {
            // Check if the set can hold more pages
            if (s.size() < capacity) {

                if (!s.contains(pages[i])) {
                    s.add(pages[i]);

                    // increment page fault
                    page_faults++;
                }

                // Store the recently used index of
                // each page
                indexes.put(pages[i], i);
            } else {
                // Check if current page is not already
                // present in the set
                if (!s.contains(pages[i])) {
                    // Find the least recently used pages
                    // that is present in the set
                    int lru = Integer.MAX_VALUE, val = Integer.MIN_VALUE;

                    Iterator<Integer> itr = s.iterator();

                    while (itr.hasNext()) {
                        int temp = itr.next();
                        if (indexes.get(temp) < lru) {
                            lru = indexes.get(temp);
                            val = temp;
                        }
                    }

                    // Remove the indexes page
                    s.remove(val);
                    //remove lru from hashmap
                    indexes.remove(val);
                    // insert the current page
                    s.add(pages[i]);

                    // Increment page faults
                    page_faults++;
                }

                // Update the current page index
                indexes.put(pages[i], i);
            }
        }

        return page_faults;
    }

    // Driver method
    public static void main(String args[]) {
        int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};

        int capacity = 4;

        System.out.println(pageFaults(pages, pages.length, capacity));
    }
}