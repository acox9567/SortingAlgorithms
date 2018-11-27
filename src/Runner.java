//Alexander Cox
//Thursday, November 15, 2018

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        int numItems = 10000;

        int[] list1 = randIntArr(numItems);
        int[] list2 = Arrays.copyOf(list1, numItems);
        int[] list3 = Arrays.copyOf(list1, numItems);
        int[] list4 = Arrays.copyOf(list1, numItems);
        int[] list5 = Arrays.copyOf(list1, numItems);

        System.out.print("Original Array:\n");
        printArray(list1);

        //Runs bubble sort
        double startTime = System.nanoTime();
        SortingAlgorithms.bubbleSort(list1);
        System.out.println("Bubble Sort: " + ((System.nanoTime() - startTime) / 1000000000) + "s");
        printArray(list1);

        //Runs selection sort
        startTime = System.nanoTime();
        SortingAlgorithms.selectionSort(list2);
        System.out.println("Selection Sort: " + ((System.nanoTime() - startTime) / 1000000000) + "s");
        printArray(list2);

        //Runs insertion sort
        startTime = System.nanoTime();
        SortingAlgorithms.insertionSort(list3);
        System.out.println("Insertion Sort: " + ((System.nanoTime() - startTime) / 1000000000) + "s");
        printArray(list3);

        //Runs merge sort
        startTime = System.nanoTime();
        SortingAlgorithms.mergeSort(list4);
        System.out.println("Merge Sort: " + ((System.nanoTime() - startTime) / 1000000000) + "s");
        printArray(list4);

        //Runs quick sort
        startTime = System.nanoTime();
        SortingAlgorithms.quickSort(list5, (0), (list5.length - 1));
        System.out.println("Quick Sort: " + ((System.nanoTime() - startTime) / 1000000000) + "s");
        printArray(list5);
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10000);

        return arr;
    }

    public static void printArray(int[] list)
    {
        System.out.print("[");
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
        System.out.println("]\n");
    }
}
