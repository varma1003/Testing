import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArea {
    private static Area st;

    @BeforeClass
    public static void setup() {
        st = new Area();
    }

    @Test
    public void test_circle_area(){
        assertEquals(50,st.circle_area(4));
    }

    @Test
    public void test_rectangle_area(){
        assertEquals(20, st.rectangle_area(4,5));
    }

    @Test
    public void test_triangle_area(){
        assertEquals(10, st.triangle_area(4,5));
    }
}
