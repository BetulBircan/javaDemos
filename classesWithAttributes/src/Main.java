public class Main {

    public static void main(String[] args) {
        //Product's attribute
        Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.description = "Huawei MateBook D16";
        product.price = 9000;
        product.stockAmount = 3;

        //Product's Managering
        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        // System.out.println("Ürün Adı: " + product.name);
    }
}
