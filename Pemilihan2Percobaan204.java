import java.util.Scanner;

/**
 * Pemilihan2Percobaan204
 */
public class Pemilihan2Percobaan204 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        String member;
        int pilihan_menu;
        double diskon, total_bayar, harga;

        System.out.println("_________________________");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("_________________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("_____________________________________");
        System.out.println("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input04.nextInt();
        input04.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input04.nextLine();
        System.out.println("________________________________________");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10% ");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            }else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("total bayar setelah diskon = " + total_bayar);
        }

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);

        }else {
            System.out.println("Member tidak valid");
        }
        System.out.println("__________________________________________");
    }
    
}