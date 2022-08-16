package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture imgF15;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		imgF15 = new Texture("f-15-eagle.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);

		float x = Gdx.input.getX() - imgF15.getWidth()/2;
		float y = Gdx.graphics.getHeight() - Gdx.input.getY() - imgF15.getHeight()/2;

		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(imgF15, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
