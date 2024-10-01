/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class string01 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh String01");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String hoten = sc.nextLine();
        //Le Trung Thanh Dat
        System.out.println("ho: "+hoten.substring(0,8));
        System.out.println("Chu lot: "+hoten.substring(0,2));
        System.out.println("ten: "+hoten.substring(0,18));
        System.out.println("hoten: "+hoten.length());
        System.out.println("hoten: "+hoten.toUpperCase());
        System.out.println("hoten: "+hoten.toLowerCase());
    }
}
