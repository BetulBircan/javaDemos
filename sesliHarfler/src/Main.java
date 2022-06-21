import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	// Kalın ve ince sesli olan harfleri bulma;
        char harf = 'a';

        switch(harf) {
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'E':
            case 'e':
            case 'İ':
            case 'i':
            case 'Ö':
            case 'ö':
            case 'Ü':
            case 'ü':
                System.out.println("İnce Sesli Harf");
                break;
            default:
                System.out.println("Sesli Harf Değil");
        }

    }
}
