package com.gdxtester.boardgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameMain extends ApplicationAdapter implements InputProcessor {
	SpriteBatch batch;
//	private Skin skin ;
//	private Stage stage;
	Texture img,img1,img2,img3;
	Sprite sprite;
	boolean movingRight=false;

    /**
     * objects created: don't forget to dispose
     */
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		img1 = new Texture("mainmenu.png");
		img2 = new Texture("start.png");
		img3 = new Texture("start1.png");
		sprite = new Sprite(img2);
		sprite.setPosition(Gdx.graphics.getWidth()/2-img2.getWidth()/2,Gdx.graphics.getHeight()/2-img2.getHeight()/2);
		//sprite.setRotation(90f);
	//	sprite.setScale(1.0f,1.0f);
        Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
        /**
         * sprite animation and input methods
         */
		/**if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
			sprite.translateX(-1f);
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
			sprite.translateX(1f);
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
			sprite.translateY(-1f);
		if(Gdx.input.isKeyPressed(Input.Keys.UP))
			sprite.translateY(1f);
		if(Gdx.input.isButtonPressed(Input.Buttons.LEFT))
			sprite.setPosition(Gdx.input.getX()-sprite.getWidth()/2,Gdx.graphics.getHeight()-Gdx.input.getY()-sprite.getHeight()/2);
		if(Gdx.input.isButtonPressed(Input.Buttons.RIGHT))
			sprite=new Sprite(img3);
			sprite.setPosition(Gdx.graphics.getWidth()/2-img2.getWidth()/2,Gdx.graphics.getHeight()/2-img2.getHeight()/2);
         */
        /**
         * render Faction
         */
        if(movingRight)
            sprite.translateX(1f);

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		//batch.draw(img, 0, 0);
		batch.draw(img1,Gdx.graphics.getWidth()/2-img1.getWidth()/2,Gdx.graphics.getHeight()- img1.getHeight());
		batch.draw(sprite, sprite.getX(),sprite.getY());
		//batch.draw(sprite, sprite.getX(),sprite.getY(), sprite.getRegionWidth()/2,sprite.getHeight()/2,sprite.getWidth(),sprite.getHeight(),sprite.getScaleX(),sprite.getScaleY(),sprite.getRotation());
		//batch.draw(img2,Gdx.graphics.getWidth()/2-img2.getWidth()/2,Gdx.graphics.getHeight()/2-img2.getHeight()/2);
		batch.end();
	}

    /**
     * always dispose of object: memory leak
     */
	public void dispose () {

		batch.dispose();
		img.dispose();
		img1.dispose();
		img2.dispose();
		img3.dispose();
	}

    @Override
    public boolean keyDown(int keycode) {
        if(keycode==Input.Keys.LEFT)
            sprite.translateX(-1f);
        if(keycode==Input.Keys.RIGHT)
            movingRight=true;
            sprite.translateX(1f);
        if(keycode==Input.Keys.DOWN)
            sprite.translateY(-1f);
        if(keycode==Input.Keys.UP)
            sprite.translateY(1f);
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if(keycode==Input.Keys.RIGHT)
            movingRight=false;
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
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
      //  sprite.setPosition(screenX-sprite.getWidth()/2,Gdx.graphics.getHeight()-screenY-sprite.getHeight()/2);
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
