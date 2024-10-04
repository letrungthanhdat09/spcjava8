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
public class Bai7_hinhtron {
     public static void main(String[] args) {
         double r,cv,dt;
         System.out.println("Chuong trinh tinh dien va chu vi hinh tron");
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhap Ban Kinh: ");
         r = sc.nextDouble();
         cv = 2*Math.PI*r;
         System.out.println("Chu vi= " +cv);
         dt= r*r*Math.PI;
         System.out.println("Dien tich= " +dt);
    }
}
