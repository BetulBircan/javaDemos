# İnheritance

Kalıtım(Inheritance), bir sınıfın kendisine ait özellikleri ve işlevleri bir başka sınıfa aynen aktarması ya da bazı özellik ve işlevlerini diğer sınıfların kullanmasına 
izin vermesi şeklinde oluşmaktadır. Üst sınıf (Süper sınıf) özelliklerini alt sınıflarda kullanmak için extends deyimi ile kullanılırız.

**Bankada müşteri işlemleri ve ayın elemanının gösterimesi simülasyonu yapılmıştır.**

- Burada Person sınıfında bir kişiye ait özellikler bulunmaktadır. 

![inheritanceperson](https://user-images.githubusercontent.com/86554799/179218038-122eb116-4ee7-4dff-936c-45db71192024.jpg)

- Bir müşterinin id si, adı, soyadı, yaşı, email özellikleri bulunur. Yani Person sınıfındaki özellikler de bulunur. Bu özellikleri Person sınıfından miras alarak 
ortak bir şekilde kullanabiliriz.

![inheritancecustomer](https://user-images.githubusercontent.com/86554799/179218026-17e8c245-e76b-4ebd-a9d4-847775d359f5.jpg)

- Bir işçide de işçiye ait id si, adı, soyadı, yaşı, maaş bilgisi bulunmaktadır. Person sınıfında da maaş bilgisi hariç aynı özellikler bulunmaktadır. Burada da Person
sınıfından miras alıp ortak bir şekilde kullanabiliriz.

![inheritanceemployee](https://user-images.githubusercontent.com/86554799/179220355-22607690-cf33-4718-9c03-088cb6878206.jpg)

- Bir kişiyi ekleme ve bazı kişileri listeleme işlemleri yapmak için PersonManager adında bir sınıf oluşturulmuştur.

![inheritancepersonmanager](https://user-images.githubusercontent.com/86554799/179218052-a820982a-634a-4c5b-9cf1-27c166dd62b0.jpg)

- Müşteri işlemlerinde de ekleme ve listeleme işlemleri yapılabilir. Bunlar ortak olarak kullanılabilir. Bu yüzden CustomerManager PersonManagr ı miras almıştır.

![inheritancecustomermanager](https://user-images.githubusercontent.com/86554799/179218072-35936a85-6e09-42b7-ac74-d5a40a5d3fcb.jpg)

- Bankada bir çalışan da sisteme eklenebilir ve çalışanlar listelenebilir. Burada da PersonManager dan miras alarak işlemler ortak olarak kullanılabilir. Bu yüzden 
EmployeeMnager PersonManager ı miras almıştır. Bunun haricinde de ayın elemanını gösterme işlemi de yapılmıştır.

![inheritanceemployeemanager](https://user-images.githubusercontent.com/86554799/179218139-3d7722ea-cfda-4bff-aec1-5a6f9d2e4036.jpg)

Son olarak da ayın elemanının getirilmesi ve müşteri ekleme işlemleri ana ekranda yani main classında çağrılmıştır.

![inheritancemain](https://user-images.githubusercontent.com/86554799/179218011-c7fa18b7-9bf5-4e43-9a37-b63d16efd154.jpg)




