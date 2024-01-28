/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.dao;

import DuAn.entity.HocVien;
import DuAn.utils.DBConnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author asus
 */
public class HocVienDAO extends EduSysDAO<HocVien, Integer>{

    @Override
    public void insert(HocVien model) {
        String sql="insert into HocVien (MaKh, MaNh, Diem) values (?,?,?)";
        DBConnect.update(sql, 
        model.getMaKH(), 
        model.getMaNH(), 
        model.getDiem());      
    }

    @Override
    public void update(HocVien model) {
        String sql="update HocVien set MaKh=?, MaNh=?, Diem=? where MaHv like ?";
        DBConnect.update(sql, 
        model.getMaKH(), 
        model.getMaNH(), 
        model.getDiem(),
        model.getMaHV());    
    }

    @Override
    public void delete(Integer MaHV) {
        String sql="select MaHv, MaKh, MaNh, Diem from HocVien WHERE MaHv=?";
        DBConnect.update(sql, MaHV); 
    }
    
    @Override
    public List<HocVien> selectAll() {
        String sql="select MaHv, MaKh, MaNh, Diem from HocVien";
        return selectBySql(sql);    
    }

    @Override
    public HocVien selectById(Integer MaHV) {
        String sql = "select MaHv, MaKh, MaNh, Diem from HocVien WHERE MaHv=?";
        List<HocVien> list = selectBySql(sql, MaHV);
        return list.size() > 0 ? list.get(0) : null;    } 

    @Override
    protected List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DBConnect.query(sql, args);
                while(rs.next()){
                    HocVien entity=new HocVien();
                    entity.setMaHV(rs.getInt("MaHv"));
                    entity.setMaKH(rs.getInt("MaKh"));
                    entity.setMaNH(rs.getString("MaNh"));
                    entity.setDiem(rs.getDouble("Diem"));
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
    
    public List<HocVien> selectByKhoaHoc(int MaKH){ //tìm kiếm Khóa học theo chuyên đề 
        String sql = "select MaHv, MaKh, MaNh, Diem from HocVien where MaKh=?";
        return this.selectBySql(sql, MaKH);
    }
}
