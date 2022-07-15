# İnheritance Demo(Kredi Hesaplama Örneği)

**Burada Tarım Kredi, Öğretmen Kredi vb. Krediler için Kredi Örneklemeleri Yapılmıştır.**

- Kredi hesaplamasının yapılacağı işlemler için BaseKrediManager sınıfı oluşturulmuştur.

![inheritancedemobasekredimanager](https://user-images.githubusercontent.com/86554799/179233322-f5614979-4584-4718-97f6-bd324a8af607.jpg)

- Öğretmen Kredisi hesaplama işlemleri içim OgretmenKrediManger sınıfı olulturulmuştur ve BaseKrediManager sınıfından miras almıştır.

![inheritancedemoogretmenkredimanager](https://user-images.githubusercontent.com/86554799/179233338-10782da6-8355-4f3a-a27b-2734a4fcf455.jpg)

- Tarım Kredisi hesaplama işlemleri için TarimKrediManager sınıfı oluşturulmuştur ve BaseKrediManager sınıfından miras almıştır.

![inheritancedemotarimkredimanager](https://user-images.githubusercontent.com/86554799/179233372-6f68fb72-8a55-43da-a5eb-d476b288491b.jpg)

- Asker Kredisi hesaplama işlemleri için AskerKrediManager sınıfı oluşturulmuştur ve BaseKrediManager sınıfından miras almıştır.

![inheritancedemoaskerkredimanager](https://user-images.githubusercontent.com/86554799/179235237-92f80ca8-8c19-4d4b-8b87-27ac041e77fb.jpg)

- Kredi işlemleri için KrediUi sınıfı oluşturulmuştur.

![inheritancedemokrediui](https://user-images.githubusercontent.com/86554799/179233441-c37effa6-6d0b-4746-9fc3-bcac0081f0e6.jpg)

- Son olarak Hangi kredi hesaplancaksa KrediUI da onu parametre olarak gönderilip oluşturulan kısım ana ekranda yani Main classında çağırılmıştır

![inheritancedemomain](https://user-images.githubusercontent.com/86554799/179233305-7fe54c5c-c990-4853-a34b-a81813655c06.jpg)



