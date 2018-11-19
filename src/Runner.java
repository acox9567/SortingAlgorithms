//Alexander Cox
//Thursday, November 15, 2018

import java.util.Arrays;

public class Runner {

    public static void main(String[] args)
    {
        int numItems = 100000;

        int[] list1 = randIntArr(numItems);
        double[] list2 = randDoubleArr(numItems);
        String[] list3 = randStringArr(numItems);

        //Runs bubble sort
        double startTime = System.currentTimeMillis();
        InPlaceSorts.bubbleSort(list3);
        System.out.println("Bubble Sort: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");

        //Runs selection sort
        startTime = System.currentTimeMillis();
        InPlaceSorts.selectionSort(list2);
        System.out.println("Selection Sort: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");

        //Runs insertion sort
        startTime = System.currentTimeMillis();
        InPlaceSorts.insertionSort(list1);
        System.out.println("insertion Sort: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10000);

        return arr;
    }

    public static double[] randDoubleArr(int count)
    {
        double[] arr = new double[count];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Math.random();

        return arr;
    }

    public static String[] randStringArr(int count)
    {
        String[] arr = new String[count];

        for (int i = 0; i < arr.length; i++)
            arr[i] = String.valueOf((int)(Math.random() * 10000));

        return arr;
    }
}
