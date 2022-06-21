public class Main {

    public static void main(String[] args) {
        // Öğrencinin aldığı nota göre ekrana mesaj verme(Üniversite not sistemi)
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");


        }
    }
}
