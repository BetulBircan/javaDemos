# Classlarda Field ve Attributes Yapısı
**Field :** Bir class yada struct içinde tanımlanan her tipten değişkendir. Fieldlar onları içeren tiplerin üyeleridir. Fieldlar, birden fazla metodun erişim sağlaması 
gereken verileri saklarlar ve bu verinin saklanma zamanı herhangi bir metodun yaşam zamanından uzun olmalıdır.

```
//Attribute or field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String code;
```

**Encapsuşation(Kapsülleme) :** Java'da kapsülleme, sınıf içerisindeki metot ve değişkenlerin tek bir birim altında toplanması ve korunmasıdır. Kapsülleme sayesinde biz 
metotlarımızı ve değişkenlerimizi korunma amaçlı olması açısından gizleyebiliriz. Farklı sınıflardan, başka bir sınıfın değişkenlere müdahale edilmesini engellemek için 
kullanırız. Oluşturulan bir sınıf (class) içerisinde kullanıcının işlemlerini daha kolay gerçekleştirebilmesi için bazı işlemler birleştirilerek tek bir işlem gibi 
gösterilir. Bu birleştirme işlemine kapsülleme denir.

**Getter Setter :** Java'da başka bir classta tanımlanmış olan private değişkenlerin kullanılmasını sağlayarak data encapsulation durumunun sağlanmasına olanak tanıyan 
metodlara Setter ve Getter denir. Dilimizdeki karşılıkları: get: almak, set: vermek anlamındadır. Get return bir değer dönerken Set return değer dönmez.

```
//getter-read only
    public int getId() {
        return id;
    }

    //setter-write only
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
        return this.name.substring(0,1) + id;
    }
```

**Constructor** Oluşturulan sınıf yapılarının nesne olarak tanımlanması durumunda proje dosyasının alt yapısını hazırlayan, kurucu rol üstlenerek çeşitli ilk işlemleri
gerçekleştiren, kullanılan sınıf yapısı ile aynı isme sahip olan, geriye değer döndürmeyen özel metot yapılarıdır. apılandırıcıların (constructor) görevi oluşturulan 
nesneyi ilk kullanıma hazırlamasıdır. C# da tüm sınıflar (class) tanımlansın ya da tanımlanmasın değer tiplerine sıfır, referans tiplerine "null" değerini atayan 
varsayılan bir yapılandırıcı vardır.

```
public Product(int id, String name, String description, double price, int stockAmount, String color) {
        System.out.println("Yapıcı Blok Çalıştı");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;
    }

    //Overloading
    public Product() {

    }
```

**ProductManager.java**

```
public class ProductManager {
    public void add(Product product) {
        //JDBS-I will learn later and do it.
        System.out.println("Ürün Eklendi: " + product.getName());
    }

     /*public void Add2(int id, String name, String description, int stockAmount, double price, String renk) {

    }*/
}

```

**Main.java**

```
public class Main {

    public static void main(String[] args) {

        //Product's attribute
        Product product = new Product(1, "Laptop", "Huawei MateBook D16", 9000, 3,
                "Uzay Grisi");
//        Product product = new Product();
//        product.setId(1);
//        product.setName("Laptop");
//        product.setDescription("Huawei MateBook D16");
//        product.setPrice(9000);
//        product.setStockAmount(3);

        //Product's Managering
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println("Ürün Kodu: " + product.getCode());

        // System.out.println("Ürün Adı: " + product.name);
    }
}

```

![classattrşbutessonuc](https://user-images.githubusercontent.com/86554799/192640007-c24c8562-89ff-499a-a63a-fdf97ca83403.png)
