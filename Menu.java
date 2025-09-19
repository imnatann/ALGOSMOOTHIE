import java.util.*;
class Smoothie {
        String namamenu;
        String deskripsi;
        double harga;
        String bahan[];
        char[] ukuran ;

        Smoothie(String n, String d, double h, String b[], char[] u){
            this.namamenu = n;
            this.deskripsi = d;
            this.harga = h;
            this.bahan = b;
            this.ukuran = u;
        }
    }
public class Menu {
    private final List<Smoothie> menus = new ArrayList<>(Arrays.asList(
        new Smoothie("Smoothie Pisang","Smoothie dengan rasa manis pisang asli", 53000,new String[]{"Pisang","Susu"},new char[] {'S','M','L'} ),
        new Smoothie("Smoothie Coklat","Smoothie dengan rasa manis coklat asli", 43000,new String[]{"Coklat","Susu"},new char[] {'S','M','L'} ),
        new Smoothie("Smoothie Stawberry","Smoothie dengan rasa manis stawberry asli", 47000,new String[]{"Pisang","Susu"},new char[] {'S','M','L'} )
    ));

    public void printMenus() {
        for (Smoothie s : menus) {
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

}
