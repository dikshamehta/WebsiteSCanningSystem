/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author Diksha Mehta
 */
public class MDL extends javax.swing.JFrame {

    /**
     * Creates new form MDL
     */
    public MDL() {
        initComponents();
        setSize(800,500);
        setLocation(300,100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdp1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi1 = new javax.swing.JMenuItem();
        jmi2 = new javax.swing.JMenuItem();
        jmi3 = new javax.swing.JMenuItem();
        jmi4 = new javax.swing.JMenuItem();
        jmi5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmi6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdp1.setAlignmentX(6.0F);
        jdp1.setAlignmentY(6.0F);

        javax.swing.GroupLayout jdp1Layout = new javax.swing.GroupLayout(jdp1);
        jdp1.setLayout(jdp1Layout);
        jdp1Layout.setHorizontalGroup(
            jdp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdp1Layout.setVerticalGroup(
            jdp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Website Scanning");

        jmi1.setText("Website Scan");
        jmi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi1ActionPerformed(evt);
            }
        });
        jMenu1.add(jmi1);

        jmi2.setText("Website Source code");
        jmi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi2ActionPerformed(evt);
            }
        });
        jMenu1.add(jmi2);

        jmi3.setText("Robots");
        jmi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi3ActionPerformed(evt);
            }
        });
        jMenu1.add(jmi3);

        jmi4.setText("Port Scan");
        jmi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi4ActionPerformed(evt);
            }
        });
        jMenu1.add(jmi4);

        jmi5.setText("URL Scanning");
        jmi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi5ActionPerformed(evt);
            }
        });
        jMenu1.add(jmi5);

        jMenuItem1.setText("Who Is ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jmi6.setText("Cookie Scan");
        jmi6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi6ActionPerformed(evt);
            }
        });
        jMenu1.add(jmi6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Virus Scanning");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdp1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdp1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi1ActionPerformed
        // TODO add your handling code here:
        Website_Scan ws= new Website_Scan();
        jdp1.add(ws);
        ws.setVisible(true);
        
        
    }//GEN-LAST:event_jmi1ActionPerformed

    private void jmi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi2ActionPerformed
        // TODO add your handling code here:
        Website_Source_Code wsc= new Website_Source_Code();
        jdp1.add(wsc);
        wsc.setVisible(true);
        
    }//GEN-LAST:event_jmi2ActionPerformed

    private void jmi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi3ActionPerformed
        // TODO add your handling code here:
        Robots rb= new Robots();
        jdp1.add(rb);
        rb.setVisible(true);
    }//GEN-LAST:event_jmi3ActionPerformed

    private void jmi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi4ActionPerformed
        // TODO add your handling code here:
        Port_Scan ps= new Port_Scan();
        jdp1.add(ps);
        ps.setVisible(true);
    }//GEN-LAST:event_jmi4ActionPerformed

    private void jmi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi5ActionPerformed
        // TODO add your handling code here:
        ResultDisplay rs= new ResultDisplay();
        jdp1.add(rs);
        rs.setVisible(true);
        
    }//GEN-LAST:event_jmi5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Who_Is ws= new Who_Is();
        jdp1.add(ws);
        ws.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmi6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi6ActionPerformed
        // TODO add your handling code here:
        Cookies_Scan cs= new Cookies_Scan();
        jdp1.add(cs);
        cs.setVisible(true);
        
    }//GEN-LAST:event_jmi6ActionPerformed

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
            java.util.logging.Logger.getLogger(MDL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdp1;
    private javax.swing.JMenuItem jmi1;
    private javax.swing.JMenuItem jmi2;
    private javax.swing.JMenuItem jmi3;
    private javax.swing.JMenuItem jmi4;
    private javax.swing.JMenuItem jmi5;
    private javax.swing.JMenuItem jmi6;
    // End of variables declaration//GEN-END:variables
}
