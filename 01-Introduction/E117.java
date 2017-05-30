package e13;

import javax.swing.JOptionPane;

public class E117 {

    public static void main(String[] args) {
                   
        String name = JOptionPane.showInputDialog("What is your name?");
        //System.out.println(name);
        
        String answer = JOptionPane.showInputDialog("My name is HAL. What would you like me to do?");
        System.out.println("I'm sorry, " + name + ". I'm afraid I can't do that.");
    }

}