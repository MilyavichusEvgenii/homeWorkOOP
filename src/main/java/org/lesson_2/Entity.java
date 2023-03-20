package org.lesson_2;

import java.util.Random;

public abstract class Entity implements Actions{
    protected String name;
    protected String type;
    protected int running;
    protected int jumping;
    static {
        Random r = new Random();
    }

    public Entity(String name, String type, int running, int jumping) {
        this.name = name;
        this.type = type;
        this.running = running;
        this.jumping = jumping;
    }
}
