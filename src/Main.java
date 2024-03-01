import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] [] kisiler = {
                {"Fatih Balkı","54154154541"},
                {"İlke Ökmen","54154154642"},

        };
        Scanner input = new Scanner(System.in);
        for (;;){
            System.out.print("İsim - Soyisim Giriniz (Çıkış için q/Q Tuşuna Basınız): ");
            String isimSoyisim = input.nextLine();
            if (isimSoyisim.equalsIgnoreCase("q")){
                System.out.println("Programdan Çıkış Yapılıyor...!!!");
                break;
            }
            boolean bulundu = false;
            for (String[] kisi:kisiler){
                if (kisi[0].equalsIgnoreCase(isimSoyisim)){
                    bulundu = true;
                    String tcNoKisi = kisi[1].substring(0,8);
                    String sonuc =tcNoKisi + "***";
                    System.out.println("TC Kimlik No: "+ sonuc);
                    System.out.println("Son 3 Rakamı Doğru Şekildi Giriniz ve Onaylamak için Enter Tuşuna Basınız: ");
                    String onay = input.nextLine();
                    if (onay.equals(kisi[1].substring(8))){
                        System.out.println("Doğru Giriş Yaptınız...!!!");
                    }else {
                        System.out.println("Hata: TC kimlik No Yanlış Girildi.");
                    }
                }break;
            }
            if (!bulundu){
                System.out.println("Hata: Kişi Bulunamadı.");
            }
        }
    }

}