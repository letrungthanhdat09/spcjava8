/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai11_ngaythang;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai11_ngaythang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Chuong trinh ngay thang");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay thang trong nam");
        int thang = 31;
        switch(thang){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                   System.out.println("Thang co 31 ngay");
                   break;
           
            case 9:
            case 10:
            case 11:
                System.out.println("Thang 2 se co 28 ngay");
                break;
                
            case 12:
                System.out.println("Thang 2 se co ngay 28 hoac 29");
                break;
                
            default:
                System.out.println("khong co ngay thang trong nam");
                break;
        }
    }
    
}
