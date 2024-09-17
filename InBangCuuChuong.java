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
public class InBangCuuChuong {
    public static void main(String[] args) {
        System.out.println("Chuong trinh in bang cuu chuong");
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhap a");
        a = sc.nextInt();
        for(int i = 1; i<= 10; i++){
            System.out.println(a+"x"+i+"="+i*a);
        }
    }
}
