# Javada Çok Boyutlu Diziler
Java Çok Boyutlu Diziler, oluşturulurken tanımlanan veri tipine ait değerlerin tutulduğu, yüksek performans, verilerin güvenliği ve birden fazla satır ve sütunlardan 
oluşan yapılar için kullanılan bir kavramdır. Çok boyutlu dizi yapılarını x ve y koordinatlarına sahip bir yapı olarak düşünebiliriz. Oluşumu gereği satırı ve sütunları 
bulunan matrisler olarak da tanınır.

İhtiyaca göre oluşturulan çok boyutlu diziler oluştuğu yapı gereği iki boyutlu, üç boyutlu gibi isimlerde alabilir. Biz bu dizileri nasıl oluşturacağız, 
hangi dizi iki boyutlu hangi dizi üç boyutlu oluyor diye aklınızda bir soru işareti oluştuysa artık bir sonraki aşamamıza geçiş yapabiliriz.

## Çok Boyutlu Dizilerin Tanımlanması
Çok boyutlu dizilerin tanımlanması aslında tek bir tipten oluşmaz. Oluştururken dikkat etmemiz ve doğru uygulamamız gereken bazı püf noktaları vardır. 
En genel hatlarıyla çok boyutlu diziyi şu şekilde oluştururuz:

veriTipi diziAdı [satır][sütun] = new veriTipi [satırSayısı][sütunSayısı];

- Oluştururken ilk aşama olarak dizimizin hangi türlerde verilerin (int, string, double, vb.) tutulacağını belirlememiz gerekir.
- Daha sonra dizimizin ismini belirledikten sonra dizimizin oluşmasını istediğimiz boyut yapısına göre köşeli parantez ([]) oluştururuz.
- Bu aşamadan sonra dizi yapılarımızın içerisinde barındıracağımız eleman sayısı belliyse new anahtar sözcüğü ile dizimizi tanımlarız. Eğer eleman sayımız belli değilse 
bu dizimizin bir referansını oluştururuz.

![cokboyutludiziler](https://user-images.githubusercontent.com/86554799/190875743-2a8d3c56-22ee-4052-9922-3cb7104c1138.png)

![cokboyuludizilersonuc](https://user-images.githubusercontent.com/86554799/190875819-e4a7c1f9-af30-499e-8372-8a75403dd03e.png)
