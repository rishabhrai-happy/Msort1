package mergesort;

public class MergeSort {
    public static void sort1(int[] array) {
        if (array.length > 1) {
            int halfSize = array.length / 2;
            int[] leftArray = new int[halfSize];
            int[] rightArray = new int[array.length - halfSize];
            System.arraycopy(array, 0, leftArray, 0, halfSize);
            System.arraycopy(array, halfSize, rightArray, 0,
                    array.length - halfSize);

            sort1(leftArray);
            sort1(rightArray);

            merge(array, leftArray, rightArray);
        }
    }

    private static void merge(int[] outputArray, int[] leftSubArray, int[] rightSubArray) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSubArray.length && j < rightSubArray.length) {
            if (leftSubArray[i] < rightSubArray[j]) {
                outputArray[k++] = leftSubArray[i++];
            } else {
                outputArray[k++] = rightSubArray[j++];
            }
        }
        while (i < leftSubArray.length) {
            outputArray[k++] = leftSubArray[i++];
        }

        while (j < rightSubArray.length) {
            outputArray[k++] = rightSubArray[j++];
        }
    }
}
