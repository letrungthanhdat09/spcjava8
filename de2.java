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
public class de2 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh fibonacci");
        Scanner sc = new Scanner(System.in);
        int so1, so2, num;
        System.out.println("Nhap day so fibonacci");
        num=sc.nextInt();
        for(int i=0; i<=1; num++){
            num = so1 + so2;
            System.out.println(num+"");
            so1 = so2;
            so2 = num;
        }
    }
}
