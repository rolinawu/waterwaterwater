package water.water;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Cloud extends Entity {
	
	public Cloud init(float x, float y) {
		TextureRegion tex = RandomItem.clouds.get();
		
		float scale = 8;
		drawWidth = tex.getRegionWidth() * scale;
		drawHeight = tex.getRegionHeight() * scale;
		
		init(0, x + drawWidth * 0.5f, y, drawWidth, drawHeight, tex);
		
		flipX = random.nextBoolean();
		
		return this;
	}
	
	public boolean collidesWith(Entity other) {
		return false;
	}

}
