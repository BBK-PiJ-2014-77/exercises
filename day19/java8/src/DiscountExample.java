import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by digibrose on 02/03/2015.
 */
public class DiscountExample {

    public static void main(String[] args){
        final List<BigDecimal> prices = Arrays.asList( new BigDecimal("10"), new BigDecimal("25"), new BigDecimal("33"));

       BigDecimal totalDiscount = BigDecimal.ZERO;

        for (BigDecimal price: prices){
            if (price.compareTo(BigDecimal.valueOf(20)) > 0){
                totalDiscount = totalDiscount.add(price.multiply(BigDecimal.valueOf(0.9)));
            }

        }

        System.out.println(totalDiscount);

        final BigDecimal totaldis =
                prices.stream()
                    .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                    .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totaldis);


    }
}
