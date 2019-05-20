package sample;



import javafx.geometry.Bounds;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Box extends Rectangle {

    private  int width;
    private int height;
    private ImagePattern texture;

    public Box () {

    }
    public Box(int width, int height, ImagePattern texture) {
        super(width, height, texture);

        this.width = width;
        this.height = height;
        this.texture = texture;
    }

    public boolean isIntersect(ImageView playerView) {
        Player player = new Player(playerView);
        return  this.getX() == player.getX() &&
                this.getY() == player.getY();
    }

}
