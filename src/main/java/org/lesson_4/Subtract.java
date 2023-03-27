package org.lesson_4;

public class Subtract extends Calculator{
    public Subtract(Number number1, Number number2) {
        super(number1, number2);
    }

    @Override
    public void operate() {
        double a = number1.doubleValue() - number2.doubleValue();
        if(a % 1 == 0){
            System.out.printf("Итогом вычитания двух чисел %f и  %f является %.0f", number1.doubleValue(), number2.doubleValue(), a);
            System.out.println();
            Calculator<?, ?> c = new Binary(a);
            c.operate();
        } else {
            System.out.printf("Итогом вычитания двух чисел %f и  %f является %f", number1.doubleValue(), number2.doubleValue(), a);
            System.out.println();
            Calculator<?, ?> c = new Binary(a);
            c.operate();
        }
    }
}
