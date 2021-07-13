package com.redeveight.jgame.graphics;

import com.redeveight.jgame.util.Vector2f;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Font {

    private BufferedImage FONT_SHEET = null;
    private BufferedImage[][] spriteArrays;
    private final int TILE_SIZE = 32;
    public int w;
    public int h;

    private int wLetter;
    private int hLetter;

    public Font(String file) {
        w = TILE_SIZE;
        h = TILE_SIZE;

        System.out.println("Loading: " + file + "...");
        FONT_SHEET = loadFont(file);

        wLetter = FONT_SHEET.getWidth() / w;
        hLetter = FONT_SHEET.getHeight() / h;
        loadSpriteArray();
    }

    public Font(String file, int w, int h) {
        this.w = w;
        this.h = h;

        System.out.println("Loading: " + file + "...");
        FONT_SHEET = loadFont(file);

        wLetter = FONT_SHEET.getWidth() / w;
        hLetter = FONT_SHEET.getHeight() / h;
        loadSpriteArray();
    }

    public void setSize(int width, int height) {
        setWidth(width);
        setHeight(width);
    }

    public void setWidth(int value) {
        w = value;
        wLetter = FONT_SHEET.getWidth() / w;
    }

    public void setHeight(int value) {
        h = value;
        hLetter = FONT_SHEET.getHeight() / h;
    }

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }

    private BufferedImage loadFont(String file) {
        BufferedImage sprite = null;
        try {
            sprite = ImageIO.read(getClass().getClassLoader().getResourceAsStream(file));
        } catch (Exception e) {
            System.out.println("ERROR: could not load file: " + file);
        }
        return sprite;
    }

    public void loadSpriteArray() {
        spriteArrays = new BufferedImage[wLetter][hLetter];

        for (int x = 0; x < wLetter; x++) {
            for (int y = 0; y < hLetter; y++) {
                spriteArrays[x][y] = getLetter(x, y);
            }
        }
    }

    public BufferedImage getFontSheet() {
        return FONT_SHEET;
    }

    public BufferedImage getLetter(int x, int y) {
        return FONT_SHEET.getSubimage(x * w, y * h, w, h);
    }

    public BufferedImage getFont(char letter) {
        int value = letter - 65;

        int x = value % wLetter;
        int y = value / wLetter;

        return getLetter(x, y);
    }
}
