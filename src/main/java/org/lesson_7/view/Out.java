package org.lesson_7.view;

import org.lesson_7.logger.Logger;
import org.lesson_7.model.Complex_Numb;

public class Out implements OutInt{
    @Override
    public void print(Complex_Numb res) {
        Logger logger = new Logger();
        logger.update(res, "Результат: ");
        System.out.println(res.toString());
    }
}
