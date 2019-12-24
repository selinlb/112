
package çağrı.sistemi;

import java.util.Scanner;

public class Test{ //test sınıfımız.
    public static void main(String[] args){
        CagriSistemi i2= new Itfaiye();
        CagriSistemi a2= new Ambulans();
        CagriSistemi af2= new Afad();
        CagriSistemi p2= new Polis();
        CagriSistemi j2= new Jandarma();
        CagriSistemi o2= new Orman();
        CagriSistemi sh2= new SahilGuvenlik();
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("112 Çağrı Sistemi'ne hoş geldiniz. " //giriş kısmımız.
                + "Yenilenen çağrı sistemimiz ile istediğiniz kuruma tek bir numara ile ulaşabilirsiniz.\n"
                + "Ulaşabileceğiniz kurumlar:\n"
                + "1. İtfaiye\n"
                + "2. Ambulans\n"
                + "3. AFAD\n"
                + "4. Polis\n"
                + "5. Jandarma\n"
                + "6. Orman\n"
                + "7. Sahil Güvenlik\n"
                + "Çağrı Sistemi'ndeki kayıtları görüntülemek için 8'e basın.\n"
                + "Çağrı Sistemi'ndeki kayıtları silmek için 9'a basın.\n"
                + "Çağrı Sistemi'nden çıkış yapmak için lütfen 0'a basın.\n");
        
        while(true){
            System.out.println();
            System.out.print("Lütfen ulaşmak istediğiniz kurumu seçin: ");
            int kurum= scanner.nextInt(); //burada kullanıcıdan ulaşmak istediği kurumu alıyoruz.
            System.out.println();
            
            if(kurum==0){ //eğer 0 girildiyse sistemden çıkış yapılıyor.
                System.out.println("Sistemden çıkılıyor...\n");
                break;
            }
            
            else if(kurum==1){
                scanner.nextLine(); //kullanıcının bilgilerini alıyoruz.
                System.out.print("Adınız: ");
                String ad= scanner.nextLine();
                System.out.print("Soyadınız: ");
                String soyad= scanner.nextLine();
                System.out.print("Bulunduğunuz il: ");
                String il= scanner.nextLine();
                System.out.println();
                
                Itfaiye i= new Itfaiye(ad, soyad, il, "İtfaiye"); //itfaiye sınıfında bir nesne oluşturuyoruz.
                i.cagriArtir(); //çağrı kaydını bir artırıyoruz.
                i.isimekle(ad, soyad, il, "İtfaiye"); //isim kaydını alıyoruz.
                i.sure(); //süreyi hesaplıyoruz.
                i.dosyaEkle();
                i.veriEkle();
            }
            //her kurum için aynı işlemler uygulanıyor.
            else if(kurum==2){
                scanner.nextLine(); //kullanıcının bilgilerini alıyoruz.
                System.out.print("Adınız: ");
                String ad= scanner.nextLine();
                System.out.print("Soyadınız: ");
                String soyad= scanner.nextLine();
                System.out.print("Bulunduğunuz il: ");
                String il= scanner.nextLine();
                System.out.println();
                
                Ambulans a= new Ambulans(ad, soyad, il, "Sağlık");
                a.cagriArtir();
                a.isimekle(ad, soyad, il, "Sağlık");
                a.sure();
                a.dosyaEkle();
                a.veriEkle();
            }
            
            else if(kurum==3){
                scanner.nextLine(); //kullanıcının bilgilerini alıyoruz.
                System.out.print("Adınız: ");
                String ad= scanner.nextLine();
                System.out.print("Soyadınız: ");
                String soyad= scanner.nextLine();
                System.out.print("Bulunduğunuz il: ");
                String il= scanner.nextLine();
                System.out.println();
                
                Afad af= new Afad(ad, soyad, il, "AFAD");
                af.cagriArtir();
                af.isimekle(ad, soyad, il, "AFAD");
                af.sure();
                af.dosyaEkle();
                af.veriEkle();
            }
            
            else if(kurum==4){
                scanner.nextLine(); //kullanıcının bilgilerini alıyoruz.
                System.out.print("Adınız: ");
                String ad= scanner.nextLine();
                System.out.print("Soyadınız: ");
                String soyad= scanner.nextLine();
                System.out.print("Bulunduğunuz il: ");
                String il= scanner.nextLine();
                System.out.println();
                
                Polis p= new Polis(ad, soyad, il, "Polis");
                p.cagriArtir();
                p.isimekle(ad, soyad, il, "Polis");
                p.sure();
                p.dosyaEkle();
                p.veriEkle();
            }
            
            else if(kurum==5){
                scanner.nextLine(); //kullanıcının bilgilerini alıyoruz.
                System.out.print("Adınız: ");
                String ad= scanner.nextLine();
                System.out.print("Soyadınız: ");
                String soyad= scanner.nextLine();
                System.out.print("Bulunduğunuz il: ");
                String il= scanner.nextLine();
                System.out.println();
                
                Jandarma j= new Jandarma(ad, soyad, il, "Jandarma");
                j.cagriArtir();
                j.isimekle(ad, soyad, il, "Jandarma");
                j.sure();
                j.dosyaEkle();
                j.veriEkle();
            }
            
            else if(kurum==6){
                scanner.nextLine(); //kullanıcının bilgilerini alıyoruz.
                System.out.print("Adınız: ");
                String ad= scanner.nextLine();
                System.out.print("Soyadınız: ");
                String soyad= scanner.nextLine();
                System.out.print("Bulunduğunuz il: ");
                String il= scanner.nextLine();
                System.out.println();
                
                Orman o= new Orman(ad, soyad, il, "Orman");
                o.cagriArtir();
                o.isimekle(ad, soyad, il, "Orman");
                o.sure();
                o.dosyaEkle();
                o.veriEkle();
            }
            
            else if(kurum==7){
                scanner.nextLine(); //kullanıcının bilgilerini alıyoruz.
                System.out.print("Adınız: ");
                String ad= scanner.nextLine();
                System.out.print("Soyadınız: ");
                String soyad= scanner.nextLine();
                System.out.print("Bulunduğunuz il: ");
                String il= scanner.nextLine();
                System.out.println();
                
                SahilGuvenlik sh= new SahilGuvenlik(ad, soyad, il, "Sahil Güvenlik");
                sh.cagriArtir();
                sh.isimekle(ad, soyad, il, "Sahil Güvenlik");
                sh.sure();
                sh.dosyaEkle();
                sh.veriEkle();
            }  
            
            else if(kurum==8){            
                CagriSistemi.bilgileriGoster(); //kayıtları görüntülemek için arraylistlerimizin olduğu metodu çağırıyoruz.
                i2.veriOku();
                a2.veriOku();
                af2.veriOku();
                p2.veriOku();
                j2.veriOku();
                o2.veriOku();
                sh2.veriOku();
            }
            
            else if(kurum==9){
                CagriSistemi.kayitSil(); //kayıtları silmek için arraylistlerimizin silindiği metodu çağırıyoruz.
                i2.veriSil();
                a2.veriSil();
                af2.veriSil();
                p2.veriSil();
                j2.veriSil();
                o2.veriSil();
                sh2.veriSil();
            }
            
            else{ //eğer 9'dan büyük bir komut girilirse geçersiz sayılıyor.
                System.out.println("Geçersiz bir kurum girdiniz. Lütfen tekrar deneyiniz.");
                break;
            }   
        }
    }
}
