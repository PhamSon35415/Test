/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.dao;

import DuAn.entity.NhanVien;
import DuAn.utils.DBConnect;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class NhanVienDAO extends EduSysDAO<NhanVien, String>{

    @Override
    public void insert(NhanVien model) {
        String sql="INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
        DBConnect.update(sql, 
        model.getMaNV(), 
        model.getMatKhau(), 
        model.getHoTen(),
        model.isVaiTro()); 
    }

    @Override
    public void update(NhanVien model) {
        String sql="UPDATE NhanVien SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNV=?";
        DBConnect.update(sql, 
        model.getMatKhau(), 
        model.getHoTen(), 
        model.isVaiTro(),
        model.getMaNV());  
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM NhanVien WHERE MaNV = ? ";
        DBConnect.update(sql, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        String sql = "select MaNv, MatKhau, HoTen, VaiTro from NhanVien";
        return this.selectBySql(sql);
    }
    
    @Override
    public NhanVien selectById(String MaNV) {
        String sql = "select MaNv, MatKhau, HoTen, VaiTro from NhanVien WHERE MaNv=?";
        List<NhanVien> list = selectBySql(sql, MaNV);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
    List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DBConnect.query(sql, args);
                while(rs.next()){
                    NhanVien entity=new NhanVien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
                    list.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            
        }
        return list;  
    }
    
    public void qmk(NhanVien model) {
        String sql="UPDATE NhanVien SET MatKhau=? WHERE MaNV=?";
        DBConnect.update(sql, 
        model.getMatKhau(), 
        model.getMaNV());  
    }
    
}
