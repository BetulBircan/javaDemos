# Overriding

Java Overriding, programlarımızda kullandığımız kalıtım sayesinde üst sınıftan, alt sınıfa geçecek metotların o sınıf yapısına uygun bir şekilde tekrardan gövdesinin
değiştirilmesine ve kod satırlarının yeniden şekil almasına olanak sağlayayn yapıdır.

**Burada kredi hesaplaması işleminin öğrenci, tarım ve öğretmen kredisine göre yapılması simüle edilmiştir.**

- İlk başta her kredide geçerli olabilmesi için BaseKrediManager sınıfı oluşturulmuştur.

![overridinBaseKrediManager](https://user-images.githubusercontent.com/86554799/179399333-4686194f-1edb-478a-9568-6f2397e8dbf4.jpg)

- Tarım ve Öğretmen Kredi hesaplaması işlemleri için TarımKrediManager ve OgretmenKrediManager sınıfları oluşturulmuştur ve BaseKrediManager sınıfından miras almıştır.

**TarımKrediManager**

![overridingTarimKrediManager](https://user-images.githubusercontent.com/86554799/179399453-acb4a2bc-f10b-45c9-96af-433d1f2398c0.jpg)

**OgretmenKrediManager**

![overridingOgretmenKrediManager](https://user-images.githubusercontent.com/86554799/179399471-9ddbc439-62e1-483d-a8b5-e8b9a7428d73.jpg)

- Öğrenci Kredi Hesaplaması işlemleri için OgrenciKrediManager sınıfı oluşturulmuştur. Burada BaseKrediManager sınıfından miras almıştır fakat bu sefer başka bir oranda
kredisinin hesaplanması istenmiştir. Burada overriding işlemi yapılmıştır.

![overridingOgrenciKrediManager](https://user-images.githubusercontent.com/86554799/179399639-2b1e4cb7-9b2a-44b4-92f2-f50275cb850e.jpg)

- Son olarak da tutarı 100 tl olarak tarım, öğretmen ve öğrenci kredi hesaplamaları Main classında yapılmıştır.

![overridingmain](https://user-images.githubusercontent.com/86554799/179399748-1214b3d4-813a-4646-b3a7-768fcbf0376d.jpg)

