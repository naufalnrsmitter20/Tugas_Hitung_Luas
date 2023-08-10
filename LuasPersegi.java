import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai sisi: ");
        int sisi = input.nextInt();
        int luas = sisi * sisi;

        System.out.println("Luas persegi dengan nilai " + sisi + " Adalah : " + luas);
    }
}
