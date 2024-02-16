/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.dao;

import DuAn.utils.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... arg) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = DBConnect.query(sql, arg);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list; //danh sách mảng ->> filltable
        } catch (SQLException e) {
            return null;
        }

    }

    public List<Object[]> getBangDiem(Integer makh) {
        String sql = "{call sp_Bang_Diem(?)}";
        String[] cols = {"MaNh", "HoTen", "Diem"};
        return this.getListOfArray(sql, cols, makh);//chứa kết quả câu lệnh
    }

    public List<Object[]> getLuongNguoiHoc() {
        String sql = "{call sp_ThongKeNguoiHoc}";
        String[] cols = {"Nam", "SoLuong", "DauTien", "CuoiCung"};
        return this.getListOfArray(sql, cols);
    }

    public List<Object[]> getDiemTheoChuyenDe() {
        String sql = "{call sp_ThongKeDiem}";
        String[] cols = {"ChuyenDe", "SoHv", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols);
    }

    public List<Object[]> getDoanhThu(int nam) {
        String sql = "{call sp_ThongKeDoanhThu(?)}";
        String[] cols = {"ChuyenDe", "SoKh", "SoHv", "DoanhThu", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols, nam);

    }
}
