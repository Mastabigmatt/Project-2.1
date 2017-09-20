package com.gdxtester.boardgame.Screens;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.gdxtester.boardgame.GameConstants.Constants;
import com.gdxtester.boardgame.GameUserInterface.GameIngenious;

import static com.gdxtester.boardgame.GameConstants.Constants.sc_Height;
import static com.gdxtester.boardgame.GameConstants.Constants.sc_Width;

public class MenuScreen implements Screen, InputProcessor {

    final GameIngenious game;
    private Stage stage;
    private Skin skin;
   private Table table;
    private TextButton startb;
    private TextButton quitb;
    private TextButton extrab;
   // private Label gameTitle;
    private Dialog dialog;

    public MenuScreen(final GameIngenious game) {
        this.game =game;
      table = new Table();
       skin = new Skin(Gdx.files.internal("uiskin.json"));

   //     game.samanager.queueAddSkin();
//        game.samanager.manager.finishLoading();
      //  skin = game.samanager.manager.get(Constants.skin);

        stage = new Stage(game.screenPort);
        Gdx.input.setInputProcessor(stage);

        //Texture background = new Texture(Gdx.files.internal("backgrd.png"));
        Texture background = new Texture(Gdx.files.internal("hexmenu.png"));
        TextureRegion tregion = new TextureRegion(background,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        Image bck = new Image(tregion);






        table.setWidth(stage.getWidth());
        table.align(Align.center|Align.top);
        table.setPosition(0, Gdx.graphics.getHeight());
        //gameTitle = new Label("GAME MENU",skin,"big");
        startb = new TextButton("Start",skin,"default");
        quitb = new TextButton("Quit",skin,"default");
        extrab = new TextButton("EXTRAS",skin,"default");



        //gameTitle.setSize(Constants.col_width*2,Constants.row_height*2);
        //gameTitle.setPosition(Constants.centerX - gameTitle.getWidth()/2,Constants.centerY + Constants.row_height);
       // gameTitle.setAlignment(Align.center);
        //startb.setSize(Constants.col_width*2,Constants.row_height);
        //startb.setPosition(Constants.centerX - startb.getWidth()/2,Constants.centerY);
        //quitb.setSize(Constants.col_width*2,Constants.row_height);
        //quitb.setPosition(Constants.centerX - quitb.getWidth()/2,startb.getY() - Constants.row_height -15);

//        startb.addListener(new InputListener(){
//
//            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
//                game.gotoGameScreen();
//                return true;
//            }
//
//
//            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
//                super.touchUp(event, x, y, pointer, button);
//            }
//        });
//        quitb.addListener(new InputListener(){
//
//            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
//                quitbClicked();
//                return true;
//            }
//
//
//            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
//                super.touchUp(event, x, y, pointer, button);
//            }
//        });
        startb.addListener(new ClickListener(){
            int n = 0;
            public void clicked(InputEvent event, float x, float y){
                n++;
                Gdx.app.log("clicked start"," # "+n +" ");
           // startbClicked();
            game.gotoGameScreen();
            }
        });
        quitb.addListener(new ClickListener(){
            int n = 0;
            public void clicked(InputEvent event, float x, float y){
                n++;
                Gdx.app.log("clicked quit"," # "+n +" ");
            quitbClicked();
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
        stage.addActor(startb);
        table.padTop(70);
        table.add(startb).padBottom(70);
        table.row();
        table.add(quitb).padBottom(70);
        table.row();
        table.add(extrab);
        stage.addActor(bck);
//        stage.addActor(gameTitle);
//        stage.addActor(startb);
//        stage.addActor(quitb);
        stage.addActor(table);
        InputMultiplexer im = new InputMultiplexer(stage,this);
        Gdx.input.setInputProcessor(im);

    }

    private void quitbClicked() {
        Gdx.app.log("Exit"," End of Game");
        Gdx.app.exit();
    }

//    private void startbClicked() {
//        Gdx.app.log("Enter"," Start of Game");
//       game.setScreen(new GameScreen(game));
//       game.resize(sc_Width,sc_Height);
//    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();//Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
      //  game.screenPort.update(width,height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
    stage.dispose();
    skin.dispose();

    }
    int count = 0;

    public boolean keyDown(int keycode) {


        return false;
    }


    public boolean keyUp(int keycode) {
        return false;
    }

    public boolean keyTyped(char character) {
        return false;
    }


    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        count++;
        Gdx.app.log("clicked Back"," # "+count +" ");
        return false;
    }

    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }


    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    public boolean scrolled(int amount) {
        return false;
    }
}

