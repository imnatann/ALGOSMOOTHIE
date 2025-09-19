import java.util.Scanner;

public class MenuOwner {
    public static void owner(String username) {
        Scanner scanner = new Scanner(System.in);
        IDandPasswords employeedata = new IDandPasswords();
        System.out.println("Selamat datang di Menu Owner " + username);
        System.out.println("1. Lihat data penjualan");
        System.out.println("2. Manage data karyawan");
        System.out.println("3. Manage data inventaris");
        System.out.println("---------------------");

        System.out.print("Pilih dengan angka : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Belum ada");
                break;
            case 2:

            System.out.println("Berikut ini adalah data-data karyawan");
                    employeedata.printEmployee();
                break;
            default:
                throw new AssertionError();
        }
        


    }
}
