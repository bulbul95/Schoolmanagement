/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frams;

import com.abc.util.DBConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bulbul Akter
 */
public class DailyAttendene extends javax.swing.JFrame {
//    Connection con;
//    PreparedStatement pst;
//    // List<Produk> plist;
//    Object[] data;
//    DefaultTableModel table1;
Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    int lastid;


    /**
     * Creates new form HomePage
     */
    public DailyAttendene() {
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
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        atserach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        image = new javax.swing.JButton();
        atname = new javax.swing.JTextField();
        atcourse = new javax.swing.JTextField();
        atround = new javax.swing.JTextField();
        attend = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        btnview = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField10.setText("jTextField10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DAILY ATTENDENCE");

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
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(213, 213, 213)
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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 860, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Search By Id");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finger (2).jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 90, 100));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_1.jpg"))); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 39));

        atserach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        atserach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atserachActionPerformed(evt);
            }
        });
        atserach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                atserachKeyReleased(evt);
            }
        });
        getContentPane().add(atserach, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Student Id", "Name", "Course", "Round", "Day", "Month", "Year"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 210));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/picrita.jpg"))); // NOI18N
        image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageActionPerformed(evt);
            }
        });
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 90, 100));

        atname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(atname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 150, -1));

        atcourse.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(atcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 150, -1));

        atround.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        atround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atroundActionPerformed(evt);
            }
        });
        getContentPane().add(atround, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 150, -1));

        attend.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(attend, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 150, -1));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 170, -1));

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
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 110, 40));

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
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 120, 40));

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
        getContentPane().add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 70, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
        new FacultyDashboad().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
