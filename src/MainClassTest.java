import org.junit.Test;
import org.junit.Assert;



public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Test Failed: Value !=14", getLocalNumber() == 14);
    }
}