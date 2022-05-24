package object.entity;

import java.awt.*;

public interface IEntity {

    void move();

    void draw(Graphics2D g2);

    void interactCoin(int i);

    void interactEntity(int i);

}
