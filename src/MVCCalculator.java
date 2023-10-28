public class MVCCalculator {

    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorMode theModel = new CalculatorMode();
        CalculatorController theController = new CalculatorController(theView, theModel);
        theView.setVisible(true);
    }
}
