
package çağrı.sistemi;

import javax.swing.JOptionPane;

public class JandarmaEkrani extends javax.swing.JFrame {

    public JandarmaEkrani() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        adText = new javax.swing.JTextField();
        soyadText = new javax.swing.JTextField();
        ilText = new javax.swing.JTextField();
        bilgilerimiKaydetButton = new javax.swing.JButton();
        anaSayfayaDonButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jandarma Kurumu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setText("Jandarma Kurumu");

        jLabel2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel2.setText("Jandarma Kurumu'na eriştiniz. Lütfen bilgilerinizi doğru bir şekilde giriniz.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        adText.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        adText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adTextActionPerformed(evt);
            }
        });

        soyadText.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        soyadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyadTextActionPerformed(evt);
            }
        });

        ilText.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        ilText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilTextActionPerformed(evt);
            }
        });

        bilgilerimiKaydetButton.setBackground(new java.awt.Color(255, 255, 255));
        bilgilerimiKaydetButton.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        bilgilerimiKaydetButton.setText("Bilgilerimi Kaydet");
        bilgilerimiKaydetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgilerimiKaydetButtonActionPerformed(evt);
            }
        });

        anaSayfayaDonButton.setBackground(new java.awt.Color(255, 255, 255));
        anaSayfayaDonButton.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        anaSayfayaDonButton.setText("Ana Sayfaya Dön");
        anaSayfayaDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaSayfayaDonButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel3.setText("Ad");

        jLabel4.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel4.setText("Soyad");

        jLabel5.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel5.setText("İl");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ilText, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(bilgilerimiKaydetButton)))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anaSayfayaDonButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(67, Short.MAX_VALUE)
                        .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ilText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(bilgilerimiKaydetButton)
                .addGap(30, 30, 30)
                .addComponent(anaSayfayaDonButton)
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

    private void adTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adTextActionPerformed

    }//GEN-LAST:event_adTextActionPerformed

    private void soyadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyadTextActionPerformed

    }//GEN-LAST:event_soyadTextActionPerformed

    private void ilTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilTextActionPerformed

    }//GEN-LAST:event_ilTextActionPerformed

    private void anaSayfayaDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaSayfayaDonButtonActionPerformed
        GirisEkrani ge= new GirisEkrani();
        ge.show();
        this.hide();
    }//GEN-LAST:event_anaSayfayaDonButtonActionPerformed

    private void bilgilerimiKaydetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgilerimiKaydetButtonActionPerformed
        Jandarma j= new Jandarma(adText.getText(), soyadText.getText(), ilText.getText(), "Jandarma");
        adText.setText("");
        soyadText.setText("");
        ilText.setText("");
        
        
        j.dosyaEkle();
        j.veriEkle();
        String mesaj="Bilgileriniz kaydedildi. Ekiplerimiz tahmini "+j.sure()+" dakika sonra olay yerinde olacaktır.";
        
        JOptionPane.showMessageDialog(this, mesaj);
    }//GEN-LAST:event_bilgilerimiKaydetButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JandarmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adText;
    private javax.swing.JButton anaSayfayaDonButton;
    private javax.swing.JButton bilgilerimiKaydetButton;
    private javax.swing.JTextField ilText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField soyadText;
    // End of variables declaration//GEN-END:variables
}
