//Napisz program, który wypisze liczby od 1 do 100. Dodatkowo dla wielokrotności trójki wyświetli  ‚A’
// zamiast liczby, dla wielokrotności piątki wyświetli ‚B’, a dla liczb będących wielokrotnością trójki
// i piątki wyświetli ‚AB’.


public class Number {

    public void number0for100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("AB");
            }
            if (i % 3 == 0) {
                System.out.println(("A"));
            }
            if (i % 5 == 0) {
                System.out.println("B");
            } else {
                System.out.println(i);
            }

        }
    }
}
