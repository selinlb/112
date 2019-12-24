
package çağrı.sistemi;

import javax.swing.JOptionPane;

public class GirisEkrani extends javax.swing.JFrame {

    public GirisEkrani() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kullaniciAdiText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        girisYapButton = new javax.swing.JButton();
        iftaiyeButton = new javax.swing.JButton();
        ambulansButton = new javax.swing.JButton();
        afadKurumu = new javax.swing.JButton();
        polisKurumu = new javax.swing.JButton();
        jandarmaButton = new javax.swing.JButton();
        ormanButton = new javax.swing.JButton();
        sahilGuvenlikButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("112 Çağrı Merkezi");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel1.setText("112 Çağrı Merkezi");

        jLabel2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel2.setText("Yenilenen çağrı sistemimiz ile istediğiniz kuruma tek bir tık ile ulaşabilirsiniz.");

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(jLabel3))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel4.setText("Çalışan Girişi");

        jLabel5.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel5.setText("Kullanıcı Adı");

        jLabel6.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel6.setText("Şifre");

        girisYapButton.setBackground(new java.awt.Color(255, 255, 204));
        girisYapButton.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        girisYapButton.setText("Giriş Yap");
        girisYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kullaniciAdiText)
                    .addComponent(sifreText)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(girisYapButton)
                            .addComponent(jLabel4))
                        .addGap(0, 102, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciAdiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(girisYapButton)
                .addGap(83, 83, 83))
        );

        iftaiyeButton.setBackground(new java.awt.Color(255, 255, 255));
        iftaiyeButton.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        iftaiyeButton.setText("İtfaiye Kurumu");
        iftaiyeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iftaiyeButtonActionPerformed(evt);
            }
        });

        ambulansButton.setBackground(new java.awt.Color(255, 255, 255));
        ambulansButton.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        ambulansButton.setText("Sağlık Kurumu");
        ambulansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulansButtonActionPerformed(evt);
            }
        });

        afadKurumu.setBackground(new java.awt.Color(255, 255, 255));
        afadKurumu.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        afadKurumu.setText("AFAD Kurumu");
        afadKurumu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afadKurumuActionPerformed(evt);
            }
        });

        polisKurumu.setBackground(new java.awt.Color(255, 255, 255));
        polisKurumu.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        polisKurumu.setText("Polis Kurumu");
        polisKurumu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polisKurumuActionPerformed(evt);
            }
        });

        jandarmaButton.setBackground(new java.awt.Color(255, 255, 255));
        jandarmaButton.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jandarmaButton.setText("Jandarma Kurumu");
        jandarmaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jandarmaButtonActionPerformed(evt);
            }
        });

        ormanButton.setBackground(new java.awt.Color(255, 255, 255));
        ormanButton.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        ormanButton.setText("Orman Kurumu");
        ormanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ormanButtonActionPerformed(evt);
            }
        });

        sahilGuvenlikButton.setBackground(new java.awt.Color(255, 255, 255));
        sahilGuvenlikButton.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        sahilGuvenlikButton.setText("Sahil Güvenlik Kurumu");
        sahilGuvenlikButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sahilGuvenlikButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iftaiyeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ambulansButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(afadKurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polisKurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jandarmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ormanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sahilGuvenlikButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(iftaiyeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ambulansButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(afadKurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(polisKurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jandarmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ormanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sahilGuvenlikButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void girisYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYapButtonActionPerformed
        String kullaniciAdi = kullaniciAdiText.getText();
        String sifre = new String(sifreText.getPassword());

        if (kullaniciAdi.equals("rin") && sifre.equals("373737")) {
            CalisanEkrani ce = new CalisanEkrani();
            ce.show();
            this.hide();
        } else if (!kullaniciAdi.equals("rin") && sifre.equals("373737")) {
            String mesaj;
            mesaj = "Kullanıcı adınızı yanlış girdiniz.";
            JOptionPane.showMessageDialog(this, mesaj);
        } else if (kullaniciAdi.equals("rin") && !sifre.equals("373737")) {
            String mesaj;
            mesaj = "Şifrenizi yanlış girdiniz.";
            JOptionPane.showMessageDialog(this, mesaj);
        } else {
            String mesaj;
            mesaj = "Kullanıcı adı ve şifrenizi yanlış girdiniz.";
            JOptionPane.showMessageDialog(this, mesaj);
        }

        kullaniciAdiText.setText("");
        sifreText.setText("");


    }//GEN-LAST:event_girisYapButtonActionPerformed

    private void iftaiyeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iftaiyeButtonActionPerformed
        ItfaiyeEkrani ie = new ItfaiyeEkrani();
        ie.show();
        this.hide();


    }//GEN-LAST:event_iftaiyeButtonActionPerformed

    private void ambulansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulansButtonActionPerformed
        SaglikEkrani se = new SaglikEkrani();
        se.show();
        this.hide();


    }//GEN-LAST:event_ambulansButtonActionPerformed

    private void afadKurumuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afadKurumuActionPerformed
        AfadEkrani afe = new AfadEkrani();
        afe.show();
        this.hide();


    }//GEN-LAST:event_afadKurumuActionPerformed

    private void polisKurumuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polisKurumuActionPerformed
        PolisEkrani pe = new PolisEkrani();
        pe.show();
        this.hide();


    }//GEN-LAST:event_polisKurumuActionPerformed

    private void jandarmaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jandarmaButtonActionPerformed
        JandarmaEkrani je = new JandarmaEkrani();
        je.show();
        this.hide();


    }//GEN-LAST:event_jandarmaButtonActionPerformed

    private void ormanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ormanButtonActionPerformed
        OrmanEkrani oe = new OrmanEkrani();
        oe.show();
        this.hide();


    }//GEN-LAST:event_ormanButtonActionPerformed

    private void sahilGuvenlikButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sahilGuvenlikButtonActionPerformed
        SahilGuvenlikEkrani sge = new SahilGuvenlikEkrani();
        sge.show();
        this.hide();


    }//GEN-LAST:event_sahilGuvenlikButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afadKurumu;
    private javax.swing.JButton ambulansButton;
    private javax.swing.JButton girisYapButton;
    private javax.swing.JButton iftaiyeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jandarmaButton;
    private javax.swing.JTextField kullaniciAdiText;
    private javax.swing.JButton ormanButton;
    private javax.swing.JButton polisKurumu;
    private javax.swing.JButton sahilGuvenlikButton;
    private javax.swing.JPasswordField sifreText;
    // End of variables declaration//GEN-END:variables
}
