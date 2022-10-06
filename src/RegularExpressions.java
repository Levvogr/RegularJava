import java.util.regex.Pattern;

public class RegularExpressions {
    static boolean isIP(String s){
        return Pattern.matches("(?:(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))\\.){3}(([0-9])|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))",s);
    }
    static boolean isGUID(String s) {
        return Pattern.matches("[a-fA-F0-9]{8}-(?:[a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}",s);
    }
    static boolean isURl(String s) {
        return Pattern.matches("(?:https?:\\/\\/)?(?:[0-9a-zA-Z][0-9a-zA-Z-_]{0,}[0-9a-zA-Z]\\.){1,}[0-9a-zA-Z][0-9a-zA-Z-_]{0,}[0-9a-zA-Z](?::(0|(6553[0-5])|(655[0-2][0-9])|(65[0-4][0-9]{2})|(6[0-4][0-9]{3})|([1-9][0-9]{0,3})))?(?:\\/(?:[^\\\\/:*?\"<>|]{1,}\\/){0,}[^\\\\/:*?\"<>|]{1,})?(?:\\?(?:[a-zA-z_]\\w{0,}=\\w{1,}&){0,}[a-zA-z_]\\w{0,}=\\w{1,})?(?:#.{1,})?",s);
    }
    static boolean isStrongPassword(String s) {
        return Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}",s);
    }
}
