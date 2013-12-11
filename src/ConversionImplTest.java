/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.TestCase;

import org.junit.Test;

/**
 *
 * @author Akshit
 */
public class ConversionImplTest extends TestCase{
    
    public ConversionImplTest() {
    }

    /*
     * For your information:
     * [°C] = ([°F] - 32) × 5/9
     * [°F] = [°C] × 9/5 + 32
     * [Kelvin] = [°C] + 273.15
     */

    @Test
    public void testFahrenheitToCelcius() {
        double fahrenheitTemp = 41.0;
        ConversionImpl instance = new ConversionImpl();
        double expResult = 5.0;
        double result = instance.fahrenheitToCelcius(fahrenheitTemp);
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCelciusToFahrenheit() {
        double celciusTemp = 100.0;
        ConversionImpl instance = new ConversionImpl();
        double expResult = 212.0;
        double result = instance.celciusToFahrenheit(celciusTemp);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testCelciusToKelvin() {
        double celciusTemp = 45.0;
        ConversionImpl instance = new ConversionImpl();
        double expResult = 318.15;
        double result = instance.celciusToKelvin(celciusTemp);
        assertEquals(expResult, result, 0.01);        
    }
}
