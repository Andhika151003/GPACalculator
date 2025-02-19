import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Nomer kredit :");
        String credits = scanner.nextLine();

        System.out.println("Masukan Nilai :");
        String grade = scanner.nextLine();

        int gradeValue = 0;
        if (grade.equalsIgnoreCase("A")) {
            gradeValue = 4;
        } else if (grade.equalsIgnoreCase("B")) {
            gradeValue = 3;
        } else if (grade.equalsIgnoreCase("C")) {
            gradeValue = 2;
        } else if (grade.equalsIgnoreCase("D")) {
            gradeValue = 1;
        } else if (grade.equalsIgnoreCase("F")) {
            gradeValue = 0;
        } else {
            System.out.print("Maaf Anda Tidak Lulus");
        }

        int points = gradeValue * Integer.parseInt(credits);

        int GPA = points / Integer.parseInt(credits);

        System.out.println("Credits : " + credits);
        System.out.println("Grade : " + grade);
        System.out.println("Points : " + points);
        System.out.println("GPA : " + GPA);

        scanner.close();

    }
}