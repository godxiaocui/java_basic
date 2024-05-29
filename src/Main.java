import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
       // 传入字符串和用静态方法是推荐的
        BigDecimal bigDecimal = new BigDecimal("2");
        BigDecimal bigDecimal1 = BigDecimal.valueOf(2);
        // 用double不推荐
        BigDecimal bigDecimal2 = new BigDecimal(2.0);
    }
}