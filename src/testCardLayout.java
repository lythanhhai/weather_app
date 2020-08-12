
import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ly Thanh Hai
 */
public class testCardLayout extends javax.swing.JFrame {

    /**
     * Creates new form testCardLayout
     */
    public testCardLayout() {
        initComponents();
    }
  public class jPanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(181,136,247);
            Color color2 = new Color(29,229,226);
            GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        lastestLocation = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        parentLayOut = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p2 = new jPanelGradient();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        label1 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        description1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        jLabel3.setText("galle");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setText("new");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setText("wea");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setText("Galle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("new");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("wea");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        l3.setBackground(new java.awt.Color(255, 255, 255));
        l3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\location-icon-64px-beau.png")); // NOI18N

        l5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Badge-multiply-icon-24px-red.png")); // NOI18N

        l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\image\\Background.png")); // NOI18N

        lastestLocation.setBackground(new java.awt.Color(0, 255, 51));
        lastestLocation.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lastestLocation.setText("Lastest Locations");
        lastestLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastestLocationMouseClicked(evt);
            }
        });

        label3.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Quang Tri, Viet Nam");

        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButton4.setText("Search");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(51, 51, 51));

        l1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Weather App");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(847, 60));

        jLabel4.setText("galle");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setText("wea");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setText("new");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(127, 127, 127)
                .addComponent(jLabel6)
                .addGap(135, 135, 135)
                .addComponent(jLabel4)
                .addContainerGap(527, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        parentLayOut.setBackground(new java.awt.Color(255, 51, 51));
        parentLayOut.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jPanel2.setPreferredSize(new java.awt.Dimension(936, 631));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p2.setForeground(new java.awt.Color(240, 240, 240));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setText("Mon");
        jLabel7.setPreferredSize(new java.awt.Dimension(30, 25));
        p2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Tue");
        jLabel8.setPreferredSize(new java.awt.Dimension(30, 25));
        p2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel9.setText("Wed");
        jLabel9.setPreferredSize(new java.awt.Dimension(35, 25));
        p2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 45, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setText("Thu");
        jLabel10.setMaximumSize(new java.awt.Dimension(30, 25));
        jLabel10.setPreferredSize(new java.awt.Dimension(30, 25));
        p2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel11.setText("Fri");
        jLabel11.setPreferredSize(new java.awt.Dimension(30, 25));
        p2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel12.setText("Sat");
        jLabel12.setPreferredSize(new java.awt.Dimension(30, 25));
        p2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel13.setText("Sun");
        p2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Sun-CloudyRain-icon-48px.png")); // NOI18N
        p2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 48));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("28");
        p2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Clouds-icon-28px.png")); // NOI18N
        p2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("30");
        p2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Clouds-icon-28px.png")); // NOI18N
        p2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("30");
        p2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Sun-icon-28px.png")); // NOI18N
        p2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, 48));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("32");
        p2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Sun-icon-28px.png")); // NOI18N
        p2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, 48));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("34");
        p2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Clouds-icon-28px.png")); // NOI18N
        p2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, 48));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("29");
        p2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Rain-icon-48px.png")); // NOI18N
        p2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("26");
        p2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        p2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 22, -1, 126));

        label1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 51, 51));
        label1.setText("60 ");
        p2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        icon1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        icon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\OneDrive\\Documents\\icon\\Weather-Rain-icon-48px.png")); // NOI18N
        p2.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        date1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        date1.setText("Thu,6");
        p2.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        description1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        description1.setText("description");
        p2.add(description1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jPanel2.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 210));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        parentLayOut.add(jPanel3, "card2");

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        jButton5.setBackground(new java.awt.Color(255, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ly Thanh Hai\\Downloads\\icons8-next-page-32.png")); // NOI18N
        jButton5.setFocusPainted(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 857, Short.MAX_VALUE)
                .addComponent(jButton5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );

        parentLayOut.add(jPanel4, "card3");

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(921, 212));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        parentLayOut.add(jPanel5, "card4");

        getContentPane().add(parentLayOut, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
//         parentLayOut.removeAll();
//        parentLayOut.add(jLabel);
//        parentLayOut.repaint();
//        parentLayOut.revalidate();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
     
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//         parentLayOut.removeAll();
//        parentLayOut.add(jPanel5);
//        parentLayOut.repaint();
//        parentLayOut.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
          parentLayOut.removeAll();
        parentLayOut.add(jPanel5);
        parentLayOut.repaint();
        parentLayOut.revalidate();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
          parentLayOut.removeAll();
        parentLayOut.add(jPanel4);
        parentLayOut.repaint();
        parentLayOut.revalidate();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
          parentLayOut.removeAll();
        parentLayOut.add(jPanel3);
        parentLayOut.repaint();
        parentLayOut.revalidate();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void lastestLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastestLocationMouseClicked

    }//GEN-LAST:event_lastestLocationMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
    
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(testCardLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testCardLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testCardLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testCardLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testCardLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date1;
    private javax.swing.JLabel description1;
    private javax.swing.JLabel icon1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label3;
    private javax.swing.JButton lastestLocation;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel parentLayOut;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
