package proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {

    Scanner input=new Scanner(System.in);

    List<String > kullaniciAdiList=new ArrayList<>();
    List<String> eMailList=new ArrayList<>();
    List<String> passwordList=new ArrayList<>();



    public  void uyeOl(){
        System.out.println("Lütfen adınızı soyadınızı giriniz");
        String name=input.nextLine();
        boolean kullaniciAdiMevcut;
        do {
            System.out.println("Lütfen kullanici adinizi giriniz..");
            String kullaniciAdi=input.nextLine();
            kullaniciAdiMevcut=kullaniciAdiList.contains(kullaniciAdi);
            if(kullaniciAdiMevcut){
                System.out.println("kullanıcı adi sistemde mevcut.baska bir ad deneyiniz");
            }

        }while (kullaniciAdiMevcut);


        String eMail;
        boolean eMailMevcut;
        boolean isValid;

        do {
            System.out.println("Lütfen mail adresi giriniz");
            eMail=input.nextLine().trim();
            isValid=validateEmail(eMail);
            eMailMevcut=eMailList.contains(eMail);

            if (eMailMevcut){
                isValid=false;
                System.out.println("bu email daha önce kullanılmıs tekrar deneyiniz");
            }

        }while (!isValid);


    }

    private boolean validateEmail(String eMail) {
        boolean isValid;
        boolean bosluk=eMail.contains(" ");
        boolean atIceriyorMu=eMail.contains("@");

        if (bosluk){
            System.out.println("Mail adresi boşluk içeremez.");
            isValid=false;
        }else if(!atIceriyorMu){
            System.out.println("mail adresi @ içermeli");
            isValid=false;
        }else {
            String firstPart=eMail.split("@")[0];
            String secondPart=eMail.split("@")[1];

            boolean checkStart=firstPart.replaceAll("[a-zA-Z0-9_.-]","").length()==0;
            boolean checkEnd=secondPart.equals("gmail.com")||secondPart.equals("hotmail.com")||secondPart.equals("yahoo.com");

            if (!checkStart){
                System.out.println("email küçük harf,buyuk harf,rakam, -._ harici karakter içermez");
            } else if (!checkEnd) {
                System.out.println("email gmail.com , hotmail.com  veya yahoo.com ile bitmeli.");
            }
            isValid=checkEnd&&checkStart;


        }
        return isValid;


    }
}
