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
    @Test
    public void testIsGUID() {
        Assert.assertEquals(false, RegularExpressions.isGUID("G02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        Assert.assertEquals(false, RegularExpressions.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038baG"));
        Assert.assertEquals(false, RegularExpressions.isGUID("-12fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        Assert.assertEquals(false, RegularExpressions.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba_"));
        Assert.assertEquals(false, RegularExpressions.isGUID("e02fd0e4.00fd.090A.ca30.0d00a0038ba0"));
        Assert.assertEquals(false, RegularExpressions.isGUID("e02fd0e4-00fd-090A-c[30-0d00a00]8ba0"));
        Assert.assertEquals(true, RegularExpressions.isGUID("11223344-00fF-090A-ca30-0d00a0038ba0"));
        Assert.assertEquals(true, RegularExpressions.isGUID("FFFfd0e4-00fd-090A-ca30-0d00a0038ba0"));
        Assert.assertEquals(true, RegularExpressions.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038b99"));
        Assert.assertEquals(true, RegularExpressions.isGUID("e02fd0e4-0111-090A-ca30-0d00a0038ba0"));
        Assert.assertEquals(true, RegularExpressions.isGUID("e02fd0e4-00fd-AAAA-ca30-0d00a0038ba0"));
        Assert.assertEquals(true, RegularExpressions.isGUID("e02fd0e4-00fd-090A-aaaa-0d00a0038ba0"));
    }
    @Test
    public void testIsURL() {
        Assert.assertEquals(false, RegularExpressions.isURl("Just Text"));
        Assert.assertEquals(false, RegularExpressions.isURl("http://a.com."));
        Assert.assertEquals(false, RegularExpressions.isURl("http://www.example.com:65536/pa/th#sfa"));
        Assert.assertEquals(false, RegularExpressions.isURl("http://www.example.com:-1"));
        Assert.assertEquals(false, RegularExpressions.isURl("http://www.-Examaple.com"));
        Assert.assertEquals(false, RegularExpressions.isURl("http://ww]w.Example.com"));
        Assert.assertEquals(true, RegularExpressions.isURl("http://www.example.com:0"));
        Assert.assertEquals(true, RegularExpressions.isURl("http://www.example.com:65535"));
        Assert.assertEquals(true, RegularExpressions.isURl("http://www.exam-ple.com:8080/pa/th?q1=val1&q2=val2#sfafass"));
        Assert.assertEquals(true, RegularExpressions.isURl("http://www.example.com:8080#sfafass"));
        Assert.assertEquals(true, RegularExpressions.isURl("http://www.example.com:8080/pa/th"));
        Assert.assertEquals(true, RegularExpressions.isURl("example.com"));
    }
}