public class Main {

    public static void main(String[] args) {
        //Farklı ekrana yazdık olarak düşünülebilir
        sayiBulmaca();

        //Farklı ekrana yazdık olarak düşünülebilir
        sayiBulmaca();

        //Farklı ekrana yazdık olarak düşünülebilir
        sayiBulmaca();

        //Farklı ekrana yazdık olarak düşünülebilir
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        // methods
        int[] sayilar = new int[]{1, 2, 5, 7, 0, 0};
        int aranacak = 6;
        boolean varMi = false;

        for(int sayi : sayilar) {
            if(sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        String mesaj = "";
        if(varMi) {
            mesaj = "Sayı Mevcut: " + aranacak;
            mesajVer(mesaj);
        }
        else {
            mesajVer("Sayı Mevcut Değildir: " + aranacak);
        }
    }
    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
