package io.github.redeveight.jgame.util;

public class Vector2f {

    public float x;
    public float y;

    public static float worldX;
    public static float worldY;

    public Vector2f() {
        x = 0;
        y = 0;
    }

    public Vector2f(Vector2f pos) {
        new Vector2f(pos.x, pos.y);
    }

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void increaseX(float value) {
        x += value;
    }
    public void increaseY(float value) {
        y += value;
    }

    public void setX(float value) {
        x = value;
    }
    public void setY(float value) {
        y = value;
    }

    public void setVector(Vector2f vector) {
        this.x = vector.x;
        this.y = vector.y;
    }

    public void setVector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static void setWorldVar(float x, float y) {
        worldX = x;
        worldY = y;
    }

    public Vector2f setWorldVar() {
        return new Vector2f(x - worldX, y - worldY);
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
