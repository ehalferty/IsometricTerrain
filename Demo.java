package my.halferty.isometricterrain;

public class Demo {
	public static void main(String [] args) {
		System.setProperty("sun.java2d.ddscale", "true");
		//System.setProperty("sun.java2d.accthreshold", "0");
		System.setProperty("sun.java2d.translaccel", "true");
	    System.setProperty("sun.java2d.d3d", "True");
	    System.setProperty("sun.java2d.ddforcevram", "True");
	    //System.setProperty("sun.java2d.trace", "timestamp,log,count, test"); // Logging to see if Direct3D or software rendering is being used.
	    
	    
		Terrain terrain = new Terrain(515, 50.0f, 75.0f, 45.0f); // Size of terrain must be (2^a) + 1
		
		terrain.applyBoxBlur(10);
		terrain.levelWater();
		
		IsometricRenderWindow window = new IsometricRenderWindow(1800, 1000, terrain);
	}
}
