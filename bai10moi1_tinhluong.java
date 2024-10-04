/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author MAY 06
 */
public class bai10moi_tinhluong {
    public static void main(String[] args) {
        System.out.println("tinh luong va thue");
                Scanner sc= new Scanner(System.in);
        double luong,thuong,thunhap;
        System.out.println("nhap luong");
        luong=sc.nextDouble();
        System.out.println("nhap thuong");
        thuong=sc.nextDouble();
        thunhap=luong+thuong;
        if (thunhap<=9000000)
        {
                System.out.println("thue bang 0");
                
                }
        
        else if(thunhap<=15000000) {
            System.out.println("thue 10%="+thunhap*10/100);
            
        }
        else if(thunhap<=30000000){
            System.out.println("thue 15%="+thunhap*15/100);
           
        }
        else {
            System.out.println("thue 20%="+thunhap*20/100);
        }
}
}
