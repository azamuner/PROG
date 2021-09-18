import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Write a description of class CalculatorAgata here.
 *
 * @author (Agata Zamuner)
 * @version (a version number or a date)
 */
public class CalculatorAgata extends JFrame implements ActionListener {
    JTextField display; //scope
    /**
     * Constructor for objects of class CalculatorAgata
     */
    public CalculatorAgata(){
        // initialise instance variables
        super("My PROG5001 – Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));
        CreateCalcGUI();
    }

    /**
     * A method to set up the GUI
    */
    private void CreateCalcGUI() {
        BorderLayout main = new BorderLayout();
        
        JPanel panelTop = new JPanel(); // display
        JPanel panelCenter = new JPanel(); //buttons
        
        display = new JTextField("");
        display.setPreferredSize(new Dimension(385,35));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false); //doesnt allow people to type
        panelTop.add(display);
        
        panelCenter.setLayout(new GridBagLayout());
        
        GridBagConstraints gb = new GridBagConstraints();
        gb.weighty = 0.1;
        gb.weightx = 0.1;
        gb.fill = GridBagConstraints.BOTH;
        
        //create buttons
        
        gb.gridx = 0;
        gb.gridy = 0;
        JButton button0 = new JButton();
        button0.setText("1");
        button0.setActionCommand("1");
        button0.addActionListener(this);
        panelCenter.add(button0, gb);
        gb.gridx = 1;
        gb.gridy = 0;
        JButton button1 = new JButton();
        button1.setText("2");
        button1.setActionCommand("2");
        button1.addActionListener(this);
        panelCenter.add(button1, gb);
        gb.gridx = 2;
        gb.gridy = 0;
        JButton button2 = new JButton();
        button2.setText("3");
        button2.setActionCommand("3");
        button2.addActionListener(this);
        panelCenter.add(button2, gb);
        gb.gridx = 3;
        gb.gridy = 0;
        JButton button3 = new JButton();
        button3.setText("+");
        button3.setActionCommand("+");
        button3.addActionListener(this);
        panelCenter.add(button3, gb);
        gb.gridx = 4;
        gb.gridy = 0;
        JButton button4 = new JButton();
        button4.setText("<<");
        button4.setActionCommand("<<");
        button4.addActionListener(this);
        panelCenter.add(button4, gb);
        gb.gridx = 0;
        gb.gridy = 1;
        JButton button5 = new JButton();
        button5.setText("4");
        button5.setActionCommand("4");
        button5.addActionListener(this);
        panelCenter.add(button5, gb);
        gb.gridx = 1;
        gb.gridy = 1;
        JButton button6 = new JButton();
        button6.setText("5");
        button6.setActionCommand("5");
        button6.addActionListener(this);
        panelCenter.add(button6, gb);
        gb.gridx = 2;
        gb.gridy = 1;
        JButton button7 = new JButton();
        button7.setText("6");
        button7.setActionCommand("6");
        button7.addActionListener(this);
        panelCenter.add(button7, gb);
        gb.gridx = 3;
        gb.gridy = 1;
        JButton button8 = new JButton();
        button8.setText("-");
        button8.setActionCommand("-");
        button8.addActionListener(this);
        panelCenter.add(button8, gb);
        gb.gridx = 4;
        gb.gridy = 1;
        JButton button9 = new JButton();
        button9.setText("C");
        button9.setActionCommand("C");
        button9.addActionListener(this);
        panelCenter.add(button9, gb);
        gb.gridx = 0;
        gb.gridy = 2;
        JButton button10 = new JButton();
        button10.setText("7");
        button10.setActionCommand("7");
        button10.addActionListener(this);
        panelCenter.add(button10, gb);
        gb.gridx = 1;
        gb.gridy = 2;
        JButton button11 = new JButton();
        button11.setText("8");
        button11.setActionCommand("8");
        button11.addActionListener(this);
        panelCenter.add(button11, gb);
        gb.gridx = 2;
        gb.gridy = 2;
        JButton button12 = new JButton();
        button12.setText("9");
        button12.setActionCommand("9");
        button12.addActionListener(this);
        panelCenter.add(button12, gb);
        gb.gridx = 3;
        gb.gridy = 2;
        JButton button13 = new JButton();
        button13.setText("*");
        button13.setActionCommand("*");
        button13.addActionListener(this);
        panelCenter.add(button13, gb);
        gb.gridx = 4;
        gb.gridy = 2;
        JButton button14 = new JButton();
        button14.setText("(");
        button14.setActionCommand("(");
        button14.addActionListener(this);
        panelCenter.add(button14, gb);
        gb.gridx = 0;
        gb.gridy = 3;
        JButton button15 = new JButton();
        button15.setText("+/-");
        button15.setActionCommand("+/-");
        button15.addActionListener(this);
        panelCenter.add(button15, gb);
        gb.gridx = 1;
        gb.gridy = 3;
        JButton button16 = new JButton();
        button16.setText("0");
        button16.setActionCommand("0");
        button16.addActionListener(this);
        panelCenter.add(button16, gb);
        gb.gridx = 2;
        gb.gridy = 3;
        JButton button17 = new JButton();
        button17.setText(".");
        button17.setActionCommand(".");
        button17.addActionListener(this);
        panelCenter.add(button17, gb);
        gb.gridx = 3;
        gb.gridy = 3;
        JButton button18 = new JButton();
        button18.setText("/");
        button18.setActionCommand("/");
        button18.addActionListener(this);
        panelCenter.add(button18, gb);
        gb.gridx = 4;
        gb.gridy = 3;
        JButton button19 = new JButton();
        button19.setText(")");
        button19.setActionCommand(")");
        button19.addActionListener(this);
        panelCenter.add(button19, gb);
        gb.gridx = 0;
        gb.gridy = 4;
        gb.gridwidth = 3;
        JButton button20 = new JButton();
        button20.setText("=");
        button20.setActionCommand("=");
        button20.addActionListener(this);
        panelCenter.add(button20, gb);
        gb.gridx = 3;
        gb.gridy = 4;
        gb.gridwidth = 1;
        JButton button21 = new JButton();
        button21.setText("!");
        button21.setActionCommand("!");
        button21.addActionListener(this);
        panelCenter.add(button21, gb);
        gb.gridx = 4;
        gb.gridy = 4;
        gb.gridwidth = 1;
        JButton button22 = new JButton();
        button22.setText("OFF");
        button22.setActionCommand("OFF");
        button22.addActionListener(this);
        panelCenter.add(button22, gb);
        
        setLayout(main); //how the panels is going to position in the screen
        add(panelTop, BorderLayout.NORTH);
        add(panelCenter, BorderLayout.CENTER);
    }
    
