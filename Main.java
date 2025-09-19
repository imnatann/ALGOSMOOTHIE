import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IDandPasswords cUser = new IDandPasswords();

        int pilihan;
        System.out.println("Selamat datang di ALGOSMOOTHIE!"); 
        System.out.println();
        System.out.println("1. Login"); 
        System.out.println("2. Menu Customer"); 
        System.out.println();
        while(true){
        System.out.print("Pilih dengan angka : "); 
        if(scanner.hasNextInt()){
        pilihan = scanner.nextInt();
        scanner.nextLine();
        break;
        }else{System.out.println("Input harus berupa angka !");}
        scanner.nextLine();    
    }
    System.out.println();

        if(pilihan==2){
            MenuCustomer menuCustomer = new MenuCustomer();
            menuCustomer.cust(args);
            
        }else{ while (true){
        String username;
        while (true) {
            System.out.print("Masukan Username : ");
            username = scanner.nextLine();
            if (!username.isEmpty()) {
                break;
            } else {
                System.out.println("Username tidak boleh kosong !");
            }
        }
        
        String password;
        while(true) {
        System.out.print("Masukan Password : ");
        password = scanner.nextLine();
        if(!password.isEmpty()){
            break;
        }else{
            System.out.println("Password tidak boleh kosong !");
        }
        }
        System.out.println();

        boolean statuslogin = cUser.authenticate(username, password);
        if(statuslogin == true){
            System.out.println("Selamat anda berhasil login !");
            System.out.println();
            String getRole = cUser.getRole(username, password);
            String getUsername = cUser.getUsername(username, password);

         
        switch (getRole) {
            case "Owner":
            MenuOwner menuOwner = new MenuOwner();
            menuOwner.owner(username);
            break;

             case "Kasir":
            MenuKasir menuKasir = new MenuKasir();
            menuKasir.kasir(username);
            break;

  

            default:
            throw new AssertionError();
        }
        break;
        }else{
            System.out.println("Login tidak valid");
        }}
       

        
        
    
}
}}
