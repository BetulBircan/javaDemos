public class Main {

    public static void main(String[] args) {
        //üç sayıdan en büyüğünü bulma programı
	    int sayi1 = 266;
        int sayi2 = 25;
        int sayi3 = 26;
        int enBuyuk = sayi1;

        //enbüyük değişkeni sayi1 kabul edilir. Eğer sayi2 den küçükse enbuyuk değişkenine sayi2 verilir.
        if(enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }

        //enbüyük değişkeni sayi1 kabul edilir. Eğer sayi2 den küçükse enbuyuk değişkenine sayi3 verilir.
        if(enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        /*şu anda da en büyük sayı sayi1 değişkeni olduğu için ve de enBuyuk değikeni başta sayi1 e eşit olduğu için
        ekrana sayi1 in değeri yazılır.*/
        System.out.println("En Büyük Sayı: " + enBuyuk);

    }
}
