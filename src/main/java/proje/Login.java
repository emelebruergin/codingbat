package proje;

import java.util.Scanner;

public class Login {
        /*
   Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

    menü: kullanıcıya işlem seçimi için menü gösterilir.

    üye olma(register) : kullanıcıdan ad-soyad ,kullanıcı adı, email ve şifre bilgileri alınız.
                         kullanıcı adı,email ve şifre birer listede tutulur.
                         aynı kullanıcı adı veya email kabul edilmez.

    giriş(login): kullanıcı adı/email ve şifre girilir.
                  kullanıcı adı veya email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                  kullanıcı adı/email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

   email validation: boşluk içermemeli
                     @ içermeli
                     gmail.com , hotmail.com  veya yahoo.com ile bitmeli.
                     mailin kullanıcı adı kısmında (@ dan önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

   password validation: boşluk içermemeli
                        en az 6 karakter olmalı
                        en az bir tane küçük harf içermeli
                        en az bir tane büyük harf içermeli
                        en az bir tane rakam içermeli
                        en az bir tane sembol içermeli
     */
        public static void main(String[] args) {

            start();
        }

    public static void start() {
        Scanner input=new Scanner(System.in);
        int secim;
        Register register=new Register();


        do {
            System.out.println("=========Hoşgeldiniz========");
            System.out.println("Lütfen yapacağınız işlemi seçiniz..\n1-Uye ol\n2-Giris yap\n3-Cıkış yap");
            secim=input.nextInt();
            switch (secim){
                case 1:
                    register.uyeOl();
                case 2:
                case 3:
                default:
                    System.out.println("Hatali giriş yaptınız.Tekrar deneyiniz");
            }

        }while (secim!=3);
    }
}
