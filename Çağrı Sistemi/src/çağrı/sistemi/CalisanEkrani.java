
package çağrı.sistemi;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CalisanEkrani extends javax.swing.JFrame {
    Connection con= null;
    Statement statement= null;

    public CalisanEkrani() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cikisYapButton = new javax.swing.JButton();
        kayitlariGoruntuleButton = new javax.swing.JButton();
        kayitlariSilButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setText("Çalışan Ekranı");

        jLabel2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel2.setText("Lütfen yapmak istediğiniz işlemi seçin.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        cikisYapButton.setBackground(new java.awt.Color(255, 255, 255));
        cikisYapButton.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cikisYapButton.setText("Çıkış Yap");
        cikisYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisYapButtonActionPerformed(evt);
            }
        });

        kayitlariGoruntuleButton.setBackground(new java.awt.Color(255, 255, 255));
        kayitlariGoruntuleButton.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        kayitlariGoruntuleButton.setText("Kayıtları Görüntüle");
        kayitlariGoruntuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitlariGoruntuleButtonActionPerformed(evt);
            }
        });

        kayitlariSilButton.setBackground(new java.awt.Color(255, 255, 255));
        kayitlariSilButton.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        kayitlariSilButton.setText("Kayıtları Sil");
        kayitlariSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitlariSilButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 521, Short.MAX_VALUE)
                        .addComponent(cikisYapButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kayitlariGoruntuleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kayitlariSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(kayitlariGoruntuleButton)
                .addGap(18, 18, 18)
                .addComponent(kayitlariSilButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(cikisYapButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikisYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisYapButtonActionPerformed
        GirisEkrani ge= new GirisEkrani();
        ge.show();
        this.hide();
    }//GEN-LAST:event_cikisYapButtonActionPerformed

    private void kayitlariGoruntuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitlariGoruntuleButtonActionPerformed
        Itfaiye i= new Itfaiye();
        Ambulans a= new Ambulans();
        Afad af= new Afad();
        Polis p= new Polis();
        Jandarma j= new Jandarma();
        Orman o= new Orman();
        SahilGuvenlik sg= new SahilGuvenlik();
        String mesaj;
        
        mesaj= i.veriOku()+a.veriOku()+af.veriOku()+p.veriOku()+j.veriOku()+o.veriOku()+sg.veriOku();
        
        JOptionPane.showMessageDialog(this, mesaj);
        
        
    }//GEN-LAST:event_kayitlariGoruntuleButtonActionPerformed

    private void kayitlariSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitlariSilButtonActionPerformed
        Itfaiye i= new Itfaiye();
        Ambulans a= new Ambulans();
        Afad af= new Afad();
        Polis p= new Polis();
        Jandarma j= new Jandarma();
        Orman o= new Orman();
        SahilGuvenlik sg= new SahilGuvenlik();
        String mesaj2;
        
        i.veriSil();
        a.veriSil();
        af.veriSil();
        p.veriSil();
        j.veriSil();
        o.veriSil();
        sg.veriSil();
        
        mesaj2="Bütün kayıtlar silinmiştir.";
        JOptionPane.showMessageDialog(this, mesaj2);
        
    }//GEN-LAST:event_kayitlariSilButtonActionPerformed

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalisanEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikisYapButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kayitlariGoruntuleButton;
    private javax.swing.JButton kayitlariSilButton;
    // End of variables declaration//GEN-END:variables
}
