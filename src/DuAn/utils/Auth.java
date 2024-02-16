/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAn.utils;

import DuAn.entity.NhanVien;

/**
 *
 * @author asus
 */
public class Auth {
    public static NhanVien user = null; //người dùng chưa login
    public static void clear(){//log out
        Auth.user = null;
    }
    
    /**
     * Kiểm tra đăng nhập hay chưa
     */
    public static boolean isLogin(){
        return Auth.user != null;
    }
    
    /**
     * Kiểm tra có phải trường phòng hay không
     */
    public static boolean isManager(){
        return Auth.isLogin() && user.isVaiTro();
    }
}
