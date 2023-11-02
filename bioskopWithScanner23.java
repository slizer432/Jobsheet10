import java.util.Scanner;

public class bioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        int menu;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("opsi: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    if (baris > penonton.length || kolom > penonton[0].length) {
                        System.out.println("Kursi tidak tersedia");
                        continue;
                    }
                    
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("mohon maaf, kursi sudah terisi");
                        continue;
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
        
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                    break;

                case 2:

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                            continue;
                        }
                        System.out.print(penonton[i][j]+"\t");
                    }
                    System.out.println(" ");
                }
                    break;
                
                case 3:
                System.exit(0);
                break;
            }
        }
    }
}
