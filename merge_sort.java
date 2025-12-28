import java.io.*;
class Solution {

    static void mergeSort(int arr[], int l, int r) {
        if (l >= r) return;

        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        int[] t = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            t[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];

        while (i <= m) t[k++] = arr[i++];
        while (j <= r) t[k++] = arr[j++];

        for (i = l, k = 0; i <= r; i++)
            arr[i] = t[k++];
    }

    public static void main(String[] args) {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(a, 0, a.length - 1);

        for (int x : a)
            System.out.print(x + " ");
    }
}
