package carte;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class EmplacementTour extends Case {

	public EmplacementTour() throws IOException {
		super(ImageIO.read(new File("Images/sol.jpg")));
	}
}
