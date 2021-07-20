package com.nokandehahmad.tetris;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Form class
 * implement form(shape) of blocks
 * @author Nokandeh Ahmad
 * @version 1.01
 * @since 1.01
 */
public class Form {
    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;
    Color color;
    private String name;
    public int form = 1;

    /**
     * Constructor
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Constructor
     * @param a
     * @param b
     * @param c
     * @param d
     * @param name
     */
    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;
      //Set color of the Stones
        switch (name) {
            case "j":
                color = Color.SLATEGRAY;
                break;
            case "l":
                color = Color.DARKGOLDENROD;
                break;
            case "o":
                color = Color.INDIANRED;
                break;
            case "s":
                color = Color.FORESTGREEN;
                break;
            case "t":
                color = Color.CADETBLUE;
                break;
            case "z":
                color = Color.HOTPINK;
                break;
            case "i":
                color = Color.SANDYBROWN;
                break;

        }
        this.a.setFill(color);
        this.b.setFill(color);
        this.c.setFill(color);
        this.d.setFill(color);
    }

    /**
     * Getter
     * @return name
     */
    public String getName() {
        return name;
    }

    public void changeForm() {
        if (form != 4) {
            form++;
        } else {
            form = 1;
        }
    }
}