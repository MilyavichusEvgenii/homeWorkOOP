package org.lesson_2;

public class Human extends Entity{


    protected Human(String name, String type, int running, int jumping) {
        super(name, type, running, jumping);
    }

    @Override
    public boolean run(int a, int b) {
        boolean answer = false;
        if(a >= b){
            System.out.println(name + " " + type + " -пробежал дистанцию");
            answer = true;
        } else {
            System.out.println(name + " " + type + " -не пробежал дистанцию");
        }

        return answer;
    }

    @Override
    public boolean jump(int a, int b) {
        boolean answer = false;
        if(a > b){
            System.out.println(name + " " + type + " -перепрыгнул стену");
            answer = true;
        } else {
            System.out.println(name + " " + type + " -не перепрыгнул стену");
        }
        return answer;
    }

}
