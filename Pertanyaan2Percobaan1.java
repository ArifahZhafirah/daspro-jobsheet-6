// import java.util.Scanner;
// /**
//  * Pemilihan2Percobaan104
//  */
// public class Pemilihan2Percobaan104 {
//     public static void main(String[] args) {
//         Scanner input04 = new Scanner(System.in);
    
//         int tahun; 
//         System.out.print("Masukkan tahun ");
//         tahun = input04.nextInt();

//         if ((tahun % 4) == 0 ) {
//             if ((tahun % 100) != 0)
//             System.out.println( "Tahun Kabisat ");
//         } else 
//             System.out.println(" Bukan Tahun Kabisat ");

//     }
    
// }

// import java.util.Scanner;

// public class Pertanyaan1Percobaan1 {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int tahun;

//         System.out.println("Masukkan tahun:");
//         tahun = input.nextInt();

//         if (tahun % 4 == 0) {           
//             if (tahun % 100 == 0) {
//                 if (tahun % 400 == 0) { 
//                     System.out.println("Tahun kabisat");
//                 } else { 
//                     System.out.println("Bukan tahun kabisat");
//                 }
//             } else { 
//                 System.out.println("Tahun kabisat");
//             }
//         } else { 
//             System.out.println("Bukan tahun kabisat");
//         }
//     }
// }

import java.util.Scanner;

public class Pertanyaan2Percobaan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan tahun:");
        tahun = input.nextInt();

        if (tahun % 4 == 0) {           
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) { 
                    System.out.println("Tahun kabisat");
                } else { 
                    System.out.println("Bukan tahun kabisat");
                }
            } else { 
                System.out.println("Tahun kabisat");
            }
        } else { 
            System.out.println("Bukan tahun kabisat");
        }
    }
}