/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.dao;
import DuAn.entity.NguoiHoc;
import DuAn.utils.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String>{

    @Override
    public void insert(NguoiHoc model) {
        String sql="INSERT INTO NguoiHoc (HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNv)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        DBConnect.update(sql, 
        model.getMaNH(), 
        model.getHoTen(), 
        model.getNgaySinh(), 
        model.isGioiTinh(), 
        model.getDienThoai(),
        model.getEmail(),  
        model.getGhiChu(),
        model.getMaNV());
    }

    @Override
    public void update(NguoiHoc model) {
        String sql="UPDATE NguoiHoc SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?, MaNv=?"
                + " WHERE MaNh=?";
        DBConnect.update(sql, 
        model.getHoTen(), 
        model.getNgaySinh(), 
        model.isGioiTinh(), 
        model.getDienThoai(), 
        model.getEmail(),
        model.getGhiChu(),
        model.getMaNV(),
        model.getMaNH());
    }

    @Override
    public void delete(String MaNH) {
        String sql = "DELETE FROM NguoiHoc WHERE MaNh = ?";
        DBConnect.update(sql, MaNH);
    }

     @Override
    public List<NguoiHoc> selectAll() {
        String sql = "select MaNh, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNv, NgayDk from NguoiHoc";
        return selectBySql(sql);
    }
    
    @Override
    public NguoiHoc selectById(String MaNH) {
        String sql = "select MaNh, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNv, NgayDk from NguoiHoc WHERE MaNh=?";
        List<NguoiHoc> list = selectBySql(sql, MaNH);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<NguoiHoc> selectBySql(String sql, Object... args) {
    List<NguoiHoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DBConnect.query(sql, args);
                while(rs.next()){
                    NguoiHoc entity=new NguoiHoc();
                    entity.setMaNH(rs.getString("MaNH"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setDienThoai(rs.getString("DienThoai"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setNgayDK(rs.getDate("NgayDK"));
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
    
    public List<NguoiHoc> selectByKeyword(String keyword){ //tìm kiếm người học theo từ khóa
        String sql = "select MaNh, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNv, NgayDk from NguoiHoc WHERE HoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    
    public List<NguoiHoc> selectNotInCourse(int maKH,String keyword){  // Những người không tham gia vào khóa học
        String sql = "select MaNh, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNv, NgayDk from NguoiHoc"
        + " WHERE HoTen LIKE ? AND "
        + "MaNh NOT IN (SELECT MaNh FROM HocVien WHERE MaKh=?)";
        return this.selectBySql(sql, "%"+ keyword+ "%",maKH);
    }
    
}
