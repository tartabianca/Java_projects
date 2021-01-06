import java.awt.event.*;
import java.util.*;

public class Adapter implements ActionListener {
    private Controller controller;
    private View view;

    public Adapter(Controller controller, View view) {
        this.controller = controller;
        this.view = view;
    }


    public void actionPerformed(ActionEvent e) {

        if(view.isReset(e))
            controller.setRequest();
        else {
            ArrayList<Integer> position = view.getPosition(e);
            controller.setRequest(position);
        }
    }
}
