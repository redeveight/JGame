package io.github.redeveight.jgame.states;

import io.github.redeveight.jgame.graphics.Font;
import io.github.redeveight.jgame.graphics.Sprite;
import io.github.redeveight.jgame.util.KeyHandler;
import io.github.redeveight.jgame.util.MouseHandler;
import io.github.redeveight.jgame.util.Vector2f;

import java.awt.Graphics2D;

public class PlayState extends GameState {

    private Font font;

    public PlayState(GameStateManager gameStateManager) {
        super(gameStateManager);

        font = new Font("font/ZeldaFont.png", 16, 16);
    }

    @Override
    public void update() {

    }

    @Override
    public void input(MouseHandler mouse, KeyHandler key) {
        if (key.up.down) {
            System.out.println("W");
        }
    }

    @Override
    public void render(Graphics2D graphics2D) {
        Sprite.drawArray(graphics2D, font, "Hello World", new Vector2f(100, 100), 32, 32, 16, 0);
    }
}
