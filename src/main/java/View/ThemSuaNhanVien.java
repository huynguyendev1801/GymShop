/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.NhanVienController;
import Controller.SanPhamController;
import Controller.TaiKhoanController;
import Model.NhanVienModel;
import Model.SanPhamModel;
import Model.TaiKhoanModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author huyng
 */
public class ThemSuaNhanVien extends javax.swing.JFrame {
    NhanVienController nvctl;
    TaiKhoanController tkctl;
    /**
     * Creates new form ThemSuaChiTietSanPham
     */
    private int status;
    public ThemSuaNhanVien(){
     initComponents();
        CanGiua();
        layMaNhanVienTuDong();
         this.getContentPane().setBackground(new Color(98, 114, 164));
    }
    public ThemSuaNhanVien(NhanVien gdnv) {
        initComponents();
        CanGiua();
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        layMaNhanVienTuDong();
        this.status = 0;
        this.jTFMaNhanVien.setEditable(false);
        this.gdnv = gdnv;
         this.getContentPane().setBackground(new Color(98, 114, 164));
         this.jLabel1.setText("Thêm nhân viên");
    }
    public void layMaNhanVienTuDong(){
         nvctl = new NhanVienController();
         this.jTFMaNhanVien.setText(nvctl.getMaNhanVien());
       
    }
        public ThemSuaNhanVien(NhanVienModel nv, NhanVien gdnv) {
        initComponents();
        CanGiua();
        setThongTin(nv);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        gdnv.hienThiNhanVien();
         this.jTFMaNhanVien.setEditable(false);
        this.status = 1;
        this.gdnv = gdnv;
         this.getContentPane().setBackground(new Color(98, 114, 164));
         this.jLabel1.setText("Sửa nhân viên");

    }
        public void setThongTin(NhanVienModel nv){
            this.jTFMaNhanVien.setText(nv.getMaNhanVien());
            this.jTFHoTen.setText(nv.getHoTen());
            this.jTFDiaChi.setText(nv.getDiaChi());
            this.jTFSoDienThoai.setText(nv.getSoDienThoai());
            this.jTFTenDangNhap.setText(nv.getTenDangNhap());
        }
  public void CanGiua(){
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 2;
        setLocation(x, y);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFMaNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBLuu = new javax.swing.JButton();
        jTFTenDangNhap = new javax.swing.JTextField();
        jTFSoDienThoai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPFMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm nhân viên");

        jLabel2.setText("Mã nhân viên:");

        jLabel3.setText("Họ tên:");

        jLabel4.setText("Địa chỉ:");

        jLabel5.setText("Số điện thoại:");

        jLabel6.setText("Tên đăng nhập:");

        jBLuu.setText("Lưu");
        jBLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLuuActionPerformed(evt);
            }
        });

        jTFTenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTenDangNhapKeyTyped(evt);
            }
        });

        jTFSoDienThoai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFSoDienThoaiKeyTyped(evt);
            }
        });

        jLabel7.setText("Mật khẩu:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPFMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBLuu)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPFMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLuu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosing
private NhanVien gdnv = new NhanVien();
    private void jBLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLuuActionPerformed
        // TODO add your handling code here:
        nvctl = new NhanVienController();
        if(this.status == 0){
        String maNhanVien = this.jTFMaNhanVien.getText();
        String tenNhanVien = this.jTFHoTen.getText();
        String diaChi = this.jTFDiaChi.getText();
        String soDienThoai = this.jTFSoDienThoai.getText();
        String tenDangNhap = this.jTFTenDangNhap.getText();
        String matKhau = this.jPFMatKhau.getPassword().toString();
        
            TaiKhoanModel tk = new TaiKhoanModel(tenDangNhap, matKhau);
            tkctl = new TaiKhoanController();
            tkctl.themTaiKhoan(tk);
            NhanVienModel nv = new NhanVienModel(maNhanVien, tenNhanVien, diaChi, soDienThoai, tenDangNhap);
            nvctl = new NhanVienController();
        nvctl.themNhanVien(nv);
         JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
         this.dispose();
         gdnv.hienThiNhanVien();
        }

        else{
        String maNhanVien = this.jTFMaNhanVien.getText();
        String tenNhanVien = this.jTFHoTen.getText();
        String diaChi = this.jTFDiaChi.getText();
        String soDienThoai = this.jTFSoDienThoai.getText();
        String tenDangNhap = this.jTFTenDangNhap.getText();
            NhanVienModel nv = new NhanVienModel(maNhanVien, tenNhanVien, diaChi, soDienThoai, tenDangNhap);
            nvctl = new NhanVienController();
        nvctl.suaNhanVien(nv);
         JOptionPane.showMessageDialog(this, "Sửa nhân viên thành công!");
         this.dispose();
         gdnv.hienThiNhanVien();
        }
    }//GEN-LAST:event_jBLuuActionPerformed

    private void jTFTenDangNhapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTenDangNhapKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTenDangNhapKeyTyped

    private void jTFSoDienThoaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFSoDienThoaiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSoDienThoaiKeyTyped
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
            java.util.logging.Logger.getLogger(ThemSuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSuaNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPFMatKhau;
    private javax.swing.JTextField jTFDiaChi;
    private javax.swing.JTextField jTFHoTen;
    private javax.swing.JTextField jTFMaNhanVien;
    private javax.swing.JTextField jTFSoDienThoai;
    private javax.swing.JTextField jTFTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
