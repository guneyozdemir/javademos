public class Main {

    public static void main(String[] args) {
        String student1 = "Engin";
        String student2 = "Derin";
        String student3 = "Salih";
        String student4 = "Güney";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("-----------------------------");

        String[] student = new String[4];
        student[0] = "Engin";
        student[1] = "Derin";
        student[2] = "Salih";
        student[3] = "Güney";

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }
        System.out.println("-----------------------------");

        for (String students:student){
            System.out.println(students);
        }

    }
}
