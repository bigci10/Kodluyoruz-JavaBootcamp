public class Main {
    public static void main(String[] args) {
        Cherry cherry = new Cherry("Kiraz",2,4);
        Pear pear = new Pear("Armut",30,3);
        Apple apple = new Apple("Elma",12,3);


        /*
         * Manav'dan online alışveriş yapılıyor.
         */
        cherry.sell(3);
        pear.sell(4);
        apple.sell(2);


        /*
         * Manav'dan online alışveriş yaptıktan sonra stoktaki mallar güncelleniyor.
         */
        cherry.getstockControl();
        pear.getstockControl();
        apple.getstockControl();

    }
}
