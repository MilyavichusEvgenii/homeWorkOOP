package org.lesson_5.model;

public class Names {
    private String[] firstName = new String[] {
            "Анна", "Яна", "Инга", "Виктория", "Анжелика", "Сергей", "Василий", "Григорий", "Роман", "Петр"
    };
    private String[] secondName = new String[] {
            "Иванюк", "Васюк", "Кирасик", "Кирагазик", "Краско", "Траско", "Газон"
    };

    public String[] getFirstName() {
        return firstName;
    }

    public String[] getSecondName() {
        return secondName;
    }
}
