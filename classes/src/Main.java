public class Main {

    public static void main(String[] args) {
	// classes
        //Classes are reference types.
//        CustomerManager customerManager ;  -->If customerManager and customerManager2 are equals, we can use it.
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value types
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // Arrays are referance types.
        int[] sayilar1 = new int[] {1, 2, 3};
        int[] sayilar2 = new int[] {4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }
}
