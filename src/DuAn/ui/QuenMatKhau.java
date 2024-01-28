package DuAn.ui;

import DuAn.dao.NhanVienDAO;
import DuAn.entity.NhanVien;
import DuAn.utils.MsgBox;
import java.awt.Color;
import java.awt.Toolkit;
import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class QuenMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form QuenMatKhau1
     */
    public QuenMatKhau() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("QUÊN MẬT KHẨU");
        txtpassmoi1.setToolTipText("Mật khẩu mới của bạn !");
        txtpasscu.setToolTipText("Nhập mã xác nhận được gửi đến email của bạn !");
        icon2.setVisible(false);
        icon4.setVisible(false);
        randCode();
        setIcon();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fpt.png")));
    }

    public void clearForm() {
        txtpasscu.setText("");
        txtpassmoi1.setText("");
        txtpassmoi2.setText("");
    }

    public void randCode() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 6;
        Random random = new Random();

        String randomCode = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        lblCode.setText(randomCode);
        System.out.println(lblCode.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        txttk = new javax.swing.JTextField();
        txtpassmoi1 = new javax.swing.JPasswordField();
        txtpassmoi2 = new javax.swing.JPasswordField();
        btnChangePass = new javax.swing.JButton();
        txtpasscu = new javax.swing.JTextField();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Thay đổi mật khẩu");

        jLabel3.setText("Tên đăng nhập :");

        jLabel4.setText("Mật khẩu :");

        jLabel5.setText("Mật khẩu mới");

        jLabel6.setText("Xác nhận mật khẩu");

        login.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        login.setForeground(new java.awt.Color(51, 102, 255));
        login.setText("Click here to login");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        txttk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttkFocusGained(evt);
            }
        });

        txtpassmoi2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassmoi2FocusGained(evt);
            }
        });

        btnChangePass.setBackground(new java.awt.Color(0, 102, 255));
        btnChangePass.setForeground(new java.awt.Color(255, 255, 0));
        btnChangePass.setText("Thay đổi mật khẩu");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        txtpasscu.setToolTipText("");
        txtpasscu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasscuFocusGained(evt);
            }
        });

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/icon/show.png"))); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/icon/hide.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/icon/hide.png"))); // NOI18N
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon4MousePressed(evt);
            }
        });

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAn/icon/show.png"))); // NOI18N
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon3MousePressed(evt);
            }
        });

        lblCode.setBackground(new java.awt.Color(0, 0, 0));
        lblCode.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(37, 37, 37)))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtpasscu, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                            .addComponent(txttk))
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtpassmoi1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(login))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnChangePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtpassmoi2)
                                            .addComponent(lblCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(icon3)))
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txttk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpasscu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtpassmoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtpassmoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnChangePass))
                            .addComponent(login))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        new Login_Dialog(this, true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    public boolean validateForm() {  // Kiểm tra dữ liệu nhập vào 
        if (txttk.getText().isEmpty() || txtpasscu.getText().isEmpty()
                || txtpassmoi1.getText().isEmpty() || txtpassmoi2.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed

        if (validateForm()) {
            NhanVienDAO dao = new NhanVienDAO();

            try {
                 String s1 = txtpassmoi1.getText();
                String s2 = txtpassmoi2.getText();
                if (s1.equals(s2) == false) {
                    MsgBox.showMessageDialog(this, "Mật khẩu không khớp");
                    txtpassmoi2.setBackground(Color.red);
                    return;
                }
                String s3 = lblCode.getText();
                String s4 = txtpasscu.getText();

                if (s3.equals(s4) == false) {
                    MsgBox.showMessageDialog(this, "Mã xác nhận không khớp");
                    txtpasscu.setBackground(Color.red);
                    return;
                }

                NhanVien nv = dao.selectById(txttk.getText()); // Tìm kiếm mã người dùng
                if (nv == null) {
                    MsgBox.showErrorDialog(this, "Tên đăng nhập không hợp lệ", "LỖI !");
                    txttk.setBackground(Color.red);
                } else {
                    int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn thay đổi mật khẩu không ?",
                            "THÔNG BÁO !", JOptionPane.YES_OPTION,
                             JOptionPane.QUESTION_MESSAGE);
                    if (i == 0) {

                        //câu lệnh để thay đổi mật khẩu 
                        try {
                            NhanVien user = new NhanVien();
                            user.setMaNV(txttk.getText());
                            user.setMatKhau(txtpassmoi1.getText());

                            dao.qmk(user);

                            JOptionPane.showMessageDialog(this, "Mật khẩu đã được thay đổi !");
                            clearForm();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "LỖI !!!\n" + e.getMessage());
                         }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.showErrorDialog(this, e.getMessage(), "LỖI");
            }
        } else {
            MsgBox.showMessageDialog(this, "Bạn chưa nhập đầy đủ thông tin");
            return;
        }
    }//GEN-LAST:event_btnChangePassActionPerformed

    //Ẩn hoặc hiện mật khẩu

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        txtpassmoi1.setEchoChar((char) 0);
    }//GEN-LAST:event_icon1MousePressed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        txtpassmoi1.setEchoChar('*');
    }//GEN-LAST:event_icon2MousePressed

    private void icon4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MousePressed
        icon3.setVisible(true);
        icon4.setVisible(false);
        txtpassmoi2.setEchoChar('*');
    }//GEN-LAST:event_icon4MousePressed

    private void icon3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MousePressed
        icon4.setVisible(true);
        icon3.setVisible(false);
        txtpassmoi2.setEchoChar((char) 0);
    }//GEN-LAST:event_icon3MousePressed

    private void txtpassmoi2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassmoi2FocusGained
        txtpassmoi2.setBackground(Color.white);
    }//GEN-LAST:event_txtpassmoi2FocusGained

    private void txtpasscuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasscuFocusGained
        txtpasscu.setBackground(Color.white);
    }//GEN-LAST:event_txtpasscuFocusGained

    private void txttkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttkFocusGained
        txttk.setBackground(Color.white);
    }//GEN-LAST:event_txttkFocusGained

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
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel login;
    private javax.swing.JTextField txtpasscu;
    private javax.swing.JPasswordField txtpassmoi1;
    private javax.swing.JPasswordField txtpassmoi2;
    private javax.swing.JTextField txttk;
    // End of variables declaration//GEN-END:variables

    public void sendMail() {
        final String username = "haideptrai210402@gmail.com";
        final String password = "minhhieu21";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        //Đăng nhập gmail
    }
}
