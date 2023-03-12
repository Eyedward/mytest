import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式，又称规则表达式,（Regular Expression，在代码中常简写为regex、regexp或RE），是一种文本模式，包括普通字符（例如，a 到 z 之间的字母）和特殊字符（称为"元字符"），是计算机科学的一个概念。
 * 正则表达式使用单个字符串来描述、匹配一系列匹配某个句法规则的字符串，通常被用来检索、替换那些符合某个模式（规则）的文本。
 * 简单来说，正则表达式就是一个很牛逼的字符串处理工具。
 */
public class RegexPattern {
    public static void main(String[] args) {
        /**
         * Pattern类
         * pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，
         * 你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。
         * 该方法接受一个正则表达式作为它的第一个参数。
         */
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaab");
        boolean matches = matcher.matches();
        System.out.println("a*b是否完全匹配aaaab:"+matches);

        //判断"a"是否完全匹配"abc"
        boolean matches1 = Pattern.matches("a", "abc");
        System.out.println("a是否完全匹配abc:"+matches1);
        //判断"a.c"是否完全匹配"abc"
        boolean matches2 = Pattern.matches("a.c", "abc");
        boolean matches3 = Pattern.matches("abc", "a.c");
        System.out.println("a.c是否完全匹配abc:"+matches2);
        System.out.println(matches3);

        /**
         * Matcher类
         * Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。
         * 你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。
         */

    }
}
