public class Main {

    public static void main(String[] args) {
        double[] myList = {1.1, 1.2, 1.3, 1.4, 1.5};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = number + total;
            System.out.println(number);

        }
        System.out.println("Toplamları = " + total);
        System.out.println("En Büyük = " + max);
    }
}
