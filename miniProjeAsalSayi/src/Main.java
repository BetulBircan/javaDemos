public class Main {
    public static void main(String[] args)
    {
        int number = 15;
        boolean isPrime = true; //varsayılan olarak asal sayı olduğunu belirttik.

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