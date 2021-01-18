
public class MergeSort {

    private int[] extraTab;

    public void sort(int[] tab) {
        extraTab = new int[tab.length];
        mergeSort(tab, 0, tab.length - 1);
    }

    private void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, middle);
            mergeSort(array, middle + 1, rightIndex);
            merge(array, leftIndex, middle, rightIndex);
        }
    }

    private void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {
        for (int i = leftIndex; i <= rightIndex; i++) {
            extraTab[i] = array[i];
        }
        int finger1 = leftIndex;
        int finger2 = middleIndex + 1;
        int current = leftIndex;

        while (finger1 <= middleIndex && finger2 <= rightIndex) {
            if (extraTab[finger1] <= extraTab[finger2]) {
                array[current] = extraTab[finger1];
                finger1++;
            } else {
                array[current] = extraTab[finger2];
                finger2++;
            }
            current++;
        }
        while (finger1 <= middleIndex) {
            array[current] = extraTab[finger1];
            current++;
            finger1++;
        }
    }
}
