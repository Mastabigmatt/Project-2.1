package com.gdxtester.boardgame.GameUserInterface;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.gdxtester.boardgame.Screens.GameScreen;


public class GameMenu extends ApplicationAdapter implements InputProcessor {

    private Stage stage;
    private Skin skin;
    private Table table;
    private TextButton startb;
    private TextButton quitb;
    private TextButton extrab;
    private Dialog dialog;
    /**
     * objects created: don't forget to dispose
     */
    public void create () {

    table = new Table();
    skin = new Skin(Gdx.files.internal("uiskin.json"));
    stage = new Stage(new ScreenViewport());

    table.setWidth(stage.getWidth());
    //table.setHeight(stage.getHeight());
    table.align(Align.center|Align.top);
    table.setPosition(0, Gdx.graphics.getHeight());
    startb = new TextButton("Start",skin,"default");
    quitb = new TextButton("Quit",skin,"default");
    extrab = new TextButton("EXTRAS",skin,"default");

    startb.addListener(new ClickListener(){
        int n = 0;
        public void clicked(InputEvent event, float x, float y){
            n++;
            Gdx.app.log("clicked start"," # "+n +" ");


        }
    });
    quitb.addListener(new ClickListener(){
        int n = 0;
        public void clicked(InputEvent event, float x, float y){
            n++;
            Gdx.app.log("clicked quit"," # "+n +" ");

           }
    });
    extrab.addListener(new ClickListener(){
        int n = 0;
        public void clicked(InputEvent event, float x, float y){
            n++;
            Gdx.app.log("clicked extra"," # "+n +" ");
        }
    });
    //dialog = new Dialog("Start Game", skin);
    //stage.addActor(startb);
        table.padTop(70);
        table.add(startb).padBottom(70);
        table.row();
        table.add(quitb).padBottom(70);
        table.row();
        table.add(extrab);

        stage.addActor(table);
        InputMultiplexer im = new InputMultiplexer(stage,this);
        Gdx.input.setInputProcessor(im);
        //Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    /**
     * always dispose of object: memory leak
     */
    public void dispose () {

    }
int count = 0;
    @Override
    public boolean keyDown(int keycode) {


        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        count++;
        Gdx.app.log("clicked Back"," # "+count +" ");
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
