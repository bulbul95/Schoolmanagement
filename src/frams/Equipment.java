/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frams;

import com.abc.util.DBConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bulbul Akter
 */
public class Equipment extends javax.swing.JFrame {
DBConnection dbconnection;
    Connection con;
    PreparedStatement ps;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form HomePage
     */
    public Equipment() {
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

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        ename = new javax.swing.JTextField();
        eassign = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltable = new javax.swing.JTable();
        btnsave = new javax.swing.JButton();
        update = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        search = new javax.swing.JButton();
        equantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ecost = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Equipment");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOutt.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(347, 347, 347)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 860, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/line.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 860, 30));

        sid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 180, 30));

        ename.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, 30));

        eassign.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(eassign, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 180, 30));

        ltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "equipmentName", " Assign Branch", "quantity", "date", "cost"
            }
        ));
        jScrollPane1.setViewportView(ltable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 460, 240));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_1.jpg"))); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 39));

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UPDATE.png"))); // NOI18N
        update.setText("UPDATE ");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 130, 40));

        Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearMouseExited(evt);
            }
        });
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 120, 40));

        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 110, 40));

        btnview.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SHOWBATON.png"))); // NOI18N
        btnview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviewMouseExited(evt);
            }
        });
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 70, 40));

        search.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, -1));

        equantity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(equantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("EQUIPMENT NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("ASSIGN TO BRANCH");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("QUANTITY");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("COST");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, -1));

        ecost.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(ecost, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminDashboardd().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String id, equipmentname,equipmentassing,quantity,cost;
        equipmentname = (String) ename.getText();
        equipmentassing = (String)eassign.getText();
        quantity = (String)equantity.getText();
        cost = (String)ecost.getText();
       

        try {//id, equipmentname, assigntolab, quantity, cost
            String sql = "insert into addequipment( equipmentname, assigntolab, quantity, cost) values (?,?,?,?)";
            con = dbconnection.getConnection();
            ps = con.prepareStatement(sql);
            System.out.println("Data connected");

            ps.setString(1, equipmentname);
            ps.setString(2, equipmentassing);
            ps.setString(3, quantity);
            ps.setString(4, cost);
            int i = ps.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(rootPane, "Data Save");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Data are not Save");

            }
            con.close();
            System.out.println(i);

        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseExited

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       String sql = "update addequipment set , equipmentname = ?, assigntolab = ?, quantity=?, cost=? where id = ?";

        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setString(1, ename.getText());
            ps.setString(2, eassign.getText());
            ps.setString(2, equantity.getText());
            ps.setString(2, ecost.getText());
            ps.setString(3, sid.getText());
            int status = ps.executeUpdate();
            if(status > 0){
                JOptionPane.showMessageDialog(rootPane, sid.getText() + " Data Updated");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_updateActionPerformed

    private void ClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseEntered

    private void ClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseExited

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_ClearActionPerformed

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        // TODO add your handling code here:
        Delete.setBackground(new Color(102, 102, 255));
        Delete.setForeground(Color.white);
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        // TODO add your handling code here:
        Delete.setForeground(new Color(102, 102, 255));
        Delete.setBackground(Color.white);
    }//GEN-LAST:event_DeleteMouseExited

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete?", null, WIDTH);
        if(option == 0){
            String sql = "delete from addequipment where id = ?";
            try {
                PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
                ps.setInt(1, Integer.valueOf(sid.getText()));
                int status = ps.executeUpdate();
                if(status >0){
                    JOptionPane.showMessageDialog(rootPane, "Product deleted!");
                }
                } catch (SQLException ex) {
                Logger.getLogger(Equipment.class.getName()).log(Level.SEVERE, null, ex);
           // } catch (SQLException ex) {
               // Logger.getLogger(Lab.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Your Data is safe!");
        }
        sid.setText("");
    }//GEN-LAST:event_DeleteActionPerformed

    private void btnviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewMouseEntered

    private void btnviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewMouseExited

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
       
        try{
            con = DBConnection.getConnection();
            stm =con.createStatement();
            String sql = "select*from addequipment";
            rs = stm.executeQuery(sql);
            while(rs.next()){
                String sid =String.valueOf(rs.getInt("id"));
                //first nijer 2nd database
                String ename = rs.getString("equipmentname");
                String eassign = rs.getString("assigntolab");
                String equantity = rs.getString("quantity");
                String ecost = rs.getString("cost");
                
                

                System.out.println("name ....\"+StudentName+\"     \"+ \"branch...\" + Branch");
                System.out.println("round....\"+Round+\"    \"+\"date...\"+Date");

                String tdata[] = {sid,ename,eassign,equantity,ecost};

                DefaultTableModel dtm = (DefaultTableModel) ltable.getModel();
                dtm.addRow(tdata);
            }
            con.close();
        }catch(NumberFormatException | SQLException e){

        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String pid= sid.getText();
        System.out.println(pid);
        String bulbul = "select * from addequipment where id = ?";
        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(bulbul);
            ps.setString(1, Integer.valueOf(pid).toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                ename.setText(rs.getString("equipmentname"));
                eassign.setText(rs.getString("assigntolab"));
                equantity.setText(rs.getString("quantity"));
                ecost.setText(rs.getString("cost"));
                

                System.out.println("serch");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed
public void clear(){
        sid.setText("");
        ename.setText("");
        eassign.setText("");
       
        equantity.setText("");
       
        ecost.setText("");
       
        
    }
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
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnview;
    private javax.swing.JTextField eassign;
    private javax.swing.JTextField ecost;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField equantity;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable ltable;
    private javax.swing.JButton search;
    private javax.swing.JTextField sid;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
