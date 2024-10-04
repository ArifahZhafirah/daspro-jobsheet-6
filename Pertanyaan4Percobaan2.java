// import java.util.Scanner;
// /**
//  * Pemilihan2Percobaan204
//  */
// public class Pemilihan2Percobaan204 {
//     public static void main(String[] args) {
//         Scanner input04 = new Scanner(System.in);

//         String member;
//         int pilihan_menu;
//         double diskon, total_bayar, harga;

//         System.out.println("_________________________");
//         System.out.println("===== MENU KAFE JTI =====");
//         System.out.println("_________________________");
//         System.out.println("1. Ricebowl");
//         System.out.println("2. Ice Tea");
//         System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
//         System.out.println("_____________________________________");
//         System.out.println("Masukkan angka dari menu yang dipilih = ");
//         pilihan_menu = input04.nextInt();
//         input04.nextLine();
//         System.out.println("Apakah punya member (y/n) ? = ");
//         member = input04.nextLine();
//         System.out.println("________________________________________");

//         if (member.equalsIgnoreCase("y")) {
//             diskon = 0.10;
//             System.out.println("Besar diskon = 10% ");
//             if (pilihan_menu == 1) {
//                 harga = 14000;
//                 System.out.println("Harga ricebowl = " + harga);

//             } else if (pilihan_menu == 2){
//                 harga = 3000;
//                 System.out.println("Harga ice tea = " + harga);

//             }else if (pilihan_menu == 3){
//                 harga = 15000;
//                 System.out.println("Harga bundling = " + harga);

//             }else {
//                 System.out.println("Masukkan pilihan menu dengan benar");
//                 return;
//             }
//             total_bayar = harga - (harga * diskon);
//             System.out.println("total bayar setelah diskon = " + total_bayar);
//         }

//         else if (member.equalsIgnoreCase("n")) {
//             if (pilihan_menu == 1){
//                 harga = 14000;
//                 System.out.println("Harga ricebowl = " + harga);

//             }else if (pilihan_menu == 2) {
//                 harga = 3000;
//                 System.out.println("Harga ice tea = " + harga);

//             }else if (pilihan_menu == 3) {
//                 harga = 15000;
//                 System.out.println("Harga bundling = " + harga);

//             }else{
//                 System.out.println("Masukkan pilihan menu dengan benar");
//                 return;
//             }
//             System.out.println("Total bayar = " + harga);

//         }else {
//             System.out.println("Member tidak valid");
//         }
//         System.out.println("__________________________________________");
//     }
    
// }

import java.util.Scanner;

public class Pertanyaan4Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        byte pilihan_menu;
        String member;
        double diskon, harga, totalBayar;
        
        System.out.println("-----------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-----------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input.nextByte();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.next();
        System.out.print("Metode Pembayaran (QRIS/ Lainnya) = ");
        String metodePembayaran = input.next();
        System.out.println("-----------------------------");
        
       
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10; 
            System.out.println("Besar diskon= 10% ");
        } else if (member.equalsIgnoreCase("n")) {
            diskon = 0.0; 
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = Rp" + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = Rp" + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = Rp" + harga);
        } else {
            System.out.println("Masukkan menu yang benar");
            return;
        }

        totalBayar = harga - (harga * diskon);
        if (metodePembayaran.equalsIgnoreCase("QRIS")) {
            totalBayar -= 1000; 
        }
        System.out.println("Total bayar = Rp" + totalBayar);
        System.out.println("-------------------------------------");
        
      
    }
}