package com.gdxtester.boardgame.Assets_Skin_Manager;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.SkinLoader;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.gdxtester.boardgame.GameConstants.Constants;

public class SAManager {

        public final AssetManager manager = new AssetManager();

        public void queueAddSkin(){
            SkinLoader.SkinParameter parameter = new SkinLoader.SkinParameter(Constants.skinAtlas);
            manager.load(Constants.skin,Skin.class,parameter);
        }
    }

