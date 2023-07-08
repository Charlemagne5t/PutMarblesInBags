import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.WatchEvent;

public class SolutionTest {
    @Test
    public void putMarblesTest1(){
        int[] weights = {1,3,5,1};
        int k = 2;
        long expected = 4L;
        long actual = new Solution().putMarbles(weights, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void putMarblesTest2(){
        int[] weights = {1, 3};
        int k = 2;
        long expected = 0L;
        long actual = new Solution().putMarbles(weights, k);

        Assertions.assertEquals(expected, actual);
    }


}
