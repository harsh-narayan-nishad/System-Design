// package Rough.strategydesign;
// import java.util.List;
// public class BubbleSortStrategy {
//     @Override
//     public void sort(List<Integer> numbers) {
//         int n = numbers.size();
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (numbers.get(j) > numbers.get(j + 1)) {
//                     int temp = numbers.get(j);
//                     numbers.set(j, numbers.get(j + 1));
//                     numbers.set(j + 1, temp);
//                 }
//             }
//         }
//         System.out.println("Sorted using Bubble Sort: " + numbers);
//     }
// }
package Rough.strategydesign;

import java.util.List;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> numbers) {
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted using Bubble Sort: " + numbers);
    }
}

