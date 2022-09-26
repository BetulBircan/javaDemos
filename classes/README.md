# Java'da Class Yapısı
- Java'da Sınıflar bir problemi soyutlamak ve genelleştirmek için kullanılan yapılardır veya kılavuzlardır. Sınıflar, bir nesneye ait tüm özellikleri temsil eder. Bu 
özellikler nesnenin ne tür nitelikleri ve davranışları olacağını belirler.

- Java'da "sınıf" tanımlanırken "class" deyimi kullanılır ve sonrasında sınıf ismi yazılır. Java'da sınıf isimleri her zaman büyük harf ile başlaması gerekmektedir ve 
oluşturulan Java dosyası ile aynı isimde olmalıdır.Sınıf ismini de verdikten sonra "{" işareti ile sınıfa ait kapsamı yani kod bloğunu oluştururuz. "}" parantezi ile de
sınıfa ait kapsamı kapatırız. Böylece, sınıfımız için yazacağımız kodlar "{}" arasında kalan alanda yazılacaktır. Bu da sınıfın kapsamını ifade eder.

Sınıf deklarasyonunu şu şekilde yapılır :

`sinifAdi nesneAdi = new sinifAdi();`
               
 **sinifAdi**, ilgili sınıfın adıdır. nesneAdi, nesnemizin adıdır. “new sinifAdi();” ifadesi ise nesnemizin oluşturulduğu yerdir. Aslında yalnız bu ifadeyi 
 yazarsanız da nesnemiz bellekte bir yerlerde oluşturulur. Ancak bu nesnemizle ileride işlemler yapacağımız için, belli bir ulaşabileceğimiz adresi olması 
 gerekli. İşte bu adres de “nesneAdi” dediğimiz değişkendir. Bu değişken üzerinden nesnemize ulaşırız ve ilgili işlemleri yaparız.
 
![customerManager ](https://user-images.githubusercontent.com/86554799/192372112-4a4e735b-f873-4b94-9895-5db6221a618b.png)

![mainclass](https://user-images.githubusercontent.com/86554799/192371287-0b443fbc-2b1e-4ef9-a7eb-ff1aaaef21d8.png)

## Java'da Değer ve Referans Tiplerini Anlama
-  Referans tiplerde değişkenlerin adresleri tutulur. Java’da pointer kavramı yoktur. Bu yüzden referans değişkenler kullanılır. Her değişken, bir değeri tutan bir bellek
yerini temsil eder. Bir değişken bildirdiğimizde, derleyiciye değişkenin ne tür bir değer tutabileceğini söyleriz. Temel veri tipindeki bir değişken için, değer temel 
veri tipindedir. Bir referans tipi değişkeni için, değer, bir nesnenin bulunduğu yere referanstır.
 
![mainclassdegervereferanstip](https://user-images.githubusercontent.com/86554799/192372197-86aad637-ddf2-4505-815c-9d2f5ea010a6.png)

![classessonuc](https://user-images.githubusercontent.com/86554799/192376520-591432a5-77d3-4a77-9d8a-24ce5393f54d.png)
