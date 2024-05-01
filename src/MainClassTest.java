import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("Test Failed: Value !=14", getLocalNumber() == 14);
    }

    @Test
    public void testClassNumber() {
        Assert.assertTrue("Test Failed: Value < 45",getClassNumber() > 45);
    }
}