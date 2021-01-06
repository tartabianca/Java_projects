public class Model {
    private double result;
    private int number1;
    private int number2;
    private String opt;

    public Model() {
        result = 0;
        number1 = 0;
        number2 = 0;
    }

    public double set(String identifier, int number1,int number2) {
        opt = identifier;

        this.number1 = number1;
        this.number2 = number2;

        calculate(opt);
        return result;
    }


    private void setResult(double result) {
        this.result = result;
    }

    void calculate(String sign) {
        switch (sign) {
            case "+":
                result = number1+number2;
                setResult(result);
                break;

            case "-":
                result = number1-number2;
                setResult(result);
                break;

            case "/":
                result = (double)number1/number2;
                setResult(result);
                break;

            case "*":
                result = number1*number2;
                setResult(result);
                break;

            case "=":
                break;

            case "C":
                opt = "";
                number1 = 0;
                number2 = 0;
                result = 0;
                setResult(result);
                break;
            default:
        }
    }

    public void reset() {
        result = 0;
        number1 = 0;
        number2 = 0;
    }
}
