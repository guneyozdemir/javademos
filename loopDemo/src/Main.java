public class Main {

    public static void main(String[] args) {
        //For
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        // While
        int i = 1;
        while (i < 10) {
            i++;
            System.out.println(i);

        }
        System.out.println("While  Döngüsü Bitti");

        // Do- While Döngüsü
        int j = 0;
        do {
            j++;
            System.out.println(j);
        } while (j < 10);

        System.out.println("Do-While  Döngüsü Bitti");
    }
    //infinity loop yani sonsuz döngü
}
