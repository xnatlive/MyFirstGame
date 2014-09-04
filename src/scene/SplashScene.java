package scene;

import org.andengine.engine.camera.Camera;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.util.GLState;
import org.andengine.util.color.Color;

import com.xnat.myfirstgame.base.BaseScene;
import com.xnat.myfirstgame.manager.SceneManager.SceneType;

public class SplashScene extends BaseScene {
	
	// variables
	
	private Sprite splash;
	// 
	
	@Override
	public void createScene() {
		setBackground(new Background(Color.BLACK));
		splash = new Sprite(0, 0, resourcesManager.splash_region, vbom)
		{
		    @Override
		    protected void preDraw(GLState pGLState, Camera pCamera) 
		    {
		       super.preDraw(pGLState, pCamera);
		       pGLState.enableDither();
		       
		    }
		};

		splash.setScale(1f);
		splash.setPosition(288, 120);
		attachChild(splash);


	}

	@Override
	public void onBackKeyPressed() {
		// TODO Auto-generated method stub

	}

	@Override
	public SceneType getSceneType() {
	
		return SceneType.SCENE_SPLASH;
		
	}

	@Override
	public void disposeScene() {
		splash.detachSelf();
	    splash.dispose();
	    this.detachSelf();
	    this.dispose();

	}

}
