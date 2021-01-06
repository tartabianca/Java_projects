import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    Model model;
    View view;
    int number1=0;
    int number2=0;
    String opt="";

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.addBtn.addActionListener(new Actions());
        view.subtractBtn.addActionListener(new Actions());
        view.multiplyBtn.addActionListener(new Actions());
        view.divideBtn.addActionListener(new Actions());
        view.equalsBtn.addActionListener(new Actions());
        view.resetBtn.addActionListener(new Actions());
        view.oneBtn.addActionListener(new Actions());
        view.twoBtn.addActionListener(new Actions());
        view.threeBtn.addActionListener(new Actions());
        view.fourBtn.addActionListener(new Actions());
        view.fiveBtn.addActionListener(new Actions());
        view.sixBtn.addActionListener(new Actions());
        view.sevenBtn.addActionListener(new Actions());
        view.eightBtn.addActionListener(new Actions());
        view.nineBtn.addActionListener(new Actions());
        view.zeroBtn.addActionListener(new Actions());
    }


    class Actions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                if (e.getSource() == view.addBtn) {
                    opt="+";
                } else if (e.getSource() == view.subtractBtn) {
                    opt="-";
                } else if (e.getSource() == view.divideBtn) {
                    opt="/";
                } else if (e.getSource() == view.multiplyBtn) {
                    opt="*";
                } else if (e.getSource() == view.equalsBtn) {
                    double result=model.set(opt, number1,number2);
                    view.setTextValue(number1+opt+number2+"="+result);
                } else if (e.getSource() == view.resetBtn) {
                    number1=0;
                    number2=0;
                    opt="";
                    model.reset();
                    view.reset();
                }
                else if (e.getSource() == view.zeroBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 0;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 0;
                        view.setTextValue(String.valueOf(number2));
                    }
                }
                else if (e.getSource() == view.oneBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 1;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 1;
                        view.setTextValue(String.valueOf(number2));
                    }
                } else if (e.getSource() == view.twoBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 2;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 2;
                        view.setTextValue(String.valueOf(number2));
                    }
                } else if (e.getSource() == view.threeBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 3;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 3;
                        view.setTextValue(String.valueOf(number2));
                    }
                } else if (e.getSource() == view.fourBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 4;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 4;
                        view.setTextValue(String.valueOf(number2));
                    };
                } else if (e.getSource() == view.fiveBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 5;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 5;
                        view.setTextValue(String.valueOf(number2));
                    }
                } else if (e.getSource() == view.sixBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 6;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 6;
                        view.setTextValue(String.valueOf(number2));
                    }
                } else if (e.getSource() == view.sevenBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 7;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 7;
                        view.setTextValue(String.valueOf(number2));
                    }
                } else if (e.getSource() == view.eightBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 8;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 8;
                        view.setTextValue(String.valueOf(number2));
                    }
                } else if (e.getSource() == view.nineBtn) {
                    if (opt.equals("")) {
                        number1 = number1 * 10 + 9;
                        view.setTextValue(String.valueOf(number1));
                    } else {
                        number2 = number2 * 10 + 9;
                        view.setTextValue(String.valueOf(number2));
                    }
                }
            } catch (Exception ex) {
                System.out.println("There was an ERROR! " + ex);
            }
        }
    }
}

