
package çağrı.sistemi;

import java.util.ArrayList;
import java.util.Random;

public abstract class CagriSistemi{
    public abstract void dosyaEkle();
    public abstract void veriEkle();
    public abstract String veriOku();
    public abstract void veriSil();
    
    private String ad;
    private String soyad;
    private String il;
    private String kurum;
    
    private static int cagriSayaci;
    private int mesafe;
    private int sure;
    private int trafik;
    
    public static ArrayList<String> isimler= new ArrayList<String>(); //kayıtlarımızı tutan arraylistlerimiz. 
    public static ArrayList<String> soyisimler= new ArrayList<String>();
    public static ArrayList<String> iller= new ArrayList<String>();
    public static ArrayList<String> kurumlar= new ArrayList<String>();
    
    public CagriSistemi(){ //yapıcı metodlarımız.
        
    }
    
    public CagriSistemi(String ad, String soyad, String il, String kurum){
        this.ad= ad;
        this.soyad= soyad;
        this.il= il;
        this.kurum= kurum;
    }

    public String getAd(){
        return this.ad;
    }
    
    public void setAd(String ad){
        this.ad= ad;
    }
    
    public String getSoyad(){
        return this.soyad;
    }
    
    public void setSoyad(String soyad){
        this.soyad= soyad;
    }
    
    public String getIl(){
        return this.il;
    }
    
    public void setIl(String il){
        this.il= il;
    }
    
    public String getKurum(){
        return this.kurum;
    }
    
    public void setKurum(String kurum){
        this.kurum= kurum;
    }
    
    public int getSure(){
        return sure;
    }
    
    public void setSure(int sure){
        this.sure= sure;
    }
    
    
    public void cagriArtir(){ //çağrıyı bir artıran metodumuz. 
        cagriSayaci+=1;
    }
    
    public void isimekle(String ad, String soyad, String il, String kurum){ //kayıtlarımızı arraylistlere atan metodumuz.
        isimler.add(ad);
        soyisimler.add(soyad); 
        iller.add(il);
        kurumlar.add(kurum);
    }
    
    public int sure(){ //ulaşma süresini hesaplayan metodumuz.
        Random random= new Random();
        trafik= random.nextInt(3);
        mesafe= random.nextInt(3001)+1;
        System.out.println("Mesafe durumu: "+mesafe+" metre.");
        
        if(trafik==0){
            System.out.println("Trafik durumu: az.");
            setSure(mesafe/100); //trafik azsa *1.       
        }
        
        else if(trafik==1){
            System.out.println("Trafik durumu: orta.");
            setSure((mesafe*2)/100); //trafik ortaysa *2.
        }
        
        else{
            System.out.println("Trafik durumu: yoğun.");
            setSure((mesafe*3)/100); //trafik yoğunsa *3.
        }
        
        return getSure();
    }
    
    public static void bilgileriGoster(){ //bilgileri gösteren metodumuz.
        System.out.println("Çağrı Sistemi'ne "+cagriSayaci+" kadar çağrı yapılmıştır.");
        System.out.println(":::Çağrı bilgileri::: ");
        
        if(kurumlar.size()>0){
            System.out.println("Adlar: "+isimler);
            System.out.println("Soyadlar: "+soyisimler);
            System.out.println("Çağrı yapılan iller: "+iller);
            System.out.println("Çağrı yapılan kurumlar: "+kurumlar);
            System.out.println();
        }
        
        else{
            System.out.println("Adlar: Kayıt bulunmamaktadır.");    
            System.out.println("Soyadlar: Kayıt bulunmamaktadır.");  
            System.out.println("Çağrı yapılan iller: Kayıt bulunmamaktadır.");  
            System.out.println("Çağrı yapılan kurumlar: Kayıt bulunmamaktadır."); 
            System.out.println();
        }
    }
    
    public static void kayitSil(){
        isimler.clear();
        soyisimler.clear();
        iller.clear();
        kurumlar.clear();
        cagriSayaci=0;
        System.out.println("Kayıtlar silinmiştir.");
    }
}
