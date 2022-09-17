# Switch-Case Yapısı
Java'da birden çok kod bloğunu koşullara bağlamak için "switch" deyimi kullanılır. Switch Case; tanımlanmış olan yalnızca bir değişkenin, alacağı değerlere bağlı olarak, 
farklı sonuçlar döndürmesini sağlayan bir yapıdır. Switch kısmında kullanılacak olan değişkenler byte, short, int, char veya String veri tipine sahip olmalıdır.

## Sözdizimi (Syntax)


    
    switch(değer) {
    case x:
        // değer x'e eşitse bu kod bloğu çalışacak
        break;
    case y:
        // değer y'ye eşitse bu kod bloğu çalışacak
        break;
    default:
        // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
        }


Burada dikkat edilmesi gereken durum switch içine yazdığımız değerleri case deyimi ile kontrol ediyoruz. Switch içinde ki herhangi bir değer caselerden biri ile 
uyuşuyorsa o case içindeki kod bloğu çalışır.

![switchdemo](https://user-images.githubusercontent.com/86554799/190861133-97f4aeb0-180e-4bb6-91ee-28cc61fb3cef.png)
