/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.swing.JOptionPane;


public class TrafficLightChecker {

    public static void main(String args[]) {
      String currentColor = JOptionPane.showInputDialog(null,"Enter a color code ");
      int currentColorConvert = Integer.parseInt(currentColor);
      
      if   (currentColorConvert == 1){
            System.out.println("Next Traffic Light is Green");
      }
      else if (currentColorConvert == 2){
            System.out.println("Next Traffic Light is Yellow");
      } 
      else if (currentColorConvert == 3){
            System.out.println("Next Traffic Light is Red");
      } 
      else{
          System.out.println("Invalid color");
      }
    }
}
