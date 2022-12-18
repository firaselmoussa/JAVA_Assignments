/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Firas
 */
public class CalculatorFrame extends JFrame implements ActionListener{
    
    String equation = "";
        double Ans;
        JTextField  input = new JTextField();
        JTextField  output = new JTextField();
        JButton nb_zero = new JButton("0");
        JButton nb_one = new JButton("1");
        JButton nb_two = new JButton("2");
        JButton nb_three = new JButton("3");
        JButton nb_four = new JButton("4");
        JButton nb_five = new JButton("5");
        JButton nb_six = new JButton("6");
        JButton nb_seven = new JButton("7");
        JButton nb_eight = new JButton("8");
        JButton nb_nine = new JButton("9");
        JButton dot_btn = new JButton(".");
        JButton minus_btn = new JButton("-");
        JButton plus_btn = new JButton("+");
        JButton multiply_btn = new JButton("×");
        JButton devide_btn = new JButton("÷");
        JButton sqrt_btn = new JButton("√");
        JButton power_btn = new JButton("^");
        JButton cos_btn = new JButton("cos");
        JButton sin_btn = new JButton("sin");
        JButton left_b_btn = new JButton("(");
        JButton right_b_btn = new JButton(")");
        JButton equal_btn = new JButton("=");
        JButton reset_btn = new JButton("RES");
        JButton delete_btn = new JButton("DEL");
        
        
        public CalculatorFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(350, 500);
            this.setBackground(new Color(0, 0, 0));
            this.setLayout(new BorderLayout(5, 5));
            
            //SUB BOTOM PANEL
            JPanel bottom_panel = new JPanel();
            bottom_panel.setSize(new Dimension(this.getWidth(), (int) (this.getHeight()*.7)));
            bottom_panel.setLayout(new BorderLayout(10, 10));
            //sub lower left panel
            JPanel numbers_panel = new JPanel();
            numbers_panel.setSize(new Dimension((int) (this.getWidth()*.8)-2, (int) (this.getHeight()*.7)));
            numbers_panel.setLayout(new GridLayout(3, 2, 5, 5));
            //sub lower right panel
            JPanel operations_panel = new JPanel();
            operations_panel.setSize(new Dimension((int) (this.getWidth()*.8)-2, (int) (this.getHeight()*.7)));
            operations_panel.setLayout(new GridLayout(6, 4, 2, 2));
            
            bottom_panel.add(operations_panel, BorderLayout.EAST);
            bottom_panel.add(numbers_panel, BorderLayout.WEST); 
            
            input.setPreferredSize(new Dimension(250, 40));
            output.setPreferredSize(new Dimension(250, 40));
            
            
            nb_zero.addActionListener(this);
            nb_one.addActionListener(this);
            nb_two.addActionListener(this);
            nb_three.addActionListener(this);
            nb_four.addActionListener(this);
            nb_five.addActionListener(this);
            nb_six.addActionListener(this);
            nb_seven.addActionListener(this);
            nb_eight.addActionListener(this);
            nb_nine.addActionListener(this);
            minus_btn.addActionListener(this);
            plus_btn.addActionListener(this);
            multiply_btn.addActionListener(this);
            devide_btn.addActionListener(this);
            dot_btn.addActionListener(this);
            equal_btn.addActionListener(this);
            reset_btn.addActionListener(this);
            delete_btn.addActionListener(this);
            sqrt_btn.addActionListener(this);
            power_btn.addActionListener(this);
            left_b_btn.addActionListener(this);
            right_b_btn.addActionListener(this);
            sin_btn.addActionListener(this);
            cos_btn.addActionListener(this);
            
            
            numbers_panel.add(nb_zero);
            numbers_panel.add(nb_one);
            numbers_panel.add(nb_two);
            numbers_panel.add(nb_three);
            numbers_panel.add(nb_four);
            numbers_panel.add(nb_five);
            numbers_panel.add(nb_six);
            numbers_panel.add(nb_seven);
            numbers_panel.add(nb_eight);
            numbers_panel.add(nb_nine);
            numbers_panel.add(dot_btn);
            numbers_panel.add(equal_btn);
            
            

            this.pack();
            this.setVisible(true);
    }
        
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
