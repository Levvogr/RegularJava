import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionsTest {

    @Test
    public void isIP() {
        Assert.assertEquals(false, RegularExpressions.isIP("-1.0.0.0"));
        Assert.assertEquals(false, RegularExpressions.isIP("256.4.3.123"));
        Assert.assertEquals(false, RegularExpressions.isIP("ф.128.123.3"));
        Assert.assertEquals(false, RegularExpressions.isIP("6.6.6"));
        Assert.assertEquals(false, RegularExpressions.isIP("0-0-0-0"));
        Assert.assertEquals(false, RegularExpressions.isIP("1.3.a.2"));
        Assert.assertEquals(true, RegularExpressions.isIP("0.0.0.0"));
        Assert.assertEquals(true, RegularExpressions.isIP("255.255.255.255"));
        Assert.assertEquals(true, RegularExpressions.isIP("128.7.0.0"));
        Assert.assertEquals(true, RegularExpressions.isIP("1.1.1.1"));
        Assert.assertEquals(true, RegularExpressions.isIP("128.128.128.128"));
        Assert.assertEquals(true, RegularExpressions.isIP("99.99.99.99"));
    }
}