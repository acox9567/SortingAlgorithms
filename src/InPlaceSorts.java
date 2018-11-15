//Alexander Cox
//Thursday, November 15, 2018

public class InPlaceSorts {

    public static void insertionSort(int[] list)
    {

    }

    public static void selectionSort(int[] list)
    {
        for (int i = 0; i < list.length-1; i++)
        {
            int least = i;

            for (int j = 0; j < list.length; j++)
            {
                if (list[j] < list[least])
                    least = j;
            }
            swap(list, i, least);
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
