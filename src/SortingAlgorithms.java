//Alexander Cox
//Thursday, November 15, 2018

public class SortingAlgorithms {

    public static void mergeSort (int[] list)
    {
        int n = list.length;
        int[] temp = new int[n];
        mergeSortHelper(list, (0), (n - 1), temp);
    }
    public static void mergeSortHelper (int[] list, int left, int right, int[] temp)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelper(list, left, mid, temp);
            mergeSortHelper(list, (mid + 1), right, temp);
            merge(list, left, mid, right, temp);
        }
    }
    public static void merge (int[] list, int left, int mid, int right, int[] temp)
    {
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right)
        {
            if (list[i] < list[j])
            {
                temp[k] = list[i];
                i++;
            }
            else
            {
                temp[k] = list[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k] = list[i];
            i++;
            k++;
        }

        while (j <= right)
        {
            temp[k] = list[j];
            j++;
            k++;
        }

        for (int x = left; x <= right; x++)
        {
            list[x] = temp[x];
        }
    }

    public static void insertionSort (int[] list)
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

    public static void selectionSort (int[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            int minIdx = i;

            for (int j = (i + 1); j < list.length; j++)
            {
                if (list[j] < list[minIdx])
                {
                    minIdx = j;
                }
            }

            swap(list, i, minIdx);
        }
    }

    public static void bubbleSort (int[] list)
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

    private static void swap (int[] arr, int pos1, int pos2)
    {
        int pHolder = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = pHolder;
    }
}
