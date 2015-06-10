package carte;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class AssaillantSpawn extends Case{

public AssaillantSpawn() throws IOException{
	super(ImageIO.read(new File ("Images/vortex.jpg")));
}
}
