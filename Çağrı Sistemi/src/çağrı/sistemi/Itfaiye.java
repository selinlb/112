
package çağrı.sistemi;

import com.mysql.jdbc.Connection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Itfaiye extends CagriSistemi{
    
    private static final String kullaniciAdi= "root";
    private static final String parola= "";
    private static final String dbIsmi= "itfaiye";
    private static final String host= "localhost";
    private static final int port= 3306;
    
    private Connection con= null;
    private Statement statement= null;
    public String kayit="";
    
    public Itfaiye(){
        String url= "jdbc:mysql://"+host+":"+port+"/"+dbIsmi+"?useUnicode=true&characterEncoding=utf8";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } 
        
        catch (ClassNotFoundException ex){
            System.out.println("Driver bulunamadı.");
        }
        
        try{
            con= (Connection) DriverManager.getConnection(url, kullaniciAdi, parola);
        } 
        
        catch (SQLException ex){
            System.out.println("Bağlantı başarısız.");
        }
        
    }
    
    public Itfaiye(String ad, String soyad, String il, String kurum){
        super(ad, soyad, il, kurum);
        System.out.println("İtfaiye kurumuna eriştiniz.");
        
        String url= "jdbc:mysql://"+host+":"+port+"/"+dbIsmi+"?useUnicode=true&characterEncoding=utf8";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } 
        
        catch (ClassNotFoundException ex){
            System.out.println("Driver bulunamadı.");
        }
        
        try{
            con= (Connection) DriverManager.getConnection(url, kullaniciAdi, parola);
        } 
        
        catch (SQLException ex){
            System.out.println("Bağlantı başarısız.");
        }
    }

    @Override
    public int sure(){
        if("istanbul".equals(super.getIl())){
            System.out.println("İstanbul'da 3 tane itfaiye kurumu vardır.");
            super.sure();
            super.setSure(super.getSure()/3);
            System.out.println((super.getSure()+1)+" dakika sonra ekiplerimiz olay yerinde olacaktır.");
        }
        
        else if("ankara".equals(super.getIl())){
            System.out.println("Ankara'da 2 tane itfaiye kurumu vardır.");
            super.sure();
            super.setSure(super.getSure()/2);
            System.out.println((super.getSure()+1)+" dakika sonra ekiplerimiz olay yerinde olacaktır.");
        }
        
        else if("izmir".equals(super.getIl())){
            System.out.println("İzmir'de 2 tane itfaiye kurumu vardır.");
            super.sure();
            super.setSure(super.getSure()/2);
            System.out.println((super.getSure()+1)+" dakika sonra ekiplerimiz olay yerinde olacaktır.");
        }
        
        else{
            System.out.println(super.getIl()+" ilinde 1 tane itfaiye kurumu vardır.");
            super.sure();
            System.out.println((super.getSure()+1)+" dakika sonra ekiplerimiz olay yerinde olacaktır.");
        }
        
        System.out.println("**********************************************************");
        
        return super.getSure();
    }
    
    
    @Override
    public void dosyaEkle(){ //BURADA SADECE DOSYAYA EKLEME YAPTIK
        File dosya= new File("itfaiyekaydi.txt");
            
        if(!dosya.exists()){
            try{
                dosya.createNewFile();
            } 
            
            catch (IOException ex){
                System.out.println("İtfaiye kaydı dosyası oluşturulamadı.");
            }
        }
        
        try{
            FileWriter fw= new FileWriter(dosya, true);
            fw.write(super.getAd()+"\n"+super.getSoyad()+"\n"+super.getIl()+"\n");
            fw.close();
            
        } 
        
        catch (IOException ex){
            Logger.getLogger(Itfaiye.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void veriEkle(){ //BURADA DOSYADAN OKUYUP TABLOYA EKLEME YAPTIK
        
        try{
            File dosya= new File("itfaiyekaydi.txt");
            FileReader fr= new FileReader(dosya);
            Scanner scanner= new Scanner(fr);
            
            String silmeSorgusu= "Delete from itfaiyekaydi";
            statement= con.createStatement();
            statement.executeUpdate(silmeSorgusu);
            
            while(scanner.hasNextLine()){
                statement= con.createStatement();
                String ad= scanner.nextLine();
                String soyad= scanner.nextLine();
                String il= scanner.nextLine();
                String sorgu= "Insert INTO itfaiyekaydi (Ad, Soyad, İl) VALUES ("+"'"+ad+"',"+"'"+soyad+"',"+"'"+il+"')";
                
                statement.executeUpdate(sorgu);
            }
        } 
        
        catch (SQLException ex){
            Logger.getLogger(Itfaiye.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        catch (FileNotFoundException ex){
            Logger.getLogger(Itfaiye.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String veriOku(){ //BURADA TABLODAN OKUYUP EKRANA YAZDIRDIK
        String sorgu= "Select * From itfaiyekaydi";
        
        try{
            statement= con.createStatement();
            ResultSet rs= statement.executeQuery(sorgu);
            
            while(rs.next()){
                int sira= rs.getInt("Sıra");
                String ad= rs.getString("Ad");
                String soyad= rs.getString("Soyad");
                String il= rs.getString("İl");
                kayit+= "Sıra: "+sira+" Ad: "+ad+" Soyad: "+soyad+" İl: "+il+" Kurum: İtfaiye\n";
                System.out.println("Sıra: "+sira+" Ad: "+ad+" Soyad: "+soyad+" İl: "+il+" Kurum: İtfaiye");
            }
        } 
        
        catch (SQLException ex){
            Logger.getLogger(Itfaiye.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        if(kayit== null){
            return kayit= "";
        }
        
        else{
            return kayit;
        }
    }
    
    @Override
    public void veriSil(){ //BURADA HEM TABLOYU HEM DE DOSYAYI SİLDİK
        String sorgu= "Delete from itfaiyekaydi";
        
        try{
            statement= con.createStatement();
            statement.executeUpdate(sorgu);
            File dosya= new File("itfaiyekaydi.txt");
            FileWriter fw= new FileWriter(dosya, false);
            fw.write("");
            fw.close();
        } 
        
        catch (SQLException ex){
            Logger.getLogger(Itfaiye.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        catch (IOException ex){
            Logger.getLogger(Itfaiye.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 }
    
    
    
    
    

