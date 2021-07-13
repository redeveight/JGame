package com.redeveight.jgame.states;

import com.redeveight.jgame.util.KeyHandler;
import com.redeveight.jgame.util.MouseHandler;

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
