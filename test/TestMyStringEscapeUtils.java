import apache.MyStringEscapeUtils;

public class TestMyStringEscapeUtils {
    public static void main(String[] args){
        TestMyStringEscapeUtils myTest = new TestMyStringEscapeUtils();
        myTest.testEscapeJava();
        myTest.testEscapeHtml();
        myTest.testEscapeXml();
    }

    public static void testEscapeJava(){
        String testString = "测试字符串";
        String outString = MyStringEscapeUtils.escapeJava(testString);
        //System.out.println(outString);
        //System.out.println("\\u6D4B\\u8BD5\\u5B57\\u7B26\\u4E32");
        if(outString.equals("\\u6D4B\\u8BD5\\u5B57\\u7B26\\u4E32")){
            System.out.println("escapeJava_OK");
        }else{
            System.out.println("escapeJava_ERROR");
        }
    }
    public static void testEscapeHtml(){
        String testString = "<test>测试String</test>";
        String outString = MyStringEscapeUtils.escapeHtml4(testString);
        //System.out.println(outString);
        //System.out.println("&lt;test&gt;测试String&lt;/test&gt;");
        if(outString.equals("&lt;test&gt;测试String&lt;/test&gt;")){
            System.out.println("escapeHtml_OK");
        }else{
            System.out.println("escapeHtml_ERROR");
        }
    }
    public static void testEscapeXml(){
        String testString = "<test>测试String</test>";
        String outString = MyStringEscapeUtils.escapeXml10(testString);
        //System.out.println(outString);
        //System.out.println("&lt;test&gt;测试String&lt;/test&gt;");
        if(outString.equals("&lt;test&gt;测试String&lt;/test&gt;")){
            System.out.println("escapeXml_OK");
        }else{
            System.out.println("escapeXml_ERROR");
        }
    }
}
