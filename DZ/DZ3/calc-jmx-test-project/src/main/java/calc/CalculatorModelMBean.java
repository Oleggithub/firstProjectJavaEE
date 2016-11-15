package calc;

/**
 * Created by b_nop on 15.11.2016.
 */
public interface CalculatorModelMBean {
    int getFirstNumber();

    void setFirstNumber(int firstNumber);

    int getSecondNumber();

    void setSecondNumber(int secondNumber);

    int add();

    @Override
    String toString();
}
