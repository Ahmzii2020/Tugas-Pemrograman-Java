/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ACER
 */
public class AppKonversiSuhu extends javax.swing.JFrame {
    double celcius;
    double fahrenheit;
    double reamur;
    double kelvin;
    
    /**
     * Creates new form AppKonversiSuhu
     */
    public AppKonversiSuhu() {
        initComponents();
    }
    private void Celcius () {
        celcius = Double.parseDouble(txtSuhu.getText()) ;
        kelvin = celcius + 273.15;
        fahrenheit = celcius * 1.8 + 32;
        reamur = celcius * 0.8;
            lblCelcius.setText(celcius + " Celcius");
            lblKelvin.setText(kelvin + " Kelvin");
            lblFahrenheit.setText(fahrenheit + " Fahrenheit");
            lblReamur.setText(reamur + " Reamur");
    }    
    
    private void Fahrenheit () {
        fahrenheit = Double.parseDouble(txtSuhu.getText()) ;
        kelvin = (fahrenheit + 459.67) / 1.8 ;
        celcius = (fahrenheit - 32) / 1.8 ;
        reamur = (fahrenheit - 32) / 2.25 ;
            lblCelcius.setText(celcius + " Celcius");
            lblKelvin.setText(kelvin + " Kelvin");
            lblFahrenheit.setText(fahrenheit + " Fahrenheit");
            lblReamur.setText(reamur + " Reamur");  
    }    
    
    private void Reamur () {
        reamur = Double.parseDouble(txtSuhu.getText()) ;
        kelvin = reamur / 0.8 + 273.15 ;
        celcius = reamur/ 0.8 ;
        fahrenheit = (reamur - 7.5) * 24/7 + 32 ;
            lblCelcius.setText(celcius + " Celcius");
            lblKelvin.setText(kelvin + " Kelvin");
            lblFahrenheit.setText(fahrenheit + " Fahrenheit");
            lblReamur.setText(reamur + " Reamur");
    }    
    
    private void Kelvin () {
        kelvin = Double.parseDouble(txtSuhu.getText()) ;
        celcius = kelvin - 273.15 ;
        fahrenheit = kelvin * 1.8 - 459.67 ;
        reamur = (kelvin - 273.15) * 0.8 ;
            lblCelcius.setText(celcius + " Celcius");
            lblKelvin.setText(kelvin + " Kelvin");
            lblFahrenheit.setText(fahrenheit + " Fahrenheit");
            lblReamur.setText(reamur + " Reamur");  
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        rbReamur = new javax.swing.JRadioButton();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        lblReamur = new javax.swing.JLabel();
        lblCelcius = new javax.swing.JLabel();
        lblFahrenheit = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        btnKonversi = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Konversi Suhu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 302, 22));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("By Ahmad Fauzi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel3.setText("Input Suhu :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuhuActionPerformed(evt);
            }
        });
        jPanel1.add(txtSuhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        rbReamur.setBackground(new java.awt.Color(0, 204, 204));
        rbReamur.setText("Reamur");
        rbReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReamurActionPerformed(evt);
            }
        });
        jPanel1.add(rbReamur, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        rbCelcius.setBackground(new java.awt.Color(0, 204, 204));
        rbCelcius.setText("Celcius");
        rbCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelciusActionPerformed(evt);
            }
        });
        jPanel1.add(rbCelcius, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, -1));

        rbFahrenheit.setBackground(new java.awt.Color(0, 204, 204));
        rbFahrenheit.setText("Fahrenheit");
        rbFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFahrenheitActionPerformed(evt);
            }
        });
        jPanel1.add(rbFahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        rbKelvin.setBackground(new java.awt.Color(0, 204, 204));
        rbKelvin.setText("Kelvin");
        rbKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKelvinActionPerformed(evt);
            }
        });
        jPanel1.add(rbKelvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Hasil Konversi :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, 20));

        lblReamur.setText("Reamur");
        jPanel1.add(lblReamur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        lblCelcius.setText("Celcius");
        jPanel1.add(lblCelcius, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        lblFahrenheit.setText("Fahrenheit");
        jPanel1.add(lblFahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        lblKelvin.setText("Kelvin");
        jPanel1.add(lblKelvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        btnKonversi.setBackground(new java.awt.Color(0, 255, 51));
        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });
        jPanel1.add(btnKonversi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnReset.setBackground(new java.awt.Color(255, 0, 0));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuhuActionPerformed

    private void rbCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCelciusActionPerformed

    private void rbReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbReamurActionPerformed

    private void rbFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFahrenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFahrenheitActionPerformed

    private void rbKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbKelvinActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
         if (rbCelcius.isSelected()){
                 Celcius ();
             }else if (rbFahrenheit.isSelected()){
                 Fahrenheit ();
             }else if (rbReamur.isSelected()) {
                 Reamur ();
             }else if (rbKelvin.isSelected()) {
                 Kelvin ();
        // TODO add your handling code here:
    }                                        
   // TODO add your handling code here:
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSuhu.setText("");
        lblCelcius.setText("Celcius");
        lblFahrenheit.setText("Fahrenheit");
        lblKelvin.setText("Kelvin");
        lblReamur.setText("Reamur");
        rbCelcius.setSelected(false);
        rbFahrenheit.setSelected(false);
        rbKelvin.setSelected(false);
        rbReamur.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed
// TODO add your handling code here:

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppKonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelcius;
    private javax.swing.JLabel lblFahrenheit;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JLabel lblReamur;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
