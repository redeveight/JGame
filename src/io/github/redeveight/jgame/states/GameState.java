package io.github.redeveight.jgame.states;

import io.github.redeveight.jgame.util.KeyHandler;
import io.github.redeveight.jgame.util.MouseHandler;

import java.awt.Graphics2D;

public abstract class GameState {

    private GameStateManager gameStateManager;

    public GameState(GameStateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
    }

    public abstract void update();
    public abstract void input(MouseHandler mouse, KeyHandler key);
    public abstract void render(Graphics2D graphics2D);
}
