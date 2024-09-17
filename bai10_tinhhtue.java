/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai10_tinhhtue {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh thue");
        Scanner sc = new Scanner(System.in);
        double luong, thuong, thunhap;
        System.out.println("Nhap so luong:");
        luong = sc.nextDouble();
        System.out.println("Nhap so thuong: ");
        thuong = sc.nextDouble();
        thunhap = luong + thuong;
        if(thunhap < 9){
            System.out.println("thue:"+thunhap);
        }
        else if(thunhap > 15){
            System.out.println("thue: 10%"+luong*10/100);
        }
        else if(thunhap > 30){
            System.out.println("Thue: 15%"+luong*15/100);
        }
        else if(thunhap >= 30){
            System.out.println("Thue: 20%"+thuong*20/100); 
        }
    }
}
