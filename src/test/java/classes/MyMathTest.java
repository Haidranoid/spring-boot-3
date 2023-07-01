package classes;

import static org.junit.jupiter.api.Assertions.*;

import com.example.myfirstwebapp.classes.MyMath;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void calculateSum_ThreeMemberArray() {
        int result = math.calculateSum(new int[]{1, 2, 3});
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }

    @Test
    void calculateSum_ZeroLengthArray() {
        int result = math.calculateSum(new int[]{});
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }
}
