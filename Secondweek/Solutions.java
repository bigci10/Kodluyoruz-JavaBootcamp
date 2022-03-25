public class Solutions {
    public static void main(String[] args) {
        /**
         * 1'den 10 a kadar olan sayılar içerisinde
         * 2 ile tam bölünenleri ekrana yazdır.
         */

        for (int i = 2; i <= 11; i+=2)
        {  
            System.out.println(i);
        }
      
          /**
         * Ödev:
         * Bu listedeki isimleri ekrana şu şekilde yazdır.
         * 1. Murat
         * 2. Ahmet
         * 3. Mehmet
         */
      
        String[] names = {"Murat", "Ahmet", "Mehmet"};

        int counter = 1;
        for(String name:names){
            System.out.println(counter+"."+name);
            counter++;
        }
      
    }
}
