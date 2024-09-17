/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai13;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai13 {
    public static int nhap(){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while(!check){
            System.out.print("");
            try{
                n = input.nextInt();
                check = true;
            } catch(Exception e){
                System.out.println("Ban phai nhap so!hay nhap lai");
                input.nextLine();
            }
        }
        return (n);
    }
    public static int tinhTong(long i){
        int sum = 0;
        long n;
        while(i!=0){
            n = i%10;
            sum+=n;
            i/=10;
        }
        return (sum);
    }
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh tong");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = nhap();
        System.out.println("Tong cua so"+n+"="+tinhTong(n));
        
    }
    
}
