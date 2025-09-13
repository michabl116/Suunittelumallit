package Tehtava9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] smallArray = generateRandomArray(30);
        int[] largeArray = generateRandomArray(10000);

        SorstStrategy[] strategies = {
                new BubbleSort(),
                new InsertionSort(),
                new SelectionSort(),

        };
        String[] strategiesNames = {"Bubble Sort", "Insertion Sort", "Selection Sort"};
        for (int i = 0; i < strategies.length; i++) {
            System.out.println(strategiesNames[i] + " ");

            testPerformance(strategies[i], smallArray.clone(), "Small Array");
            testPerformance(strategies[i], largeArray.clone(), "Large Array");
            System.out.println();
        }
    }

    private static void testPerformance(SorstStrategy strategy, int[] array, String label) {
        long start = System.nanoTime();
        strategy.sort(array);
        long end = System.nanoTime();
        System.out.println(label + " took " + (end - start) / 1_000_000.0 + " ms");
    }

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(100000);
        return arr;
    }
        }


