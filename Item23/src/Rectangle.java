public class Rectangle extends Figure{

    private final Integer length;
    private final Integer width;

    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }
}
