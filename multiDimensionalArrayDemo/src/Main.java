public class Main {

    public static void main(String[] args) {
	// çok boyutlu diziler örneği
        String[][] sehirler = new String[3][3];

        //Marmara Bölgesi
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";

        //İç Anadolu Bölgesi
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";

        //Güney Doğu Anadolu Bölgesi
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        //Elemanları yazdırma
        for(int i = 0; i <= 2; i++) {
            System.out.println("----------------------");
            for(int j = 0; j <= 2; j++ ) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
