package question2;

import java.util.Objects;

public class Geometry {
    private String type;
    private String color;

    public static int surface(int i, int i1) {
        return i * i1;
    }

    public static int perimeter(int i) {
        return i*4;
    }

    public void setType(String square) {
        type = square;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Type:"+type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Geometry)) return false;
        Geometry geometry = (Geometry) o;
        return type.equals(geometry.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color);
    }
}
