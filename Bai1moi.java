/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1moi;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai1moi {
    public static int nhap(){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n=0;
        while(!check){
            System.out.print("");
            try{
                n = input.nextInt();
                check = true;
            }catch(Exception e){
                System.out.print("Ban phai nhap so!phai nhap lai");
                input.nextLine();
            }
        }
        return (n);
    }
    public static int USCLN(int a, int b){
        while(a!=b){
            if(a>b) a= a - b;
            else b = b - a;
        }
        return (a);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh USCLN");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a");
        int a = nhap();
        System.out.print("Nhap b: ");
        int b = nhap();
        System.out.println("Uoc so chung lon nhat cua "+a+" va "+b+" la: "+USCLN(a,b));
        System.out.printf("Uoc so chung lon nhat cua %d va %d la: %d",a,b,USCLN(a,b)); 
        System.out.println("Boi so chung lon nhat cua "+a+" va "+b+" la: "+((a*b)/USCLN(a,b)));
    }
}
