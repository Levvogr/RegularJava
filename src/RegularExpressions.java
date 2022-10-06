import java.util.regex.Pattern;

public class RegularExpressions {
    static boolean isIP(String s){
        return Pattern.matches("(?:(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))\\.){3}(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))",s);
    }
    static boolean isGUID(String s) {
        return Pattern.matches("[a-fA-F0-9]{8}-(?:[a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}",s);
    }
}
