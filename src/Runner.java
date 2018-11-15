//Alexander Cox
//Thursday, November 15, 2018

import java.util.Arrays;

public class Runner {

    public static void main(String[] args)
    {
        int[] list1 = randIntArr(1000);
        int[] list2 = Arrays.copyOf(list1,list1.length);
        int[] list3 = Arrays.copyOf(list1,list1.length);

        //Runs bubble sort
        double startTime = System.currentTimeMillis();
        InPlaceSorts.bubbleSort(list1);
        System.out.print("Bubble Sort: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10000);

        return arr;
    }
}
