package HomeWork8;

import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel {
    int num1 = 0;
    int num2 = 0;
    String operator;

    public Panel(GridLayout gridLayout) {
        setLayout(gridLayout);

       final JTextField textField = new JTextField();

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonDiv = new JButton("/");
        JButton buttonRes = new JButton("=");

        add(textField);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button0);
        add(buttonPlus);
        add(buttonMinus);
        add(buttonMultiply);
        add(buttonDiv);
        add(buttonRes);

        button1.addActionListener(e -> {
            textField.setText(textField.getText() +1);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });

        button2.addActionListener(e -> {
            textField.setText(textField.getText() +2);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });

        button3.addActionListener(e -> {
            textField.setText(textField.getText() +3);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });

        button4.addActionListener(e -> {
            textField.setText(textField.getText() +4);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });

        button5.addActionListener(e -> {
            textField.setText(textField.getText() +5);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });
        button6.addActionListener(e -> {
            textField.setText(textField.getText() +6);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });

        button7.addActionListener(e -> {
            textField.setText(textField.getText() +7);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });

        button8.addActionListener(e -> {
            textField.setText(textField.getText() +8);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });

        button9.addActionListener(e -> {
            textField.setText(textField.getText() +9);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });

        button0.addActionListener(e -> {
            textField.setText(textField.getText() +0);
            if (num1 == 0){
                num1 = Integer.parseInt(textField.getText());
            }else
            {
                num2 = Integer.parseInt(textField.getText());
            }

        });

        buttonPlus.addActionListener(e -> {

                num1 = Integer.parseInt(textField.getText());
                textField.setText("");
                operator = "+";
            });

        buttonMinus.addActionListener(e -> {

                num1 = Integer.parseInt(textField.getText());
                textField.setText("");
                operator = "-";
            });

        buttonMultiply.addActionListener(e -> {

                num1 = Integer.parseInt(textField.getText());
                textField.setText("");
                operator = "*";
            });

        buttonDiv.addActionListener(e -> {

                num1 = Integer.parseInt(textField.getText());
                textField.setText("");
                operator = "/";
            });

        buttonRes.addActionListener(e -> {

               int n1 = Integer.parseInt(String.valueOf(num1));
               int n2 = Integer.parseInt(String.valueOf(num2));
               String oper = operator;
                Calc calc = new Calc();
                String result = String.valueOf(calc.computation(n1,n2,oper));
                textField.setText(result);
            });


    }

    public void calculate(){

    }
}
