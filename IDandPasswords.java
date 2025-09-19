import java.util.*;

//Anggep aja kayak schema Prisma
class User {

    String username;
    String password;
    String role;

    User(String u, String p, String r) {
        this.username = u;
        this.password = p;
        this.role = r;
    }
}

public class IDandPasswords {
    private final List<User> users= new ArrayList<>(Arrays.asList(
    new User("Natan","Natan123","Owner"),
    new User("Dhina","Dhina123","Kasir"),
    new User("Nasya","Nasya123","Kasir"),
    new User("Wisman","Wisman123","Kasir"),
    new User("Jeslyn","Jeslyn123","Kasir")
    ));

    public String getRole(String user, String password){
        for (User u : users) {
            if(u.username.equals(user) && u.password.equals(password)){
                return u.role ;
            }
        }
        return null;
    }
     public String getUsername(String user, String password){
        for (User u : users) {
            if(u.username.equals(user) && u.password.equals(password)){
                return u.username;
            }
        }
        return null;
    }

    public void printEmployee(){
        for (User u : users ){
            if(u.role == "Kasir"){
                System.out.println("Nama Karyawan : " + u.username);
                System.out.println("Job : " + u.role);
            System.out.println("\n---------------------");
            }
        }
    }
    //fungsi login
    public boolean authenticate(String user, String pass) {
        for (User u : users) {
            if(u.username.equals(user)&& u.password.equals(pass)){
                return true;
                

            }
        }
        return false;
    }
}

    
