package com.gdxtester.boardgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gdxtester.boardgame.GameUserInterface.GameIngenious;
import com.gdxtester.boardgame.GameUserInterface.GameMenu;

import static com.gdxtester.boardgame.GameConstants.Constants.sc_Height;
import static com.gdxtester.boardgame.GameConstants.Constants.sc_Width;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = sc_Height;
		config.width = sc_Width;
		new LwjglApplication(new GameIngenious(), config);
		//new LwjglApplication(new GameMenu(), config);

	}
}
