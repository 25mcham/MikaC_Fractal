import processing.core.PApplet;
import java.util.Random;
public class Main extends PApplet {
    private static final double mult = 0.25; //ratio of new side length to old side length
    private static final double side = 300; //side length of largest square
    private Random rand = new Random();
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public Main() {
        super();
    }

    public void settings() {
        size(1000, 700);
    }

    public void draw() {
        background(0);
        fractalIt((width-side)/2 ,(height-side)/2, side);
    }

    public void fractalIt(double x, double y, double s) {
        if(s > 20){
            rect((float)x,(float)y,(float)s,(float)s);
            stroke(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
            fractalIt(x-(mult * s),y-(mult * s), 2 *mult * s);
            fractalIt(x +((1-mult)*s),y + ((1-mult) * s), 2* mult * s);
        } else if ( s <= 20){
            rect((float)x,(float)y,(float)s,(float)s);
            stroke(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
        }
    }
}