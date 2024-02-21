import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degiskenler tanimlandi.
        int matematik, fizik, turkce, kimya, muzik, i = 0;
        double average;

        // Scanner nesnesi projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan not bilgisi alinip ilgili degiskene ataniyor.
        // Eger bu not 1 ile 100 arasinda degil ise sayacimiz bir artiyor ve ayrica bu dersin notu kullanici
        // girisi ardindan 0 lanarak ortalamayi etkilememesi saglaniyor.

        System.out.print("\nMatematik notunuzu giriniz: ");
        matematik = input.nextInt();
        if (0 <= matematik && matematik <= 100) {
            i++;
        } else {
            matematik = 0;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (0 <= fizik && fizik <= 100) {
            i++;
        } else {
            fizik = 0;
        }

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        if (0 <= turkce && turkce <= 100) {
            i++;
        } else {
            turkce = 0;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (0 <= kimya && kimya <= 100) {
            i++;
        } else {
            kimya = 0;
        }

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (0 <= muzik && muzik <= 100) {
            i++;
        } else {
            muzik = 0;
        }

        i = (i == 0) ? 1 : i;

        // Averaj alinirken bolen kismindan sayac belirtiliyor.
        // Sebebi ise istenen aralikta girilmeyen notlar yukarida 0 lanmisti. Yani ortalamaya etkileri olmayacak.
        // Ortalamaya etki edebilecek ders sayisini i sayacimiz ile esitlemistik.
        average = (matematik + fizik + turkce + kimya + muzik) / i;

        // Kullaniciya kaldigi veya gectigi bilgisi iletiliyor.
        if (average < 55) {
            System.out.print("\nBasarisiz.\nOrtalaman: " + average);
        } else {
            System.out.print("\mBasarili..\nOrtalaman: " + average);
        }
    }
}