import java.util.Scanner;
public class MenuCustomer {

    public static void cust(String[] args) {
        Menu fungsiMenu = new Menu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di AlgoSmoothie");
        System.out.println("---------------------");

        fungsiMenu.printMenus();
        System.out.print("Pilih Menu Dengan Angka : ");
        int pilihan = scanner.nextInt();

        
        
    }
}
