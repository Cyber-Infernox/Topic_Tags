class Solution {
    void merge(int arr[], int l, int m, int r) {

        // Your code here
        int merged[] = new int[r - l + 1];

        int first = l;
        int second = m + 1;

        int index = 0;

        while (first <= m && second <= r) {
            if (arr[first] <= arr[second])
                merged[index++] = arr[first++];
            else
                merged[index++] = arr[second++];
        }

        while (first <= m)
            merged[index++] = arr[first++];

        while (second <= r)
            merged[index++] = arr[second++];

        for (int i = 0, j = l; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    void divide(int arr[], int l, int r) {

        if (l >= r)
            return;

        int mid = (l + r) / 2;

        divide(arr, l, mid);
        divide(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        divide(arr, l, r);
    }
}