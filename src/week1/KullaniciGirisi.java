package week1;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password;
        String dataName = "patika", dataPass = "java123";
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        username = inp.nextLine();

        System.out.print("Sifre : ");
        password = inp.nextLine();

        if (username.equals(dataName) && password.equals(dataPass)) {
            System.out.println("Giriş yapılıyor...");
        }
        if(!username.equals(dataName)) {
            System.out.println("Kullanıcı adınız hatalı!");
        } else if (!password.equals(dataPass)) {
            System.out.println("Şifreniz yanlış");
            System.out.print("Şifrenizi değiştirmek istiyorsanız 1'basınız.");
            int answer;
            answer = inp.nextInt();

            switch (answer) {
                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Yeni şifrenizi girin:");
                    String newPass;
                    newPass = input.nextLine();
                    if(newPass.equals(dataPass)) {
                        System.out.println("Şifreniz aynı olduğu için değiştirilemedi.");

                    } else {
                        Scanner input2 = new  Scanner(System.in);
                        System.out.print("Şifrenizi onaylayın:");
                        String newPassAgain;
                        newPassAgain = input2.nextLine();
                        if (newPass.equals(newPassAgain)) {
                            System.out.println("Şifreniz "+ newPass + " olarak değişti.");
                        } else {
                            System.out.println("Şifreniz uyuşmadı. Tekrar deneyiniz.");
                        }

                    } break;
                default:
                    System.out.println("Yanlış tuşlama yaptınız. Lütfen tekrar deneyin.");
                    break;
            }

        }


    }

}
