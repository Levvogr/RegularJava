import java.util.regex.Pattern;

public class RegularExpressions {
    static boolean isIP(String s){
        return Pattern.matches("(?:(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))\\.){3}(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))",s);
    }
}