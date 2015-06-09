package carte;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DefenseTour extends EmplacementTour {

	public DefenseTour() throws IOException {
		super(ImageIO.read(new File("Images/sol.jpg")));
	}
}
