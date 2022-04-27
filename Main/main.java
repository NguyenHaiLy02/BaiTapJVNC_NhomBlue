/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GiaoDien.DangNhap;
import GiaoDien.frmTrangChu;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author huy
 */
public class main {
  public static  GiaoDien.frmTrangChu frmTC=new frmTrangChu();
     public static KetNoiSQL.clsConnectDB connection = new  KetNoiSQL.clsConnectDB ();

    public static void main(String[] args) {
       GiaoDien.DangNhap frmDN= new   GiaoDien.DangNhap();
  
       frmDN.show();
    }
   
    
}
