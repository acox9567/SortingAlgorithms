//Alexander Cox
//Thursday, November 15, 2018

public class InPlaceSorts {

    public static void insertionSort(int[] list)
    {
        for (int i = 1; i < list.length; ++i)
        {
            int swap = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > swap)
            {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = swap;
        }
    }

    public static void selectionSort(double[] list)
    {
        double minVal = 0;
        int minPos = 0;

        for (int i = 0; i < list.length; i++)
        {
            minVal = list[i];
            minPos= i;

            for (int j = 0; j < list.length; j++)
            {
                if (list[j] < minVal)
                    minPos = j;
            }

            double pHolder = list[i];
            list[i] = list[minPos];
            list[minPos] = pHolder;
        }
    }

    public static void bubbleSort(String[] list)
    {
        int swapNum = 1;

        while (swapNum != 0)
        {
            swapNum = 0;

            for (int i = 0; i < list.length - 1; i++)
            {
                if (list[i + 1].compareTo(list[i]) > 0)
                {
                    String pHolder = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = pHolder;
                    swapNum++;
                }
            }
        }
    }

    public static void swap(int[] arr, int pos1, int pos2)
    {
        int pHolder = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = pHolder;
    }
}