    public void actionPerformed(ActionEvent e) {
        String textField = display.getText();
        display.setText(e.getActionCommand());
        switch(e.getActionCommand()){
            case "<<":
                display.setText(textField.substring(0, textField.length() - 1));
                break;
            case "C":
                display.setText("");
                break;
            case "OFF":
                System.exit(0);
                break;
            case "+/-":
                break;
            case "=":
                evaluateExpression(textField);
                break;
            default:
                display.setText(textField + e.getActionCommand());
                break;
        }
    }
    
    public void evaluateExpression(String expression){
        String postfix = convert(expression);
        Double result = evaluate(postfix);
        display.setText(result + "");
    }
    
    
    /**
     * whatever
     */
    private int isOperator(char c) {
        switch (c) {
            case '+':                
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
    
    /**
     * convert expression in the infix format to postfix format
     * @param: infix
     * @output: postfix
     */
    public String convert(String infix) {
        Stack<Character> stack = new Stack();
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (isOperator(c) > 0) {
               //operator
                while (!stack.isEmpty() && (isOperator(c) <= isOperator(stack.peek()))) {
                    postfix = postfix + stack.pop();
                }
                stack.push(c);
            } else 
            if (c == '(') {
                //left parenthesis
                stack.push(c);
            } else
            if (c == ')') {
                //right parenthesis
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix = postfix + stack.pop();
                }
                stack.pop(); //take out the left parenthesis from the stack
            } else {
                //operand
                postfix = postfix + c;
            }            
        }
        while (!stack.isEmpty()) {
            postfix = postfix + stack.pop();
        }
        
        return postfix;
    }
    
    public double evaluate(String postfix) {
        Stack<Double> stack = new Stack();
        double result = 0;
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (isOperator(c) > 0) {
                double operand2 = Double.parseDouble("" + stack.pop());
                double operand1 = Double.parseDouble("" + stack.pop());
                if (c == '+') {
                    result = operand1 + operand2;
                } else
                if (c == '-') {
                    result = operand1 - operand2;
                } else
                if (c == '*') {
                    result = operand1 * operand2;
                } else
                if (c == '/') {
                    result = operand1 / operand2;
                }                
                stack.push(result);
            } else {
                //c is an operand
                stack.push(Double.parseDouble("" + c));                
            }            
        }
        
        result = stack.pop();
        
        return result;
    }
    
    /*public void changeSign(){
       String value = display.getText();
       String lastExpression =  display.getText().substring(value.length() - 1);
       if()
    }*/
    
    public static void main (String[] args) {
        CalculatorAgata calc = new CalculatorAgata();
        calc.setVisible(true);
    }
}
