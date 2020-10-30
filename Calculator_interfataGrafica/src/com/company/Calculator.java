package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    double result=0.0;
    String op="";
    public Calculator() {
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button0.getText());
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button1.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button2.getText());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button3.getText());
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button4.getText());
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button5.getText());
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button6.getText());
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button7.getText());
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button8.getText());
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+button9.getText());
            }
        });
        buttonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText("");
                result=0;
                op="";
            }
        });
        buttonP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                result=Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                op="+";
            }
        });
        buttonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                result=Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                op="-";
            }
        });
        buttonIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                result=Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                op="*";
            }
        });
        buttonImp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                result=Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                op="/";
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textDisplay.setText(textDisplay.getText()+".");
            }
        });
        buttonEgl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double val=Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                switch(op)
                {
                    case "+":
                        result+=val;
                        break;
                    case "-":
                        result-=val;
                        break;
                    case"*":
                        result*=val;
                        break;
                    case "/":
                        result/=val;
                        break;
                    default:
                        break;
                }
                textDisplay.setText(String.valueOf(result));
                op="";
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton button7;
    private JButton buttonM;
    private JButton buttonIn;
    private JButton buttonImp;
    private JButton button8;
    private JButton button4;
    private JButton button1;
    private JButton button0;
    private JButton button9;
    private JButton button5;
    private JButton button2;
    private JButton buttonDot;
    private JButton buttonP;
    private JButton button6;
    private JButton button3;
    private JButton buttonAC;
    private JButton buttonEgl;
}
