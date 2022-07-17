# Polymorphisim Demo(Loglama)

**Polymorphisim:** Bir tek metot adıyla, birden çok farklı metotları koşturma özeliğine, java'da polymorphism denir. Şu önemli özeliği biliyoruz. 
Bir üst sınıfın referansı (işaretçi, pointer) bir alt sınıfa ait nesneyi işaret edebilir. Java, bu özelliği kullanarak, run-time aşamasında hangi overridden metodu
seçmesi gerektiğini bulur.

**Burada Email, Console, Dosya ve Veritabanına Loglama işlemi simüle edilmiştir.** 

- BaseLogger sınıfı oluşturulmuştur.

![polyphormismbaselogger](https://user-images.githubusercontent.com/86554799/179397959-cd508455-1ef3-4559-ab74-2d28b27820c1.jpg)

- Dosyaya loglama işlemleri için FileLogger sınıfı oluşturulmuştur.

![polyphormismfilelogger](https://user-images.githubusercontent.com/86554799/179398061-687cde8b-0bb2-4e78-9a82-d14444793b54.jpg)

- Emaile loglama işlemleri için EmailLogger sınfı oluşturulmuştur.

![polyphormismemaillogger](https://user-images.githubusercontent.com/86554799/179398119-1e6e678d-269b-41de-b742-5f6c5223b957.jpg)

- Veritabanına loglama işlemleri için DatabaseLogger sınıfı oluşturulmuştur.

![polyphormismdatabaselogger](https://user-images.githubusercontent.com/86554799/179398190-91d5b029-eeb9-4dc9-9001-8183c72d2d79.jpg)

- Console a loglama işlemleri için ConsoleLogger sınıfı oluşturulmuştur.

![polyphormismcondolelogger](https://user-images.githubusercontent.com/86554799/179398226-edb2fe61-89f6-465d-af48-50d00b60d00f.jpg)

- Müşteri işlemleri ve sonunda bu işlemleri loglamasının yapılması işlemleri için CustomerManager sınıfı oluşturulmuştur.

![polyphormismcustomermanager](https://user-images.githubusercontent.com/86554799/179398306-e09c24cd-9c66-4e34-b120-6a70a396e98a.jpg)


- Son olarak da Main classında Müşteri nesnesi oluşturulmuş ve müşteri eklemesi işlemi ve de dosyaya loglama işlemi için add fonksiyonu çağırılmıştır..


![polyphormismmain](https://user-images.githubusercontent.com/86554799/179398329-47261cec-13c9-48b0-a723-7f5c162f518b.jpg)


