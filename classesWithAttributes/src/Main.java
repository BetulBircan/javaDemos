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
        productManager.Add(product);
        System.out.println("Ürün Kodu: " + product.getCode());

        // System.out.println("Ürün Adı: " + product.name);
    }
}
