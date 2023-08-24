import java.util.Scanner;
public class KullaniciGirisi {
    public  static  void  main(String[] args){
        String userName,password="java123",nPassword,select;


        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName=inp.nextLine();

        System.out.print("Şifreniz: ");
        //password=inp.nextLine();


        if(userName.equals("patika")){
            System.out.println("Kullanıcı Adı Doğru");
            if (password.equals("java123")){
                System.out.println("Kullanıcı Adı ve şifre doğru.");
            }else{
                System.out.println("Şifreniz hatalı.Şifreyi sıfırlamak ister misiniz?");
                System.out.print("evet ise 1'i hayır ise 2'yi tuşlayınız:");
                select=inp.nextLine();
                if(select.equals("1")){
                    System.out.print("Yeni şifre giriniz: ");
                    System.out.println("Şifre oluşturuldu");
                    nPassword=inp.nextLine();
                    if (nPassword.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz..");
                        System.out.print("Yeni şifre giriniz: ");
                        nPassword=inp.nextLine();
                    }else {
                        System.out.println("Şifre oluşturuldu");
                    }
                } else if (select.equals("2")) {
                    System.out.println("iyi Günler Dileriz.");
                }
            }
        }else {
            System.out.println("Bilgileriniz Hatalı!");
        }
    }
}
