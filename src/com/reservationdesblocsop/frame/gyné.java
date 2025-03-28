package com.reservationdesblocsop.frame;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chayma
 */
public class gyné extends javax.swing.JInternalFrame {

    /**
     * Creates new form gyné
     */
    public gyné() throws ClassNotFoundException, SQLException {
        initComponents();
        showbloc();
    }

    public ArrayList<seulebloc> gynéBloc() throws ClassNotFoundException, SQLException{
        ArrayList<seulebloc> gynéBloc = new ArrayList<>();
         try
         {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservationf","root","");
        String query ="select * from blocgyné";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        seulebloc bloc;
        while(rs.next()){
            bloc =new seulebloc(rs.getString("N° bloc")); 
            gynéBloc.add(bloc);
        }
         }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
         }
        
        
        return gynéBloc;

    }
    
    
public void showbloc() throws ClassNotFoundException, SQLException{
   ArrayList<seulebloc> List = gynéBloc();
    DefaultTableModel model = (DefaultTableModel)table.getModel();
    Object[] row = new Object[1];
    for(int i=0;i<List.size();i++){
    row[0]=List.get(i).getNbloc();
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
        jLabel1 = new javax.swing.JLabel();

        setTitle("Gynécologie");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BLOC"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reservationdesblocop/images/jj.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel)table.getModel();
       int selectedrow = table.getSelectedRow();
       String selected =model.getValueAt(selectedrow,0).toString();
       String m ="bloc 1";
       String n="bloc 2";
       if(selected.equals(m)){
       bloc1 bloc = new bloc1();
       bloc.setVisible(true);}
       else{
       bloc2 bloc = new bloc2();
       bloc.setVisible(true);
       }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
