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
public class AssignCourseToFaculty extends javax.swing.JFrame {
DBConnection dbconnection;
    Connection con;
    PreparedStatement ps;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form HomePage
     */
    public AssignCourseToFaculty() {
        initComponents();
        try {
             con = DBConnection.getConnection();
            stm =con.createStatement();
            String sql = "select*from addfaculty";
            rs = stm.executeQuery(sql);
            while(rs.next()){
                fname.setSelectedItem(rs.getString("name").toString());
            
            }
        } catch (Exception e) {
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

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        ephoneno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        etable = new javax.swing.JTable();
        btnsave = new javax.swing.JButton();
        update = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        search = new javax.swing.JButton();
        cround = new javax.swing.JTextField();
        eemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JComboBox();
        egender = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Assign Course to Faculty");

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
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(230, 230, 230)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 860, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/line.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 860, 30));

        sid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 180, 30));

        cname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, -1));

        ephoneno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ephoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ephonenoActionPerformed(evt);
            }
        });
        getContentPane().add(ephoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, 30));

        etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Course Name", "Phone No", "Round", "Email", "Gender"
            }
        ));
        jScrollPane1.setViewportView(etable);

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

        cround.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(cround, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 180, -1));

        eemail.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(eemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText(" NAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("ROUND");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("EMAIL");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("GENDER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 70, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("PHONE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 40));

        fname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SelectName-", "Maruf Hassan", "Habib", "Lelen", "Nasim", "Sahanaz" }));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, -1));

        egender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(egender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 180, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("COURESE NAME");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 30));

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
        String id, coursename,round,phoneno,email,gender, fName;
        coursename = (String) cname.getText();
        round = (String)cround.getText();
        phoneno = (String)ephoneno.getText();
        email = (String)eemail.getText();
        gender = (String)egender.getText();
        fName = (String)fname.getSelectedItem();
       

        try {//id, coursename, round, gender, phoneno, email
            String sql = "insert into assigncoursetofaculty( coursename, round, gender, phoneno, email, name) values (?,?,?,?,?,?)";
            con = dbconnection.getConnection();
            ps = con.prepareStatement(sql);
            System.out.println("Data connected");

            ps.setString(1, coursename);
            ps.setString(2, round);
            ps.setString(3, phoneno);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setString(6, fName);
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
       String sql = "update assigncoursetofaculty set , coursename = ?, round = ?, gender=?, phoneno=?,email=? where id = ?";

        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setString(1, cname.getText());
            ps.setString(2, ephoneno.getText());
            ps.setString(3, cround.getText());
            ps.setString(4, eemail.getText());
            ps.setString(5, egender.getText());
            ps.setString(6, sid.getText());
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
            String sql = "delete from assigncoursetofaculty where id = ?";
            try {
                PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
                ps.setInt(1, Integer.valueOf(sid.getText()));
                int status = ps.executeUpdate();
                if(status >0){
                    JOptionPane.showMessageDialog(rootPane, "Product deleted!");
                }
                } catch (SQLException ex) {
                Logger.getLogger(AssignCourseToFaculty.class.getName()).log(Level.SEVERE, null, ex);
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
            String sql = "select*from assigncoursetofaculty";
            rs = stm.executeQuery(sql);
            while(rs.next()){
                String sid =String.valueOf(rs.getInt("id"));
                //first nijer 2nd database
                String cname = rs.getString("coursename");
                String ephoneno = rs.getString("phoneno");
                String cround = rs.getString("round");
                String eemail = rs.getString("email");
                String gender = rs.getString("gender");
                
                

                System.out.println("name ....\"+StudentName+\"     \"+ \"branch...\" + Branch");
                System.out.println("round....\"+Round+\"    \"+\"date...\"+Date");

                String tdata[] = {sid,cname,ephoneno,cround,eemail,gender};

                DefaultTableModel dtm = (DefaultTableModel) etable.getModel();
                dtm.addRow(tdata);
            }
            con.close();
        }catch(NumberFormatException | SQLException e){

        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String pid= sid.getText();
        System.out.println(pid);
        String bulbul = "select * from assigncoursetofaculty where id = ?";
        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(bulbul);
            ps.setString(1, Integer.valueOf(pid).toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                cname.setText(rs.getString("coursename"));
                ephoneno.setText(rs.getString("phoneno"));
                cround.setText(rs.getString("round"));
                eemail.setText(rs.getString("email"));
                egender.setText(rs.getString("gender"));
                

                System.out.println("serch");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void ephonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ephonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ephonenoActionPerformed
public void clear(){
        sid.setText("");
        cname.setText("");
        ephoneno.setText("");
        egender.setText("");
        cround.setText("");
       
        eemail.setText("");
       
        
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
            java.util.logging.Logger.getLogger(AssignCourseToFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignCourseToFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignCourseToFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignCourseToFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignCourseToFaculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnview;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cround;
    private javax.swing.JTextField eemail;
    private javax.swing.JTextField egender;
    private javax.swing.JTextField ephoneno;
    private javax.swing.JTable etable;
    private javax.swing.JComboBox fname;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton search;
    private javax.swing.JTextField sid;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
