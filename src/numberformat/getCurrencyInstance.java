package numberformat;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

/**
 * @author liwei
 * @create 2022-03-26-9:56
 **/
public class getCurrencyInstance {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("99.8");
        NumberFormat.getCurrencyInstance();
    }
}
