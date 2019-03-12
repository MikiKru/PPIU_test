/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.time.LocalDate;

//import javaapplication1.JavaApplication1;
/**
 *
 * @author 109pro
 */
public class NewClass {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        JavaApplication1 j1 = new JavaApplication1();
        j1.name = "Michał";
        System.out.println(j1.getName());
    }
}
