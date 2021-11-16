package apache;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringEscapeUtilsTest extends Object {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void escapeJava() {
        String testString = "测试字符串";
        String outString = MyStringEscapeUtils.escapeJava(testString);
        //System.out.println(outString);
        //System.out.println("\\u6D4B\\u8BD5\\u5B57\\u7B26\\u4E32");
        assertEquals(outString,"\\u6D4B\\u8BD5\\u5B57\\u7B26\\u4E32");
    }

    @Test
    void escapeHtml4() {
        String testString = "<test>测试String</test>";
        String outString = MyStringEscapeUtils.escapeHtml4(testString);
        //System.out.println(outString);
        //System.out.println("&lt;test&gt;测试String&lt;/test&gt;");
        assertEquals(outString,"&lt;test&gt;测试String&lt;/test&gt;");
    }

    @Test
    void escapeXml10() {
        String testString = "<test>测试String</test>";
        String outString = MyStringEscapeUtils.escapeXml10(testString);
        //System.out.println(outString);
        //System.out.println("&lt;test&gt;测试String&lt;/test&gt;");
        assertEquals(outString,"&lt;test&gt;测试String&lt;/test&gt;");
    }
}