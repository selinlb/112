
package çağrı.sistemi;

import javax.swing.JOptionPane;

public class SaglikEkrani extends javax.swing.JFrame {

    public SaglikEkrani() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        anaSayfayaDonButton = new javax.swing.JButton();
        adText = new javax.swing.JTextField();
        soyadText = new javax.swing.JTextField();
        ilText = new javax.swing.JTextField();
        bilgilerimiKaydetButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sağlık Kurumu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setText("Sağlık Kurumu");

        jLabel2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel2.setText("Sağlık Kurumu'na eriştiniz. Lütfen bilgilerinizi doğru bir şekilde giriniz.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        anaSayfayaDonButton.setBackground(new java.awt.Color(255, 255, 255));
        anaSayfayaDonButton.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        anaSayfayaDonButton.setText("Ana Sayfaya Dön");
        anaSayfayaDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaSayfayaDonButtonActionPerformed(evt);
            }
        });

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
                .addContainerGap(479, Short.MAX_VALUE)
                .addComponent(anaSayfayaDonButton)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ilText, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(bilgilerimiKaydetButton)))
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(anaSayfayaDonButton)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ilText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(bilgilerimiKaydetButton)
                    .addContainerGap(66, Short.MAX_VALUE)))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anaSayfayaDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaSayfayaDonButtonActionPerformed
        GirisEkrani ge= new GirisEkrani();
        ge.show();
        this.hide();
     
    }//GEN-LAST:event_anaSayfayaDonButtonActionPerformed

    private void adTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adTextActionPerformed

    }//GEN-LAST:event_adTextActionPerformed

    private void soyadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyadTextActionPerformed

    }//GEN-LAST:event_soyadTextActionPerformed

    private void ilTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilTextActionPerformed

    }//GEN-LAST:event_ilTextActionPerformed

    private void bilgilerimiKaydetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgilerimiKaydetButtonActionPerformed
        Ambulans a= new Ambulans(adText.getText(), soyadText.getText(), ilText.getText(), "Sağlık");
        adText.setText("");
        soyadText.setText("");
        ilText.setText("");
        
        a.dosyaEkle();
        a.veriEkle();
        String mesaj="Bilgileriniz kaydedildi. Ekiplerimiz tahmini "+a.sure()+" dakika sonra olay yerinde olacaktır.";
        
        JOptionPane.showMessageDialog(this, mesaj);
        
    }//GEN-LAST:event_bilgilerimiKaydetButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaglikEkrani().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField soyadText;
    // End of variables declaration//GEN-END:variables
}