//        String Id = stid.getText();
//        String Name = atname.getText();
//        String Course = atcourse.getText();
//        String Round = vb atround.getText();
//        int Day=date.getJCalendar().getDayChooser().getDay();
//                
//        SimpleDateFormat sdf1 = new SimpleDateFormat ("MM", Locale.getDefault());
//        String Month = sdf1.format(new Date (System.currentTimeMillis()));
//        int Year=date.getJCalendar().getYearChooser().getYear();
//
//       try {//id, studentid, name, course, round, day, month, year
//            String sql = "insert into dailyattendence(studentid, name, course, round, day, month, year) values (?,?,?,?,?,?,?)";
//            con = DBConnection.getConnection();
//            pst = con.prepareStatement(sql);
//            System.out.println("Data connected");
//           
//            pst.setString(1, Id);
//            pst.setString(2, Name);
//            pst.setString(3, Course);
//            pst.setString(4, Round);
//            pst.setInt(5, Day);
//            pst.setString(6, Month);
//            pst.setInt(7, Year);
//            int i = pst.executeUpdate();
//            if(i>0){
//                JOptionPane.showMessageDialog(rootPane, "Data Save");
//            }else{
//                JOptionPane.showMessageDialog(rootPane, "Data are not Save");
//            
//        }
//            con.close();
//            System.out.println(i);
//            
//        } catch (Exception e) {
//            
//        }
     
        try {
                //String d = date.getDate().toString();

                String value1 = atserach.getText();
                String value2 = atname.getText();
                String value3 = atcourse.getText();
                String value4 = atround.getText();
                String value5 = attend.getText();
                int day=date.getJCalendar().getDayChooser().getDay();
                
                SimpleDateFormat sdf1 = new SimpleDateFormat ("MM", Locale.getDefault());
                String month = sdf1.format(new Date (System.currentTimeMillis()));
                int year=date.getJCalendar().getYearChooser().getYear();

                System.out.println(value1 + " " + value2 + " " + value3+" "+value5);
                System.out.println(value4);
                System.out.println(day);
                System.out.println(month);
                System.out.println(year);
                //id, studentid, name, course, round, day, month, year
                String sql = "insert into dailyattendence (studentid, name, course, round, day, month, year, status) values ('" + value1 + "','" + value2 + "','" + value3 + "','" + value4 + "','" + day+"','"+month+"','"+year + "','" + value5 + "')";

                pst = con.prepareStatement(sql);
                pst.execute();
                //JOptionPane.showMessageDialog(null, "Attandance Added");

            } catch (Exception e) {
                Logger.getLogger(DailyAttendene.class.getName()).log(Level.SEVERE, null, e);
            
    }                  
        
            
       
    }//GEN-LAST:event_btnsaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atserachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atserachKeyReleased
        // TODO add your handling code here:
        if(atserach.getText().equals("")){
            atserach.setText(String.valueOf(0));
        }
        try {
            // TODO add your handling code here:

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tspmanagementsystem", "root", "root");

            pst = con.prepareStatement("select * from addstudent where id=?");

            pst.setInt(1, Integer.parseInt(atserach.getText()));

            ResultSet rst = pst.executeQuery();

            while (rst.next()) {//id, name, coursename, branch, round, gender, phoneno, email
                
                
                String ID = rst.getString("id");
                String Name = rst.getString("name");
                String Course = rst.getString("coursename");
                String Round = rst.getString("round");
                
              
                

               atserach.setText(ID);
               atname.setText(Name);
               atcourse.setText(Course);
               atround.setText(Round);
                }

        } catch (SQLException e) {
            e.printStackTrace();
        }



        
    }//GEN-LAST:event_atserachKeyReleased

    private void atroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atroundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atroundActionPerformed

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseExited

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String sql = "update dailyattendence set name = ?, coursename = ?, branch = ?, round=?, gender=?, phoneno=?,email=? where id = ?";

        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setString(1, atname.getText());
            ps.setString(2, atcourse.getText());
            
            ps.setString(3, atround.getText());
            
            ps.setString(4, attend.getText());
            int status = ps.executeUpdate();
            if(status > 0){
                JOptionPane.showMessageDialog(rootPane, attend.getText() + " Data Updated");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_updateActionPerformed

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
            String sql = "delete from dailyattendence where id = ?";
            try {
                PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
                ps.setInt(1, Integer.valueOf(attend.getText()));
                int status = ps.executeUpdate();
                if(status >0){
                    JOptionPane.showMessageDialog(rootPane, "Product deleted!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Your Data is safe!");
        }
        attend.setText("");
    }//GEN-LAST:event_DeleteActionPerformed

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

    private void btnviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewMouseEntered

    private void btnviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewMouseExited

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //id, name, coursename, branch, round, gender, phoneno, email
        try{
            con = DBConnection.getConnection();
            st =con.createStatement();
            String sql = "select*from dailyattendence";
            rs = pst.executeQuery(sql);
            while(rs.next()){
                String sid =String.valueOf(rs.getInt("id"));
                String sname = rs.getString("studentid");//first nijer 2nd database
                String scourename = rs.getString("name");
               
                String sround = rs.getString("course");
                
                String Round = rs.getString("round");
                String Day = rs.getString("day");
                String Month = rs.getString("month");
                String Year = rs.getString("year");
                System.out.println("name ....\"+StudentName+\"     \"+ \"branch...\" + Branch");
                System.out.println("round....\"+Round+\"    \"+\"date...\"+Date");

                String tdata[] = {sid,sname,scourename,Round,Day,Month,Year};

                DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                dtm.addRow(tdata);
            }
            con.close();
        }catch(NumberFormatException | SQLException e){

        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void atserachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atserachActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tspmanagementsystem", "root", "root");

            pst = con.prepareStatement("select * from dailyattendence where id=?");

            pst.setInt(1, Integer.parseInt(atserach.getText()));

            ResultSet rst = pst.executeQuery();

            while (rst.next()) {//id, name, coursename, branch, round, gender, phoneno, email
                
                
                String ID = rst.getString("id");
                String Name = rst.getString("name");
                String Course = rst.getString("coursename");
                String Round = rst.getString("round");
                
              
                

               attend.setText(ID);
               atname.setText(Name);
               atcourse.setText(Course);
               atround.setText(Round);
                }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_atserachActionPerformed

    private void imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imageActionPerformed
 public void clear(){
        attend.setText("");
        atname.setText("");
        atcourse.setText("");
        atround.setText("");
        
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
            java.util.logging.Logger.getLogger(DailyAttendene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailyAttendene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailyAttendene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailyAttendene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailyAttendene().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField atcourse;
    private javax.swing.JTextField atname;
    private javax.swing.JTextField atround;
    private javax.swing.JTextField atserach;
    private javax.swing.JTextField attend;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnview;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
