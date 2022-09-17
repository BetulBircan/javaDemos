# Javada Döngüler

Bir programımız için bazı olayların tekrarlanmasını isteyebiliriz. Java’da döngüler kullanarak gerçekleştireceğimiz bu tekrarlanan olaylar ile işlemlerimizi daha kolay 
bir şekilde gerçekleştirebiliriz. Döngü oluştururken belirleyeceğimiz koşul doğru olduğu sürece döngü içerisinde bulunan komut satırları çalışmaya devam eder. 
Koşul false bir değer vermeye başladığında ise döngü kırılır ve sonraki komut satırları çalışmaya devam eder.
## For Döngüsü

Java’da for döngüsü, oluşturacağımız döngüler içerisinde daha kolay bir tanımlama ve kontrol ayarı yapabileceğimiz döngü türüdür. For döngüsü içerisinde belirleyeceğimiz 
koşul doğru olduğu sürece içerisindeki kod satırları çalışır ve koşul sağlanmadığı takdirde diğer döngü türlerinde olduğu gibi işlem sonlandırılır.

For döngüsü şu şekilde işler: İlk olarak döngüde sayaç işlevi görecek bir değişken oluşturulur. Bu değişkenin ilk değeri [durum 1] ile belirtilen kısımda verilir. Bu 
değişken [durum 3] kısmında isteğe göre artırılır veya azaltılır. Döngünün hangi koşulda çalışacağı ise [durum 2] kısmında boolean bir ifadeyle belirtilir.

```
for (durum 1; durum 2; durum 3) {
  // çalışacak kod bloğu
}
```
**Örnek**

```
 for(int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
```

Burada 2 den başlayıp 2 şer 2 şer arttırarak 10 dahil 10 a kadar ekrana yazar

## While Döngüsü

While döngüsü Java'nın temel yapı taşlarından bir tanesidir. While terimini yazdıktan sonra yanına bir parantez açılıp kapatılır ve bu parantezler arasına boolean bir 
değer girilir. Sonrasında bir süslü parantez açılıp kapatılır ve bunun içine kod bloğu yazılır. Bu parantezler içindeki değer doğru(true) olduğu sürece döngü dönmeye 
devam eder ve kod bloğu çalışır.

While döngüsü söz dizimi şu şekildedir ;

```
  while(kosul){
   //kod bloğu
}
```

Burada belirtilen koşul, boolean bir ifadedir. Bu koşul true olduğu sürece döngü devam eder. Koşul false olursa döngü sonlanır. Koşul ifadesi parantez içine yazılır.
Eğer döngüye girecek kod tek satırdan oluşuyorsa blok açmaya gerek yoktur; fakat birden fazla satırdan oluşuyorsa mutlaka blok açılmalıdır.

**Örnek**

```
        int i = 20;

        while(i <= 10) {
            System.out.println(i);
            i+=2;
        }
```

Burada i nin başlangıç değeri 20 dir. i 10 dan küçük veya eşit olmadığı için döngüye girmez. Eğer i 2 olsaydı 2 den başlayıp 10 dahil 10 a kadar ekrana yazdıracaktı.

## Do-While Döngüsü

Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır , fakat while döngüsünde parantez içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır. Ama 
Do-while döngüsünde durum false olsa bile döngü en az bir kere çalışacaktır. Bu tür durumlar için Do-while kullanılır.

Java Do-While döngüsü söz dizimi şu şekildedir ;

```
do {
kodlar//
} while (kosul);
```

**Örnek**

```
int j = 100;
        do {
            System.out.println(j);
            j+=2;
        } while(j < 10);
```

Burada j 10 dan küçük değil. Fakat do-while dediğimiz için önce do kısmı çalışacak ve ekrana 100 değerini yazacaktır.

![loops](https://user-images.githubusercontent.com/86554799/190862788-f18a52a4-e9f9-47cf-b1e0-5a03f8064b1e.png)

