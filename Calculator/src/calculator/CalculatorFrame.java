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
            
            operations_panel.add(left_b_btn);
            operations_panel.add(right_b_btn);
            operations_panel.add(sin_btn);
            operations_panel.add(cos_btn);
            operations_panel.add(power_btn);
            operations_panel.add(sqrt_btn);
            operations_panel.add(devide_btn);
            operations_panel.add(multiply_btn);
            operations_panel.add(minus_btn);
            operations_panel.add(plus_btn);
            operations_panel.add(reset_btn);
            operations_panel.add(delete_btn);
            

            this.add(input, BorderLayout.NORTH);
            this.add(output, BorderLayout.CENTER);
            this.add(bottom_panel, BorderLayout.SOUTH);
            this.pack();
            this.setVisible(true);
    }
        
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == nb_zero){
            input.setText(input.getText()+"0");
            equation += "0";
        }else if(e.getSource() == nb_one){
            input.setText(input.getText()+"1");
            equation += "1";
        }else if(e.getSource() == nb_two){
            input.setText(input.getText()+"2");
            equation += "2";
        }else if(e.getSource() == nb_three){
            input.setText(input.getText()+"3");
            equation += "3";
        }else if(e.getSource() == nb_four){
            input.setText(input.getText()+"4");
            equation += "4";
        }else if(e.getSource() == nb_five){
            input.setText(input.getText()+"5");
            equation += "5";
        }else if(e.getSource() == nb_six){
            input.setText(input.getText()+"6");
            equation += "6";
        }else if(e.getSource() == nb_seven){
            input.setText(input.getText()+"7");
            equation += "7";
        }else if(e.getSource() == nb_eight){
            input.setText(input.getText()+"8");
            equation += "8";
        }else if(e.getSource() == nb_nine){
            input.setText(input.getText()+"9");
            equation += "9";
        }else if(e.getSource() == plus_btn){
            input.setText(input.getText()+"+");
            equation += "+";
        }else if(e.getSource() == minus_btn){
            input.setText(input.getText()+"-");
            equation += "-";
        }else if(e.getSource() == devide_btn){
            input.setText(input.getText()+"÷");
            equation += "/";
        }else if(e.getSource() == multiply_btn){
            input.setText(input.getText()+"×");
            equation += "*";
        }else if(e.getSource() == dot_btn){
            input.setText(input.getText()+".");
            equation += ".";
        }else if(e.getSource() == power_btn){
            input.setText(input.getText()+"^");
            equation += "^";
        }else if(e.getSource() == sqrt_btn){
            input.setText(input.getText()+"√");
            equation += "sqrt";
        }else if(e.getSource() == sin_btn){
            input.setText(input.getText()+"sin");
            equation += "sin";
        }else if(e.getSource() == cos_btn){
            input.setText(input.getText()+"cos");
            equation += "cos";
        }else if(e.getSource() == left_b_btn){
            input.setText(input.getText()+"(");
            equation += "(";
        }else if(e.getSource() == right_b_btn){
            input.setText(input.getText()+")");
            equation += ")";
        }else if(e.getSource() == reset_btn){
            input.setText("");
            output.setText("");
            equation = "";
        }else if(e.getSource() == delete_btn){
            String str = input.getText();
            str = str.replace(str.substring(str.length()-1), "");
            input.setText(str);
            equation = str;
        }else if(e.getSource() == equal_btn){
            Ans = eval(equation);
            output.setText(""+Ans);
        }
        
    }
    
    
    
        ///////////////////////////////////////////////////////////////////////////
    
    public static double eval(final String str) {
    return new Object() {
        int pos = -1, ch;
        
        void nextChar() {
            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
        }
        
        boolean eat(int charToEat) {
            while (ch == ' ') nextChar();
            if (ch == charToEat) {
                nextChar();
                return true;
            }
            return false;
        }
        
        double parse() {
            nextChar();
            double x = parseExpression();
            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
            return x;
        }
        
        // Grammar:
        // expression = term | expression `+` term | expression `-` term
        // term = factor | term `*` factor | term `/` factor
        // factor = `+` factor | `-` factor | `(` expression `)` | number
        //        | functionName `(` expression `)` | functionName factor
        //        | factor `^` factor
        
        double parseExpression() {
            double x = parseTerm();
            for (;;) {
                if      (eat('+')) x += parseTerm(); // addition
                else if (eat('-')) x -= parseTerm(); // subtraction
                else return x;
            }
        }
        
        double parseTerm() {
            double x = parseFactor();
            for (;;) {
                if      (eat('*')) x *= parseFactor(); // multiplication
                else if (eat('/')) x /= parseFactor(); // division
                else return x;
            }
        }
        
        double parseFactor() {
            if (eat('+')) return +parseFactor(); // unary plus
            if (eat('-')) return -parseFactor(); // unary minus
            
            double x;
            int startPos = this.pos;
            if (eat('(')) { // parentheses
                x = parseExpression();
                if (!eat(')')) throw new RuntimeException("Missing ')'");
            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                x = Double.parseDouble(str.substring(startPos, this.pos));
            } else if (ch >= 'a' && ch <= 'z') { // functions
                while (ch >= 'a' && ch <= 'z') nextChar();
                String func = str.substring(startPos, this.pos);
                if (eat('(')) {
                    x = parseExpression();
                    if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
                } else {
                    x = parseFactor();
                }
                if (func.equals("sqrt")) x = Math.sqrt(x);
                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                else throw new RuntimeException("Unknown function: " + func);
            } else {
                throw new RuntimeException("Unexpected: " + (char)ch);
            }
            
            if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
            
            return x;
        }
    }.parse();
}
    
}
