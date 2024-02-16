/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.dao;

import DuAn.entity.KhoaHoc;
import DuAn.utils.DBConnect;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer>{

    @Override
    public void insert(KhoaHoc model) {
        String sql="INSERT INTO KhoaHoc (MaCd, HocPhi, ThoiLuong, NgayKg, GhiChu, MaNv) VALUES (?, ?, ?, ?, ?, ?)";
        DBConnect.update(sql, 
        model.getMaCD(), 
        model.getHocPhi(), 
        model.getThoiLuong(), 
        model.getNgayKG(), 
        model.getGhiChu(),
        model.getMaNV());       
    }

    @Override
    public void update(KhoaHoc model) {
        String sql="UPDATE KhoaHoc SET MaCd=?, HocPhi=?, ThoiLuong=?, NgayKg=?, GhiChu=?, MaNv=? WHERE MaKh=?";
        DBConnect.update(sql, 
        model.getMaCD(), 
        model.getHocPhi(), 
        model.getThoiLuong(), 
        model.getNgayKG(), 
        model.getGhiChu(),
        model.getMaNV(),    
        model.getMaKH());
    }

    @Override
    public void delete(Integer MaKH) {
        String sql="DELETE FROM KhoaHoc WHERE MaKh=?";
        DBConnect.update(sql, MaKH);    
    }

    @Override
    public List<KhoaHoc> selectAll() {
        String sql="select MaKh,MaCd, HocPhi, ThoiLuong, NgayKg, GhiChu, MaNv, NgayTao from KhoaHoc";
        return selectBySql(sql); 
    }
    
    @Override
    public KhoaHoc selectById(Integer MaKH) {
        String sql = "select MaKh, MaCd, HocPhi, ThoiLuong, NgayKg, GhiChu, MaNv, NgayTao from KhoaHoc WHERE MaKh=?";
        List<KhoaHoc> list = selectBySql(sql, MaKH);
        return list.size() > 0 ? list.get(0) : null;   
    }

    @Override
    protected List<KhoaHoc> selectBySql(String sql, Object... args) {
    List<KhoaHoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DBConnect.query(sql, args);
                while(rs.next()){
                    KhoaHoc entity=new KhoaHoc();
                    entity.setMaKH(rs.getInt("MaKh"));
                    entity.setHocPhi(rs.getDouble("HocPhi"));
                    entity.setThoiLuong(rs.getInt("ThoiLuong"));
                    entity.setNgayKG(rs.getDate("NgayKg"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    entity.setMaNV(rs.getString("MaNv"));
                    entity.setNgayTao(rs.getDate("NgayTao"));
                    entity.setMaCD(rs.getString("MaCd"));
                    list.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;    
    }
    
    public List<KhoaHoc> selectByChuyenDe(String MaCD){ //tìm kiếm Khóa học theo chuyên đề 
        String sql = "SELECT * FROM KhoaHoc WHERE MaCd=?";
        return this.selectBySql(sql, MaCD);
    }
    
    public List<Integer> selectYears(){  //liệt kê những khóa học trong một năm
        String sql= "Select DiSTINCT year(NgayKg) Year From KhoaHoc ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnect.query(sql);
            while (rs.next()) {                
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
