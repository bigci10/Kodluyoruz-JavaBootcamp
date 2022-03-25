/**
     * Sinema bileti satışı:
     * ücret hesaplama: 18 yaş altı için %10 indirimli.
     * 18 ve 25 yaş arası % 5 indirim.
     * Korku filmi seçilmişse ekstra % 10 indirim.
     */

public class Solution {
    public static void main(String[] args) {
        sinema(18, 50, "Korku");
        sinema(18, 50, "Aksiyon");
    
    }

     static void sinema(int age,int price,String genre) {

        if (genre.equals("Korku")) {
            if (age < 18) {
                System.out.println("Toplam ücret" + (price * 0.90) * 0.90);
            } else if (age >= 18 && age <= 25) {
                System.out.println("Toplam ücret" + (price * 0.95) * 0.90);
            }
        }
        else {
            if (age < 18) {
                System.out.println("Toplam ücret" + (price * 0.90));
            }
            else if (age >= 18 && age <= 25) {
                    System.out.println("Toplam ücret" + (price * 0.95));
            }


        }
    }
}
