import java.util.Scanner;

public class MenuOwner {
    public static void owner(String username) {
        Scanner scanner = new Scanner(System.in);
        IDandPasswords employeedata = new IDandPasswords();
        System.out.println("Selamat datang di Menu Owner " + username);

        while(true){
        System.out.println("1. Lihat data penjualan");
        System.out.println("2. Manage data karyawan");
        System.out.println("3. Manage data inventaris");
        System.out.println("---------------------");

        System.out.print("Pilih dengan angka : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
            System.out.println();
                System.out.println("Belum ada");
                break;
            case 2:
            while (true) {
                System.out.println();
                                        System.out.println("Berikut ini adalah data-data karyawan");
                                        System.out.println();
                        employeedata.printEmployee();

                System.out.println("1. Edit data Karyawan");
                System.out.println("2. Hapus data Karyawan");
                System.out.println("0. Back");
                System.out.println();
            int subpilihan1 = scanner.nextInt();
            System.out.println();

                switch (subpilihan1) {
                    case 1:

                        break;
                    case 0:
                        // Back to previous menu
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
                if(subpilihan1 == 0) break;
                break;
            }
                break;
            default:
                throw new AssertionError();
        }
        
    }

    }
}
