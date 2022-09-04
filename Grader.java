import java.util.*;

public class Grader {
    private double nilai_tugas, nilai_UTS, nilai_UAS;

    // Konstruktor class Grader
    private Grader(double nilai_tugas, double nilai_UTS, double nilai_UAS) {
        this.nilai_tugas = nilai_tugas;
        this.nilai_UTS = nilai_UTS;
        this.nilai_UAS = nilai_UAS;
    }

    // Menghitung nilai akhir menggunakan rumus:
    // (20% * nilai tugas) + (35% * nilai UTS) + (45% * nilai UAS)
    private double finalGrade() {
        return (0.2 * nilai_tugas) + (0.35 * nilai_UTS) + (0.45 * nilai_UAS);
    }

    // Pemberian grade sesuai dengan nilai akhir yang didapat
    // dari hasil penghitungan fungsi finalGrade()
    public void checkGrade() {
        final int gradeToCheck = (int) Math.round(finalGrade());

        if (gradeToCheck >= 85) {
            System.out.println("A");
        } else if ((gradeToCheck >= 75) && (gradeToCheck <= 84)) {
            System.out.println("B");
        } else if ((gradeToCheck >= 65) && (gradeToCheck <= 74)) {
            System.out.println("C");
        } else if ((gradeToCheck >= 49) && (gradeToCheck <= 64)) {
            System.out.println("D");
        } else if (gradeToCheck <= 50) {
            System.out.println("E");
        }
    }

    public static void main(String[] args) {
        Scanner scanThis = new Scanner(System.in);

        System.out.print("Masukan nilai tugas: ");
        double tugas = scanThis.nextDouble();
        System.out.print("Masukan nilai UTS: ");
        double uts = scanThis.nextDouble();
        System.out.print("Masukan nilai UAS: ");
        double uas = scanThis.nextDouble();

        Grader nilai = new Grader(tugas, uts, uas);
        nilai.checkGrade();
    }
}
