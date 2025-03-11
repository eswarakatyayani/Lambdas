package Service;

import Shape.Shape;
public class ShapeExample {
 public static void main(String[] args) {
     Shape rect = () -> System.out.println("Rectangle is drawn");
     rect.draw();
 }
}

