# Javada Metotlar
Java’da metotlar, belirli işlemleri gerçekleştirmemizi sağlayan talimatlar bütünüdür. Java’da metotlar sayesinde kodun yeniden kullanılabilirliğini sağlayabiliriz veya 
kodu kolaylıkla değiştirebiliriz. Metotları tanımladıktan sonra programımız içerisinde çağrılana kadar herhangi bir işlem yapılmaz. Yani o metodu kullanabilmemiz için 
çağırmamız gerekmektedir. 

```
ErisimBelirleyici DönüsTipi MetotAdı (Parametre listesi)
    {
        //metot gövdesi
    }

```

- ErisimBelirleyici: Metodumuza nasıl erişeceğimizi belirtir.
- DönüsTipi: Metotdan dönecek olan değerin türüdür. int, String gibi türler belirtebiliriz.
- MetotAdı: Metoda verilecek olan isimdir. Metot adımızı çağırmak istediğimizde kullanacağız.
- Parametre listesi: Gönderilecek olan değişkenleri belirtiriz.
- Metot gövdesi: Metodun içerisinde gerçekleştirilecek olan işlemler yazılır.

**NOT :** Javada main metodundan itibaren çalışmaya başlar.

```
public static void main(String[] args) {

}
```

```
public class Main {

    public static void main(String[] args) {
        //Farklı ekrana yazdık olarak düşünülebilir
        sayiBulmaca();  //Metodu böyle çağırıyoruz.

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

```

![methodssonuc](https://user-images.githubusercontent.com/86554799/192343992-c5a23cd8-009c-4d53-a0bc-2e65243c022d.png)


