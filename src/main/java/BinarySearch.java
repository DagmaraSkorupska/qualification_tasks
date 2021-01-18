
public class BinarySearch {


    public void binarySearch(int[] tab, int searchNumber) {
        int left = 0;
        int right = tab.length - 1;
        int index = Integer.MAX_VALUE;
        int number = 0;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (tab[middle] < searchNumber) {
                left = middle + 1;
            } else if (tab[middle] > searchNumber) {
                right = middle - 1;
            } else if (tab[middle] == searchNumber) {
                index = middle;
                number = searchNumber;
                break;
            }
        }
        if (number == searchNumber) {
            System.out.println("Entered number: " + searchNumber + " was found in the array at position: " + index);
        } else {
            System.out.println("The array does not contain the entered number ");
        }

    }


}
