/**   Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
 жана circumference деген статик методдору болсун.
 areaны табуу учун: PI * (radius * radius)
 circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат**/

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setPI(5);
        circle.setRadius(8);

        Circle.methodArea(circle.getPI(), circle.getRadius());
        Circle.methodCircumference(circle.getPI(), circle.getRadius());

    }
}