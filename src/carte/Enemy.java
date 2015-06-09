package carte;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Enemy extends AssaillantSpawn{

public Enemy() throws IOException{
	super(ImageIO.read(new File ("Images/vortex.jpg")));
}
}
