/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradeapp;

/**
 *
 * @author User
 */
public class StudentGradeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String student = "Ali";
        int mark = 75;

        System.out.println("Student: " + student);
        System.out.println("Mark: " + mark);
        
          if (mark >= 50) { 
            System.out.println("Result: PASS"); 
        } else { 
            System.out.println("Result: FAIL"); 
        } 
    }
    
}
