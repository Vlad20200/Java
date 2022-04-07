import Ex1.Areas;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreasTest {
    public static Areas areas;
    @BeforeAll
    static void Start(){
        areas = new Areas();
        System.out.println("Start is successful");
    }

    @Test
    void whenTrieagleIsNorm(){
        assertEquals(areas.Trieagle(3,5,4),6);
    }

    @Test
    void whenRectangleIsNorm(){
        assertEquals(areas.Rectangle(3,5),15);
    }

    @Test
    void whenSquareIsNorm(){
        assertEquals(areas.Square(3),9);
    }

    @Test
    void whenRhombusIsNorm(){
        assertEquals(areas.Rhombus(3,5),15);
    }
}
