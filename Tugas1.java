import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        //1. Membuat program sederhana menghitung BMI atau indeks masa tubuh.
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Berat Badan : ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan : ");
        double Tinggi = input.nextDouble();

        double konversiBerat = berat * 2.205;
        double konversiTinggi = Tinggi / 2.54;
        double RumusBmi = konversiBerat / konversiTinggi*konversiTinggi * 703;
        System.out.println("BMI = " + RumusBmi);
        //2. Menghitung volume bangun ruang
        // a. Bola V = 4/3 x π x r3
        Scanner inputBola = new Scanner(System.in);

        System.out.print("Masukkan Jari Jari : ");
        double JariJari = inputBola.nextDouble();

        double Phiphi = 3.14;
        double VolumeBola = 4/3 * Phiphi * JariJari * JariJari;
        System.out.println("Volume Bola Adalah : " + VolumeBola);
        //b. Tabung
        // Tabung V = phi x r x r x t
        Scanner inputTabung = new Scanner(System.in);

        System.out.println("Masukkan Jari Jari : ");
        double JariJariTabung = inputTabung.nextDouble();
        
        System.out.println("Masukkan Tinggi : ");
        double TinggiTabung = inputTabung.nextDouble();

        double VolumeTabung = Phiphi * JariJariTabung * TinggiTabung;
        System.out.println("Volume Tabung Adalah : " + VolumeTabung);

        //c. Kerucut
        // Kerucut V = 1/3 x phi x r x r x t 
        Scanner inputKerucut = new Scanner(System.in);

        System.out.println("Masukkan Jari Jari : ");
        double JariJariKerucut = inputKerucut.nextDouble();

        System.out.println("Masukkan Tinggi");
        double TinggiKerucut = inputKerucut.nextDouble();

        double VolumeKerucut =  Phiphi * JariJariKerucut * TinggiKerucut * 1/3;
        System.out.println("Volume Kerucut Adalah : " + VolumeKerucut); 
        
    }
}

