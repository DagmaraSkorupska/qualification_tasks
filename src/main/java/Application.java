
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

        int[] tab = {107, 36, -9, 0, 26, 85};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(tab);
        System.out.print("The contents of the sorted array: ");
        for(int element : tab){
            System.out.print(" " + element);
        }
    }
}
