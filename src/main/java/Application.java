import java.util.Random;

public class Application {
    public static void main(String[] args) {

//        Fibonacci fibonacci = new Fibonacci();
//        for(int i = 1; i < 10; i++){
//            System.out.println(fibonacci.fib(i));
//        }
//        System.out.println("");
//
//        Number task = new Number();
//        task.number0for100();


        Random generator = new Random();
        int[] tab = new int[15];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = generator.nextInt(1000);
        }



        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(tab);

        System.out.print("The contents of the sorted array: ");
        for (int element : tab) {
            System.out.print(" " + element);
        }
    }
}
