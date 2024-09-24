/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai15moi1;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class JFrame1 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh JFrame");
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        
        JPanel panel = new JPanel();
        
        JButton button = new JButton("Nhan toi!");
        
        panel.add(button);
        
        frame.add(panel);
        
        frame.setVisible(true);
    }
}
