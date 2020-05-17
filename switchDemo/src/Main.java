public class Main {

    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel Geçtiniz");
                break;
            case 'B':
                System.out.println("Harika Geçtiniz");
                break;
            case 'C':
            case 'D':
                System.out.println("Sınırda Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz.");
        }
    }
}
