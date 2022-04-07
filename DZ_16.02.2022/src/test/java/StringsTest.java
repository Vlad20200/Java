import Ex2.Currency;
import Ex3.Strings;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsTest {
    public static Strings strings;
    @BeforeAll
    static void Start(){
        strings = new Strings();
        System.out.println("Start is successful");
    }
    @Test
    void whenDollar_EuroIsNorm(){
        assertEquals(strings.Palindrom("lol"),true);
    }
    @Test
    void whenCountGlasnuhIsNorm(){
        assertEquals(strings.CountGlasnuh("lol"),1);
    }
}
