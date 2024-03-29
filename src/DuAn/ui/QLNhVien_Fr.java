/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.ui;

import DuAn.dao.NhanVienDAO;
import DuAn.entity.NhanVien;
import DuAn.utils.Auth;
import DuAn.utils.MsgBox;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class QLNhVien_Fr extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiNhanVien_Frame
     */
    public QLNhVien_Fr() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
        init();
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fpt.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrVaiTro = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        lblXacNhanMatKhau = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        rdoTruongPhong = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        txtXacNhanMatKhau = new javax.swing.JPasswordField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtHoTen = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        pnlList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÍ NHÂN VIÊN");
        setBackground(new java.awt.Color(0, 102, 102));

        lblMaNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMaNV.setText("Mã nhân viên :");

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMatKhau.setText("Mật khẩu :");

        lblXacNhanMatKhau.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblXacNhanMatKhau.setText("Xác nhận mật khẩu :");

        lblHoTen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHoTen.setText("Họ và tên :");

        lblVaiTro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVaiTro.setText("Vai trò :");

        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
        });

        bgrVaiTro.add(rdoTruongPhong);
        rdoTruongPhong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdoTruongPhong.setText("Trưởng phòng");

        bgrVaiTro.add(rdoNhanVien);
        rdoNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdoNhanVien.setSelected(true);
        rdoNhanVien.setText("Nhân viên");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblXacNhanMatKhau)
                            .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID)
                            .addComponent(txtMatKhau)
                            .addComponent(txtXacNhanMatKhau)
                            .addComponent(txtHoTen)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlEditLayout.createSequentialGroup()
                                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlEditLayout.createSequentialGroup()
                                        .addComponent(rdoNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(rdoTruongPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))
                                .addGap(18, 18, 18)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoi)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtXacNhanMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lblXacNhanMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoNhanVien)
                    .addComponent(rdoTruongPhong))
                .addGap(48, 48, 48)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(btnThem))
                .addGap(39, 39, 39))
        );

        tabs.addTab("CẬP NHẬT", pnlEdit);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ NHÂN VIÊN", "MẬT KHẨU", "HỌ VÀ TÊN", "VAI TRÒ"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabs.addTab("DANH SÁCH", pnlList);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QUẢN LÍ NHÂN VIÊN QUẢN TRỊ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkTrungMa(JTextField txt) {//kiểm tra trùng mã nhân viên
        txt.setBackground(white);
        if (dao.selectById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(Color.pink);
            MsgBox.showMessageDialog(this,"Mã nhân viên "+ txt.getText()+ " đã tồn tại");
            return false;
        }
    }

    public boolean validateForm() {//kiểm tra nhập liệu để trống
        if (txtID.getText().isEmpty() || txtHoTen.getText().isEmpty() || txtMatKhau.getText().isEmpty() || txtXacNhanMatKhau.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String s1 = txtMatKhau.getText();
        String s2 = txtXacNhanMatKhau.getText();
            if (s1.equals(s2)==false) {
                MsgBox.showMessageDialog(this,  "Mật khẩu không khớp");
                txtXacNhanMatKhau.setBackground(Color.pink);
                return;
            }
        if (validateForm()) {
            if (checkTrungMa(txtID)) {
                insert(); 
                tabs.setSelectedIndex(1);
            }
        }else{
            MsgBox.showMessageDialog(this, "Bạn chưa nhập đầy đủ thông tin !");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String s1 = txtMatKhau.getText();
        String s2 = txtXacNhanMatKhau.getText();
            if (s1.equals(s2)==false) {
                MsgBox.showMessageDialog(this,  "Mật khẩu không khớp");
                txtXacNhanMatKhau.setBackground(Color.pink);
                return;
            }
            if  (MsgBox.showConfirmDialog(this, "Bạn thực sự muốn cập nhật nhân viên này")) {
                this.update();
            }
            
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
       this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
       this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
       this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount()==1) {
            this.row = tblNhanVien.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
       txtID.setBackground(white);
    }//GEN-LAST:event_txtIDFocusGained

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
            java.util.logging.Logger.getLogger(QLNhVien_Fr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhVien_Fr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhVien_Fr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhVien_Fr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhVien_Fr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrVaiTro;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JLabel lblXacNhanMatKhau;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtXacNhanMatKhau;
    // End of variables declaration//GEN-END:variables

    void init(){
        fillTable();
        updateStatus();
    }
    
    //chỉ trưởng phòng mới đc xem mật khẩu người khác
    public String matKhauToSao(String pass){
        String sao="";
        for(int i=0;i<pass.length();i++){
            sao+="*";
        }
        return sao;
    }
    
    NhanVienDAO dao = new NhanVienDAO();
       void fillTable(){
    //lấy list nhanVien từ CSDL điền vào bảng
    //LƯU Ý: CHỈ TRƯỞNG PHÒNG MỚI XEM ĐƯỢC MẬT KHẨU CỦA NGƯỜI KHÁC
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.selectAll();
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNV(),
                    Auth.user.isVaiTro()?nv.getMatKhau():matKhauToSao(nv.getMatKhau()),
//                  nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.isVaiTro()?"Trưởng phòng" :"Nhân viên"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }
       
    NhanVien getForm(){    
    //lấy thông tin trên form cho vào đt nhanVien
    //return nhanVien
    
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtID.getText());
        nv.setHoTen(txtHoTen.getText());
        nv.setMatKhau(txtMatKhau.getText());
        boolean vaitro = true; //mac dinh la nv
        if (rdoTruongPhong.isSelected()) {
            vaitro = true;//Nam
        }else{
            vaitro=false;
        }
        nv.setVaiTro(vaitro);
        return nv;
    }
    void setForm(NhanVien nv){
    //đưa thông tin nhanVien lên form theo model
    
        txtID.setText(nv.getMaNV());
        txtHoTen.setText(nv.getHoTen());
        txtMatKhau.setText(nv.getMatKhau());
        txtXacNhanMatKhau.setText(nv.getMatKhau());
        if (nv.isVaiTro()==true) {
            rdoTruongPhong.setSelected(true);
        } else {
            rdoNhanVien.setSelected(true);
        }
        
    }
      
    int row = -1; //chứa vị trị hiện hành của nhân viên
    
    void edit(){//điền thông tin đt nhanVien lên form (theo vị trí row)
        try {
          String maNV = (String) tblNhanVien.getValueAt(this.row,0);
          NhanVien nv = dao.selectById(maNV);
          this.setForm(nv);
          this.updateStatus();
          tabs.setSelectedIndex(0);
        } catch (Exception e) {
            MsgBox.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
          
    }
    void first(){
          this.row = 0;
          this.edit();
    }
    
    void prev(){
          if (this.row > 0) {
              this.row--;
              this.edit();
          }
    }
      
    void next(){
           if (this.row < tblNhanVien.getRowCount() - 1) {
              this.row++;
              this.edit();
          } 
    }
    
    void last(){
           this.row = tblNhanVien.getRowCount() -1 ;
           this.edit();
    }
      
    void insert(){
    //lấy thông tin trên form để
    //thêm (đăng kí) nhân viên - trưởng phòng vào CSDL
          NhanVien model = getForm();
          try {
              dao.insert(model);
              this.fillTable();
              this.clearForm();
              MsgBox.showMessageDialog(this, "Thêm mới nhân viên thành công");
          } catch (Exception e) {
              MsgBox.showMessageDialog(this, "Thêm mới nhân viên thất bại !");
              e.printStackTrace();
          }
      }

      void update(){
    //lấy thông tin trên form để
    //cập nhật nhanVien theo maNV
          NhanVien model = getForm();
          try {
              dao.update(model);
              this.fillTable();
              this.clearForm();
              MsgBox.showMessageDialog(this, "Cập nhật nhân viên thành công");
          } catch (Exception e) {
              MsgBox.showMessageDialog(this, "Cập nhật nhân viên thất bại !");
              e.printStackTrace();
          }
      }
      
      void delete(){
    //lấy maNV trên form, xóa nv theo maNV
    //xóa trắng form
          if (!Auth.isManager()) { //kiểm tra nếu là trưởng phòng mới có quyền xóa
              MsgBox.showMessageDialog(this, "Bạn không có quyền xóa nhân viên");
          }else{
              String manv = txtID.getText();
              if (manv.equals(Auth.user.getMaNV())) {
                MsgBox.showMessageDialog(this, "Bạn không được xóa chính mình");
              }
              else if  (MsgBox.showConfirmDialog(this, "Bạn thực sự muốn xóa nhân viên này")) {
                  try {
                      dao.delete(manv);
                      this.fillTable();
                      this.clearForm();
                  }catch (Exception e) {
                    MsgBox.showMessageDialog(this, "Không thể xóa nhân viên");   
              }
           }
        }      
    }
      
       void updateStatus(){  //cập nhật trạng thái form
          boolean edit = (this.row >= 0); //đang chọn một hàng nào đó ->> trạng thái edit
          boolean first = (this.row == 0); //đang ở bản ghi đầu tiên 
          boolean last = (this.row == tblNhanVien.getRowCount() - 1); // đang ở bản ghi cuối cùng
          
          //trạng thái form
          txtID.setEditable(!edit);
          btnThem.setEnabled(!edit);
          btnSua.setEnabled(edit);
          btnXoa.setEnabled(edit);
          
          //trạng thái điều hướng 
          btnFirst.setEnabled(edit && !first);
          btnPrev.setEnabled(edit && !first);
          btnNext.setEnabled(edit && !last);
          btnLast.setEnabled(edit && !last);
      }
       
      void clearForm(){ //xóa trắng form
          this.setForm(new NhanVien());
          this.row = -1;
          this.updateStatus();
          rdoNhanVien.setSelected(true);
          txtID.setBackground(white);
          txtXacNhanMatKhau.setBackground(white);
      }
}
