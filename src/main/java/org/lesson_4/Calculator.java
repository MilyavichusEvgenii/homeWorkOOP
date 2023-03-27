package org.lesson_4;

public abstract class Calculator <E extends Number, E1 extends Number> implements Operation{
    protected E number1;
    protected E1 number2;

    public Calculator(E number1, E1 number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Calculator(E number1) {
        this.number1 = number1;
    }
}
