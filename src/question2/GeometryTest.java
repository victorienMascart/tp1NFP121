package question2;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class GeometryTest {
    @Test
    public void checkFieldVisibility() {
        try {
            // check if the field 'type' is private
            Field field = Geometry.class.getDeclaredField("type");
            assertTrue(Modifier.isPrivate(field.getModifiers()));
        } catch (NoSuchFieldException noSuchFieldException) {
            System.out.println("The type field doesn't exist anymore which is a fail");
            assertFalse(true);
        }
    }

    @Test
    public void checkFieldIsDeclared() {
        try {
            // check if the field 'color' is declared in the class Geometry
            Geometry.class.getDeclaredField("color");
        } catch (NoSuchFieldException noSuchFieldException) {
            System.out.println("The color field doesn't exist yet which is a fail");
            assertFalse(true);
        }
        assertTrue(true);
    }

    @Test
    public void checkSurfaceCalculation() {
        // Here we suppose that the geometry is a square (carré) and the formula of the surface for a square is a * a. Tips : The method is statically called
        assertEquals(25, Geometry.surface(5, 5));
    }

    @Test
    public void checkPerimeterCalculation() {
        // Here the perimeter of a square by the formula a * 4
        assertEquals(20, Geometry.perimeter(5));
    }

    @Test
    public void checkToStringMethod() {
        Geometry geometry = new Geometry();
        geometry.setType("square");
        assertEquals("Type:square", geometry.toString());
    }

    @Test
    public void checkEquality() {
        Geometry littleSquare = new Geometry();
        littleSquare.setType("square");
        Geometry bigSquare = new Geometry();
        bigSquare.setType("square");
        assertTrue(littleSquare.equals(bigSquare));
    }
}
