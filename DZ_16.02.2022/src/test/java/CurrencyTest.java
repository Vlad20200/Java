import Ex1.Areas;
import Ex2.Currency;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyTest {
    public static Currency currency;
    @BeforeAll
    static void Start(){
        currency = new Currency();
        System.out.println("Start is successful");
    }
    @Test
    void whenDollar_EuroIsNorm(){
        assertEquals(currency.Dollar_Euro(6),5.28);
    }
    @Test
    void whenEuro_DollarIsNorm(){
        assertEquals(currency.Euro_Dollar(6),6.84);
    }
    @Test
    void whenGBP_JenaIsNorm(){
        assertEquals(currency.GBP_Jena(6),936);
    }
    @Test
    void whenJena_GBPIsNorm(){
        assertEquals(currency.Jena_GBP(6), 0.0384);
    }


}
