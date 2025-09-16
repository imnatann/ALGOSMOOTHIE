import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IDandPasswords cUser = new IDandPasswords();
       
        System.out.println("Selamat datang di ALGOSMOOTHIE!"); 

        while (true){
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

        boolean statuslogin = cUser.authenticate(username, password);
        if(statuslogin == true){
            System.out.println("Selamat anda berhasil login !");
            break;
        }else{
            System.out.println("Login tidak valid");
        }
    }
}
}
