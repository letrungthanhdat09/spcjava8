/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class bai24_HinhChuNhat {
    public HinhChuNhat(){
        super();
    }
    public HinhChuNhat(int dai, int rong){
        super(dai,rong);
    }
    public double TinhChuVi(){
        return(this.getDai()+this.getRong())*2;
    }
    public double tinhDienTich(){
        return this.getDai()*this.getRong();
    }
}
