/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reservationdesblocsop.frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jawaher
 */
public class bloc15 extends javax.swing.JFrame {
int xMouse,yMouse;
    /**
     * Creates new form bloc1
     */
    public bloc15() {
        initComponents();
        showbloc();
         setSize(830,490);
        setLocation(345,195);
    }
    public ArrayList <Bloc> bloc15(){
        ArrayList<Bloc> Bloc1 = new ArrayList<>();
        try{
         Class.forName("com.mysql.jdbc.Driver"); 
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservationf","root","");
        String query = "select * from bloc1";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        Bloc bloc;
        while(rs.next()){
            bloc =new Bloc(rs.getDate("jour disponible"),rs.getTime("heure debut disponibilité"),rs.getTime("heure fin disponibilité"));
            Bloc1.add(bloc);
        }   
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
         }
         return Bloc1;
           
    }
    public void showbloc(){
    
    ArrayList<Bloc> List = bloc15();
    DefaultTableModel model =(DefaultTableModel)table.getModel();
    Object[] row = new Object[3];
    for(int i=0;i<List.size();i++){
    row[0]=List.get(i).getddebutdis();
    row[1]=List.get(i).gethdebutdis();
    row[2]=List.get(i).gethfindis();

    model.addRow(row);
    
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        resize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        movejFrame = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "jour disponible", "heure debut disponibilité", "heure fin disponibilité"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 410, 170));

        resize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resizeMouseClicked(evt);
            }
        });
        jPanel1.add(resize, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 20, 20));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 20, 20));

        movejFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movejFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movejFrameMouseDragged(evt);
            }
        });
        movejFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movejFrameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movejFrameMousePressed(evt);
            }
        });
        jPanel1.add(movejFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reservationdesblocop/images/hooo.png"))); // NOI18N
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movejFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movejFrameMouseClicked
    
    }//GEN-LAST:event_movejFrameMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
      this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void resizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resizeMouseClicked
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_resizeMouseClicked

    private void movejFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movejFrameMouseDragged
          int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_movejFrameMouseDragged

    private void movejFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movejFrameMousePressed
          xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_movejFrameMousePressed

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
            java.util.logging.Logger.getLogger(bloc15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bloc15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bloc15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bloc15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bloc15().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel movejFrame;
    private javax.swing.JLabel resize;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
