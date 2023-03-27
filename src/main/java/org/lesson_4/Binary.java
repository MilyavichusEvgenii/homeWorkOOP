package org.lesson_4;

public class Binary extends Calculator{
    public Binary(Number number1) {
        super(number1);
    }

    @Override
    public void operate() {
        int temp = number1.intValue();
        temp = Math.abs(temp);
        StringBuilder binary = new StringBuilder();
        while (temp != 0){
            binary.append(temp % 2);
            temp = temp / 2;
        }
        binary.reverse().toString();
        System.out.printf("Двоичное представление числа %d: %s", number1.intValue(), binary);

    }
}
