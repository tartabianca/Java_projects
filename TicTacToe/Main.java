public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        View view = new View();
        Model model = new Model();

        model.registerView(view);
        controller.setModel(model);
        view.setActionListener(controller);
    }
}
