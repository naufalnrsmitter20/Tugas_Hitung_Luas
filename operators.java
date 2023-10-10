import javax.swing.JOptionPane;

public class operators {
    public static void main(String[] args) {
        int angka1 = 14;
        int angka2 = 20;

        int HasilJumlah = angka1 + angka2;
        int HasilKurang = angka1 - angka2;
        int HasilKali= angka1 * angka2;
        int HasilBagi = angka1 / angka2;
        int HasilModulus = angka1 % angka2;
        System.out.println("Hasil Penjumlahan : " + HasilJumlah);
        System.out.println("Hasil Pengurangan : " + HasilKurang);
        System.out.println("Hasil Perkalian : " + HasilKali);
        System.out.println("Hasil Pembagian : " + HasilBagi);
        System.out.println("Hasil Modulus : " + HasilModulus);



        int angkafirst = 12;
        int angkasecond = 7;

        String nama = JOptionPane.showInputDialog("Masukkan Nama :   ");
        JOptionPane.showMessageDialog(null, "Selamat Belajar " + nama);






    }
}
