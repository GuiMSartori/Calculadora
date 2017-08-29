package com.mycompany.mavenproject1;

/**
 *
 * @author 17100519
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        jLabel1.setText("First number");
        jPanel1.add(jLabel1);
        jPanel1.add(jTextField1);

        jLabel2.setText("Second number");
        jPanel1.add(jLabel2);
        jPanel1.add(jTextField2);

        jLabel3.setText("Result");
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel4);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somar(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrair(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setText("*");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicar(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setText("/");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividir(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setText("%");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentagem(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setText("CLEAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar(evt);
            }
        });
        jPanel1.add(jButton6);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void somar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somar
        String text1 = this.jTextField1.getText();
        String text2 = this.jTextField2.getText();
        Double numero1 = Double.parseDouble(text1);
        Double numero2 = Double.parseDouble(text2);
        double resultado = numero1 + numero2;
        this.jLabel4.setText(String.valueOf(resultado));
    }//GEN-LAST:event_somar

    private void subtrair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrair
        String text1 = this.jTextField1.getText();
        String text2 = this.jTextField2.getText();
        Double numero1 = Double.parseDouble(text1);
        Double numero2 = Double.parseDouble(text2);
        double resultado = numero1 - numero2;
        this.jLabel4.setText(String.valueOf(resultado));    }//GEN-LAST:event_subtrair

    private void multiplicar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicar
        String text1 = this.jTextField1.getText();
        String text2 = this.jTextField2.getText();
        Double numero1 = Double.parseDouble(text1);
        Double numero2 = Double.parseDouble(text2);
        double resultado = numero1 * numero2;
        this.jLabel4.setText(String.valueOf(resultado));    }//GEN-LAST:event_multiplicar

    private void dividir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividir
        String text1 = this.jTextField1.getText();
        String text2 = this.jTextField2.getText();
        Double numero1 = Double.parseDouble(text1);
        Double numero2 = Double.parseDouble(text2);
        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            this.jLabel4.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_dividir

    private void porcentagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentagem
        String text1 = this.jTextField1.getText();
        String text2 = this.jTextField2.getText();
        Double numero1 = Double.parseDouble(text1);
        Double numero2 = Double.parseDouble(text2);
        double resultado = numero1 * (numero2 / 100);
        this.jLabel4.setText(String.valueOf(resultado));
    }//GEN-LAST:event_porcentagem

    private void limpar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar
        jTextField1.setText("");
        jTextField2.setText("");
        jLabel4.setText("");
    }//GEN-LAST:event_limpar

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
