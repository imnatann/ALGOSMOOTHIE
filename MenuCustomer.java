import java.util.Scanner;
public class MenuCustomer {

    public static void cust(String[] args) {
        Menu fungsiMenu = new Menu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di AlgoSmoothie");
        System.out.println("---------------------");
while(true){
        fungsiMenu.printMenus();
        fungsiMenu.chooseMenu();
}
        
    }
}
