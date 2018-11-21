//Alexander Cox
//Thursday, November 15, 2018

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int numItems = 1000;

        int[] list1 = randIntArr(numItems);
        int[] list2 = Arrays.copyOf(list1, numItems);
        int[] list3 = Arrays.copyOf(list1, numItems);
        int[] list4 = Arrays.copyOf(list1, numItems);

        System.out.print("Original Array: \n[");
        for (int i = 0; i < list4.length; i++)
        {
            System.out.print(list4[i] + ", ");
        }
        System.out.println("]\n");

        //Runs bubble sort
        double startTime = System.currentTimeMillis();
        SortingAlgorithms.bubbleSort(list1);
        System.out.println("Bubble Sort: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");
        System.out.print("[");
        for (int i = 0; i < list1.length; i++)
        {
            System.out.print(list1[i] + ", ");
        }
        System.out.println("]\n");

        //Runs selection sort
        startTime = System.currentTimeMillis();
        SortingAlgorithms.selectionSort(list2);
        System.out.println("Selection Sort: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");
        System.out.print("[");
        for (int i = 0; i < list2.length; i++)
        {
            System.out.print(list2[i] + ", ");
        }
        System.out.println("]\n");

        //Runs insertion sort
        startTime = System.currentTimeMillis();
        SortingAlgorithms.insertionSort(list3);
        System.out.println("Insertion Sort: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");
        System.out.print("[");
        for (int i = 0; i < list3.length; i++)
        {
            System.out.print(list3[i] + ", ");
        }
        System.out.println("]\n");

        //Runs merge sort
        startTime = System.currentTimeMillis();
        SortingAlgorithms.mergeSort(list4);
        System.out.println("Merge Sort: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");
        System.out.print("[");
        for (int i = 0; i < list4.length; i++)
        {
            System.out.print(list4[i] + ", ");
        }
        System.out.println("]\n");
    }
    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10000);

        return arr;
    }
}
