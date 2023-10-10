    import java.util.Scanner;
public class menurestoran {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("List harga makanan : \n 1. Soto Ayam 15000 \n 2. Pecel 10000 \n 3. Sate Ayam 10000 \n Ayam Geprek");
    System.out.println("List harga minuman : \n 1. Es Teh 5000 \n 2. Es Jeruk 6000 \n 3. Es Kopi 10000");
    String namaMakanan;
    String namaMinuman;
    int hargaMakanan = 0;
    int hargaMinuman = 0;
    int total = 0;
    boolean status = true;
    do {
    System.out.print("Masukkan Nomor Makanan Yang Ingin Dibeli :");

    int makanan = input.nextInt();
    System.out.print("Masukkan Nomor Minuman Yang Ingin Dibeli :");
    int minuman = input.nextInt();

    if(makanan == 1){
        namaMakanan = "Soto Ayam";
    } else if(makanan == 2) {
        namaMakanan = "Pecel";
    } else if(makanan == 3){
        namaMakanan = "Sate Ayam";
    } else if(makanan == 4) {
        namaMakanan = "Ayam Geprek";
    }
    else {
        namaMakanan = "undefined";
    }

    if(minuman == 1){
        namaMinuman = "Es Teh";
    } else if (minuman == 2){
        namaMinuman = "Es Jeruk";
    } else if(minuman == 3){
        namaMinuman = "Es Kopi";
    } else{
        namaMinuman = "undefined";
    }
    switch(makanan){
        case 0 :
        hargaMakanan = 0;
        total += hargaMakanan;
        break;
        case 1 :
        hargaMakanan = 15000;
        total += hargaMakanan;
        break;
        case 2 :
        hargaMakanan = 10000;
        total += hargaMakanan;
        break;
        case 3 :
        hargaMakanan = 10000;
        total += hargaMakanan;
        break;
        case 4 :
        hargaMakanan = 12000;
        total += hargaMakanan;
        break;
        default :
        hargaMakanan = 0;
    }
    switch(minuman){
        case 0 :
        hargaMinuman = 0;
        total += hargaMinuman;
        break;
        case 1 :
        hargaMinuman = 5000;
        total += hargaMinuman;
        break;
        case 2 :
        hargaMinuman = 6000;
        total += hargaMinuman;
        break;
        case 3 :
        hargaMinuman = 10000;
        total += hargaMinuman;
        break;
        default :
        hargaMinuman = 0;
    }
    System.out.println(makanan + "." + " Harga " + namaMakanan + " " + hargaMakanan);
    System.out.println(minuman + "." + " Harga " + namaMinuman + " " + hargaMinuman);
    System.out.println("Ingin Tambah Item? Yes/No");
    String confirm = input.next();
    if(confirm.equalsIgnoreCase("No")){
        status=false;
    } else {
        status = true;
    }    
    }while (status);
    System.out.println("Total = " + total);

    System.out.println("Masukkan Nominal Uang Anda");
    int Uang = input.nextInt();
    int kembalian = 0;

    if (Uang == total) {
        System.out.println("Uang Anda Pas");
    } else if (Uang >= total){
        kembalian = Uang - total;
        System.out.println("Uang anda Kembali : "+kembalian);
    } else {
        System.out.println("Uang Anda Kurang");
    }

    }
}


