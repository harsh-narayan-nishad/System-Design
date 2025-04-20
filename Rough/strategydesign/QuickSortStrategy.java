
package Rough.strategydesign;

import java.util.Collections;
import java.util.List;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> numbers) {
        quickSort(numbers, 0, numbers.size() - 1);
        System.out.println("Sorted using Quick Sort: " + numbers);
    }

    private void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list.get(j) < pivot) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return i + 1;
    }
}
