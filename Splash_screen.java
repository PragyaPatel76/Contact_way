
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe_management;

/**
 *
 * @author Pragya patel
 */
public class Splash_screen extends javax.swing.JFrame {

    /**
     * Creates new form Splash_screen
     */
    public Splash_screen() {
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
        Progress = new javax.swing.JProgressBar();
        roll = new javax.swing.JLabel();
        value = new javax.swing.JLabel();
        value2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sp3-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        Progress.setOpaque(true);
        jPanel1.add(Progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 480, 20));

        roll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roll.setText("24MCI10008");
        jPanel1.add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 140, 30));

        value.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        value.setText("0 %");
        jPanel1.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 420, 30));

        value2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        value2.setText("Developed by :");
        jPanel1.add(value2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 140, 30));

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setText("Pragya Patel");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Splash_screen sp = new Splash_screen();
        sp.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                sp.value.setText(i + "   % ");
                if (i == 10) {
                    sp.value.setText("Loading....");
                }
                if (i == 20) {
                    sp.value.setText("Loading....");
                }
                if (i == 30) {
                    sp.value.setText("Loading....");
                }
                if (i == 50) {
                    sp.value.setText("Connecting to database");
                }
                if (i == 70) {
                    sp.value.setText("Connection successfull to database");
                }
                if (i == 80) {
                    sp.value.setText("Just wait....");
                }
                sp.Progress.setValue(i);
               
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
 Login_Form lm=new Login_Form();
                lm.setVisible(true);
                
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel roll;
    private javax.swing.JLabel value;
    private javax.swing.JLabel value2;
    // End of variables declaration//GEN-END:variables
}
