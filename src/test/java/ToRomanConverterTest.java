import com.jotov.roman.Converter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToRomanConverterTest {
    private Converter converter = new Converter();

    @Test
    public void OneToTenTest() {
        assertEquals("I", converter.toRoman(1));
        assertEquals("II", converter.toRoman(2));
        assertEquals("III", converter.toRoman(3));
        assertEquals("IV", converter.toRoman(4));
        assertEquals("V", converter.toRoman(5));
        assertEquals("VI", converter.toRoman(6));
        assertEquals("VII", converter.toRoman(7));
        assertEquals("VIII", converter.toRoman(8));
        assertEquals("IX", converter.toRoman(9));
        assertEquals("X", converter.toRoman(10));
    }
    @Test
    public void AdditionalTests() {
        assertEquals("XIX", converter.toRoman(19));
        assertEquals("XXI", converter.toRoman(21));
        assertEquals("XX", converter.toRoman(20));
        assertEquals("XXX", converter.toRoman(30));
        assertEquals("XL", converter.toRoman(40));
        assertEquals("XLII", converter.toRoman(42));
        assertEquals("XLIX", converter.toRoman(49));
    }
    @Test
    public void ThreeDigitTests() {
        assertEquals("XCIX", converter.toRoman(99));
        assertEquals("C", converter.toRoman(100));
        assertEquals("CD", converter.toRoman(400));
        assertEquals("D", converter.toRoman(500));

    }
}
