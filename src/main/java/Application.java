import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Fibonacci: ");
        Fibonacci fibonacci = new Fibonacci();
        for(int i = 1; i < 10; i++){
            System.out.println(fibonacci.fib(i));
        }
        System.out.println();

        System.out.println("Class Number: ");
        Number task = new Number();
        task.number0for100();


        Random generator = new Random();
        int[] tab = new int[1000];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = generator.nextInt(1000);
        }

        System.out.println("Bubble Sort: ");

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(tab);
        System.out.print("The contents of the sorted array: ");
        for (int element : tab) {
            System.out.print(" " + element);
        }


        System.out.println(" ");
        System.out.println("Binary search: ");
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(bubbleSort.sort(tab), 456);

        System.out.println(" ");
        System.out.println("Merge Sort: ");
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(tab);
        System.out.print("The contents of the Merge Sort: ");
        for (int element : tab) {
            System.out.print(" " + element);
        }




    }
}
