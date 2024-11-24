package text.school.app;

import text.school.base.Shape;
import text.school.derived.Circle;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}