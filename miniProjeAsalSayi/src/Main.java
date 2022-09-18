public class Main {
    public static void main(String[] args)
    {
        int number = 15;
        boolean isPrime = true; //varsayılan olarak asal sayı olduğunu belirttik.

        if(number == 1) {   //Asal sayılar 2 den başlar.  bu yüzden 1 asal sayı değildir.
            System.out.println("Sayı Asal Değildir");
            return; //devamı ile ilgilenme burada bitir demek
        }

        if(number < 1) {
            System.out.println("Geçersiz Sayı");
            return;
        }

        //asal sayılarda en küçük sayı 2 dir bu yüzden döngü 2 den başlar
        for(int i = 2; i < number; i++) {

            if(number % i == 0) {
                isPrime = false;
            }

        }

        if(isPrime) {
            System.out.println("Sayı Asaldır.");
        } else {
            System.out.println("Sayı Asal Değildir.");
        }
    }
}