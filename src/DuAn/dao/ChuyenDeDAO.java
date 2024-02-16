/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.dao;

import DuAn.entity.ChuyenDe;
import DuAn.utils.DBConnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author asus
 */
public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String>{
//ma chuyen de: string --> key --> search
    @Override
    public void insert(ChuyenDe model) {
        String sql="insert into ChuyenDe (MaCd, TenCd, HocPhi, ThoiLuong, Hinh, MoTa) values (?,?,?,?,?,?)";
        DBConnect.update(sql, 
        model.getMaCD(), 
        model.getTenCD(), 
        model.getHocPhi(), 
        model.getThoiLuong(), 
        model.getHinh(),
        model.getMoTa());   
    }

    @Override
    public void update(ChuyenDe model) {
        String sql="update ChuyenDe set TenCd=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? where MaCd like ?";
        DBConnect.update(sql, 
        model.getTenCD(), 
        model.getHocPhi(), 
        model.getThoiLuong(), 
        model.getHinh(), 
        model.getMoTa(),
        model.getMaCD());
    }

    @Override
    public void delete(String MaCD) {
        String sql="delete ChuyenDe where MaCd like ?";
        DBConnect.update(sql, MaCD); 
    }

     @Override
    public List<ChuyenDe> selectAll() {
        String sql="select MaCd, TenCd, HocPhi, ThoiLuong, Hinh, MoTa from ChuyenDe";
        return selectBySql(sql);
    }
    
    @Override
    public ChuyenDe selectById(String maCD) {
        String sql = "select MaCd, TenCd, HocPhi, ThoiLuong, Hinh, MoTa from ChuyenDe WHERE MaCd=?";
        List<ChuyenDe> list = selectBySql(sql, maCD);
        return list.size() > 0 ? list.get(0) : null;
    }

  protected List<ChuyenDe> selectBySql(String sql, Object...args){
        List<ChuyenDe> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DBConnect.query(sql, args);
                while(rs.next()){
                    ChuyenDe entity=new ChuyenDe();
                    entity.setMaCD(rs.getString("MaCD"));
                    entity.setHinh(rs.getString("Hinh"));
                    entity.setHocPhi(rs.getDouble("HocPhi"));
                    entity.setMoTa(rs.getString("MoTa"));
                    entity.setTenCD(rs.getString("TenCD"));
                    entity.setThoiLuong(rs.getInt("ThoiLuong"));
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
    
}
