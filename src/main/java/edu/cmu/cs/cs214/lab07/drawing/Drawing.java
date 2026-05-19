package edu.cmu.cs.cs214.lab07.drawing;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

    private List<Drawable> drawables;

    public Drawing() {
        drawables = new ArrayList<>();
    }

    public void addDrawable(Drawable drawable) {
        drawables.add(drawable);
    }

    public void render() {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}