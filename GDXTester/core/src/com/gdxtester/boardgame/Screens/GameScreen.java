package com.gdxtester.boardgame.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.gdxtester.boardgame.GameUserInterface.GameIngenious;
import com.gdxtester.boardgame.Stages.GameStage;
import com.gdxtester.boardgame.Stages.HandStage;
import com.gdxtester.boardgame.Stages.ScoreStage;


public class GameScreen implements Screen{
   final GameIngenious game;
   private Stage stage;
    private Skin skin;
  // private GameStage gstage;
  // private HandStage hstage;
  // private ScoreStage sstage;
   //private ShapeRenderer shape;



    public GameScreen(GameIngenious g) {
        this.game = g;
        stage = new Stage(game.screenPort);
        skin = new Skin(Gdx.files.internal("uiskin.json"));
       // gstage = new GameStage(new ScreenViewport());
        stage.clear();
        Gdx.input.setInputProcessor(stage);

//        table = new Table();
//        table.setFillParent(true);
//        stage.addActor(table);
//
//        table.setDebug(true);
//     shape = new ShapeRenderer();
    }





        public void render() {
         Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            stage.act(Gdx.graphics.getDeltaTime());
            stage.draw();
       // shape.begin(ShapeRenderer.ShapeType.Filled);
//        shape.setColor(Color.RED);
//        shape.circle(100,100,50);
//        shape.setColor(Color.BLUE);
//        shape.rect(300,300,20,50);
//
//        shape.end();
    }


    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {
      // game.screenPort.update(width,height);
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

    public void dispose(){
   // shape.dispose();
        stage.dispose();
        skin.dispose();
    }
}
