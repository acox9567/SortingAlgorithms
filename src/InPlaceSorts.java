//Alexander Cox
//Thursday, November 15, 2018

public class InPlaceSorts {

    public static void insertionSort(int[] list)
    {
        for (int i = 1; i < list.length; ++i)
        {
            int swapPos = list[i];
            int j = i - 1;

            while (list[j] < list [j + 1])
            {
                swap(list, j, j + 1);
                j -= 1;
            }
        }
    }

    public static void selectionSort(int[] list)
    {
        int minVal = 0;
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

            swap(list, i, minPos);
        }
    }

    public static void bubbleSort(int[] list)
    {
        int swapNum = 1;

        while (swapNum != 0)
        {
            swapNum = 0;

            for (int i = 0; i < list.length - 1; i++)
            {
                if (list[i + 1] < list[i])
                {
                    swap(list, i, (i + 1));
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
