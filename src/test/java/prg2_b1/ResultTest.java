package prg2_b1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ResultTest {
    @Test
    public void testEven() {
    	Assert.assertEquals(Result.display(2),"Even");
    }

    @Test
    public void testFail() {
    	Assert.assertEquals(Result.display(1),"Odd");
    }
}


