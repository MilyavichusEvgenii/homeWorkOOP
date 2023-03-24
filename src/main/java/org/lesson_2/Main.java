package org.lesson_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Entity[] obj = {
                new Human("Вася - алканавт", "человек - самоход", 25, 0),
                new Human("Петя - геймер", "Человек с большой левой верхней кнопки", 50, 2), new Human("Жора - громобой", "потомок славных предков", 20000, 100),
                new Cat("Сыкун", "осторожно! - ссыт в тапки", 200, 4),
                new Cat("Серун", "осторожно!!! - не перекармливать", 300, 5),
                new Cat("Мелкий паразит", "ворует колбасу", 1000, 20),
                new Robot("Терминатор", "обещал вернуться", 1000000, 10),
                new Robot("Nokia 909", "им можно спокойно отбиваться от фашистов", 5, 10), new Robot("Честно собранный в Китае", "еще один настоящий образец iphone", 1000, 5)

        };
        Trials[] heavy = {
                new Wall(1), new Wall(5), new Wall(50), new Wall(100), new Distance(10), new Distance(20), new Distance(1000), new Distance(10000)
        };
        competitions(obj, heavy);

    }
    public static void competitions(Entity[] obj, Trials[] heavy){
        boolean res = true;
        for (Entity i:obj) {
            for (Trials j:heavy) {
                if(j instanceof Wall){
                    res = i.jump(i.jumping, j.size);
                    if (!res){
                        break;
                    }
                }
                if(j instanceof Distance){
                    res = i.run(i.running, j.size);
                    if(!res){
                        break;
                    }
                }
            }
        }
    }
}

