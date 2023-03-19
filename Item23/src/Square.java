import static java.lang.Math.PI;

public class Square extends Figure{
    private final Integer radius;

    public Square(Integer radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return PI*radius*radius;
    }
}
