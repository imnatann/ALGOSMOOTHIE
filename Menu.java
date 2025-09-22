import java.util.*;
class Smoothie {
        String idmenu;
        String namamenu;
        String deskripsi;
        double harga;
        String bahan[];
        char[] ukuran ;

        Smoothie(String i, String n, String d, double h, String b[], char[] u){
            this.idmenu = i;
            this.namamenu = n;
            this.deskripsi = d;
            this.harga = h;
            this.bahan = b;
            this.ukuran = u;
        }
    }
public class Menu {
    private final List<Smoothie> menus = new ArrayList<>(Arrays.asList(
        new Smoothie("S001","Smoothie Pisang","Smoothie dengan rasa manis pisang asli", 53000,new String[]{"Pisang","Susu"},new char[] {'S','M','L'} ),
        new Smoothie("S002","Smoothie Coklat","Smoothie dengan rasa manis coklat asli", 43000,new String[]{"Coklat","Susu"},new char[] {'S','M','L'} ),
        new Smoothie("S003","Smoothie Stawberry","Smoothie dengan rasa manis stawberry asli", 47000,new String[]{"Pisang","Susu"},new char[] {'S','M','L'} )
    ));
    public void printMenus() {
        for (Smoothie s : menus) {
            System.out.println("No : " + s.idmenu);
            System.out.println("Nama Menu: " + s.namamenu);
            System.out.println("Deskripsi: " + s.deskripsi);
            System.out.println("Harga: " + s.harga);
            System.out.print("Bahan: ");
            for (String b : s.bahan) {
                System.out.print(b + " ");
            }
            System.out.println();
            System.out.print("Ukuran: ");
            for (char u : s.ukuran) {
                System.out.print(u + " ");
            }
            System.out.println("\n---------------------");
        }
    }

    public void chooseMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan ID Menu yang ingin dipilih : ");
        String pilihan = scanner.nextLine();
        System.out.println();
        boolean found = false;
        for (Smoothie s : menus ){
            
            if(s.idmenu.equalsIgnoreCase(pilihan)){
                System.out.println("Ini adalah menu yang kamu pilih !");
                 System.out.println("No : " + s.idmenu);
            System.out.println("Nama Menu: " + s.namamenu);
            System.out.println("Deskripsi: " + s.deskripsi);
            System.out.println("Harga: " + s.harga);
            System.out.print("Bahan: ");
            for (String b : s.bahan) {
                System.out.print(b + " ");
            }
            System.out.println();
            System.out.print("Ukuran: ");
            for (char u : s.ukuran) {
                System.out.print(u + " ");
            }
            System.out.println("\n---------------------");
            found = true;
            }
            if(!found){
            System.out.println("Menu tidak ditemukan !");            }
        }
    }

}
