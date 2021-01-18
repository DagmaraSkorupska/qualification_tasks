public class BubbleSort {

    public int[] sort(int[] tab) {
        int size = tab.length;
        int temp = 0;
        boolean isChange;

        for (int i = 0; i < size; i++) {
            isChange = false;
            for (int j = 1; j < (size - i); j++) {
                if (tab[j - 1] > tab[j]) {
                    temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                    isChange = true;
                }
            }
            if(!isChange){
                break;
            }
        }
        return tab;
    }
}
