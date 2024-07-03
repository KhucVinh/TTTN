package TT;

interface Image{
	public void show(String filename);
}

class LegacyImage{
	public void loadImage(String filename) {
		System.out.println("Loading image from " + filename);
	}
}

class ImageAdapter implements Image{
	private LegacyImage legacyImage;
	
	public ImageAdapter(LegacyImage legacyImage) {
		this.legacyImage = legacyImage;
	}
	
	public void show(String filename) {
		legacyImage.loadImage(filename);
	}
}

public class AdapterPattern {
	public static void main(String[] args) {
		LegacyImage legacyImage = new LegacyImage();
		Image image = new ImageAdapter(legacyImage);
		
		image.show("example.jpg");
		
	}
}
