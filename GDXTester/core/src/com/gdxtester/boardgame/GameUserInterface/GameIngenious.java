package com.gdxtester.boardgame.GameUserInterface;

import com.badlogic.gdx.Game;
//import com.gdxtester.boardgame.Screens.GameScreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.gdxtester.boardgame.Assets_Skin_Manager.SAManager;
import com.gdxtester.boardgame.Screens.GameScreen;
import com.gdxtester.boardgame.Screens.MenuScreen;

public class GameIngenious extends Game {
    private SpriteBatch batch;
    public Viewport screenPort;
   // public SAManager samanager;

    public void create() {
        screenPort = new ScreenViewport();
      //  setScreen(new MenuScreen(this));
//        samanager = new SAManager();
       // OrthographicCamera camera = new OrthographicCamera();
       // camera.setToOrtho(false);
        setScreen(new GameScreen(this));
       //float startTime = TimeUtils.millis();
    }
    public void gotoMenuScreen(){
        MenuScreen menuScreen = new MenuScreen(this);
        setScreen(menuScreen);
    }

//    public void gotoSettingsScreen(){
//        SettingsScreen settingsScreen = new SettingsScreen(this);
//        setScreen(settingsScreen);
//    }

    public void gotoGameScreen(){
        //GameScreen gameScreen = new GameScreen(this);
        setScreen(new GameScreen(this));
    }
    public void render() {
        super.render();
    }
    public void dispose(){
        super.dispose();
       // float endTime = TimeUtils.millis();

    }
}
