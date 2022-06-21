public class Main {

    public static void main(String[] args) {
	// Arkadaş Sayılar 220-284
        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for(int i = 1; i < number1; i++) {
            if(number1 % i == 0) {
                total1 = total1 + i;
            }
        }

        for(int j = 1; j < number2; j++) {
            if(number2 % j == 0) {
                total2 = total2 + j;
            }
        }

        if(number1 == total2 && number2 == total1) {
            System.out.println("Bu İki Sayı Arkadaştır");
        }
        else {
            System.out.println("Bu İki Sayı Arkadaş Değildir");
        }

        /*int sayi1 = 220;
        int sayi2 = 284;
        int total1 = 0;
        int total2 = 0;

        for(int i = 1; i < sayi1; i++) {
            if(sayi1 % i == 0)
            total1 = total1 + i;
        }
        for(int j = 1; j < sayi2; j++) {
            if(sayi2 % j == 0)
            total2 = total2 + j;
        }

        if(sayi1 == total2) {
            if(sayi2 == total1) {
                System.out.println("Arkadaş Sayı");
            }
        }
        else {
            System.out.println("Arkadaş Sayı Değil");
        }*/

    }
}
