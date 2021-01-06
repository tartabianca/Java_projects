import java.awt.*;

import javax.swing.*;

import static java.awt.Color.PINK;

public class View {
    JButton oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn;
    JButton sixBtn, sevenBtn, eightBtn, nineBtn, zeroBtn;
    JButton addBtn, subtractBtn, multiplyBtn, divideBtn;
    JButton resetBtn, equalsBtn;

    JTextField textFeild;

    JFrame frame;

    JPanel numbersPanel, signsPanel;

    View() {
        frame = new JFrame("MVC Calculator");
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textFeild = new JTextField(10);

        JPanel numbersPanel = new JPanel();
        JPanel signsPanel = new JPanel();
        JPanel resetPanel = new JPanel();

        numbersPanel = numberPan(numbersPanel);
        signsPanel = signPan(signsPanel);
        resetPanel = resetPan(resetPanel);

        frame.add(textFeild, BorderLayout.PAGE_START);
        frame.add(numbersPanel, BorderLayout.CENTER);
        frame.add(signsPanel, BorderLayout.EAST);
        frame.add(resetPanel, BorderLayout.PAGE_END);

        frame.setResizable(false);
        frame.setVisible(true);
    }


    JPanel numberPan(JPanel panel) {
        oneBtn = new JButton("1");
        twoBtn = new JButton("2");
        threeBtn = new JButton("3");
        fourBtn = new JButton("4");
        fiveBtn = new JButton("5");
        sixBtn = new JButton("6");
        sevenBtn = new JButton("7");
        eightBtn = new JButton("8");
        nineBtn = new JButton("9");
        zeroBtn = new JButton("0");

        panel.add(zeroBtn);
        zeroBtn.setBackground(Color.cyan);
        panel.add(oneBtn);
        oneBtn.setBackground(Color.cyan);
        panel.add(twoBtn);
        twoBtn.setBackground(Color.cyan);
        panel.add(threeBtn);
        threeBtn.setBackground(Color.cyan);
        panel.add(fourBtn);
        fourBtn.setBackground(Color.cyan);
        panel.add(fiveBtn);
        fiveBtn.setBackground(Color.cyan);
        panel.add(sixBtn);
        sixBtn.setBackground(Color.cyan);
        panel.add(sevenBtn);
        sevenBtn.setBackground(Color.cyan);
        panel.add(eightBtn);
        eightBtn.setBackground(Color.cyan);
        panel.add(nineBtn);
        nineBtn.setBackground(Color.cyan);
        panel.setLayout(new GridLayout(4, 3));

        return panel;
    }


    JPanel signPan(JPanel panel) {
        addBtn = new JButton("+");
        addBtn.setPreferredSize(new Dimension(10, 10));
        subtractBtn = new JButton("-");
        multiplyBtn = new JButton("*");
        divideBtn = new JButton("/");

        equalsBtn = new JButton("=");

        panel.add(addBtn);
        panel.add(subtractBtn);
        panel.add(multiplyBtn);
        panel.add(divideBtn);
        panel.add(equalsBtn);

        panel.setLayout(new GridLayout(5, 1));

        return panel;
    }

    JPanel resetPan(JPanel panel){
        resetBtn = new JButton("CLEAR");
        panel.add(resetBtn);

        panel.setLayout(new GridLayout(1, 1));

        return panel;
    }

    void setTextValue(String value) {
        System.out.println(value);
        textFeild.setText(value);
    }

    void reset() {
        textFeild.setText("");
    }
}
