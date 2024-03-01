import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        int boyut = input.nextInt();
        int[] dizi = new int[boyut];
        int siralama;

        System.out.println("Dizinin elemanlarını giriniz.");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i+1) + ". Elemanı : ");
            int sayi = input.nextInt();
            dizi[i] = sayi;
        }

        for(int i = 0; i < boyut - 1; i++)
        {
            for(int j = i+1; j < boyut; j++)
            {
                if(dizi[j] < dizi[i]) {
                    siralama = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = siralama;
                }
            }
        }


        System.out.println("Sıralama : ");
        for (int i : dizi){
            System.out.print(i + " ");
        }

    }
}