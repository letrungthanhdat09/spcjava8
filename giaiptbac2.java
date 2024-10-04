/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author MAY 06
 */
public class giaiptbac2 {
    public static void main(String[] args) { 
         double a,b,c,x1,x2,delta;
        System.out.println("chuong trinh tinh phuong trinh bac 2");
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap a:");
        a=sc.nextDouble();
         System.out.print("nhap b:");
        b=sc.nextDouble();
         System.out.print("nhap c:");
        c=sc.nextDouble();
        if(a==0){
            if(b==0){
                if(c!=0){
                    System.out.println("pt vo nghiem");}
                else{
                    System.out.println("pt vo so nghiem");}
            }
            else {
                x1=x2= -c/b;
                System.out.println("pt có nghiem x="+x1);
                }
            }
        else{
            delta=b*b-4*a*c;
            if(delta<0){
                System.out.println("pt vo nghiem");
            }
            else if (delta==0){
                x1=x2= -b/(2*a);
                System.out.println("pt co nghiem kep x1=x2="+x1);
            }
            else {
                x1=(-b+ Math.sqrt(delta))/(2*a);
                 x2=(-b- Math.sqrt(delta))/(2*a);
                 System.out.println("pt co 2 nghiem phan biet");
                 System.out.println("x1="+x1);
                 System.out.println("x2="+x2);
            }
        } 
    }
}
