package testTopDown;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sqa.main.LiquidVolumeConverter;
import sqa.main.MassConverter;
import sqa.main.TemperatureConverter;

class TestTopDown {

	CookingConversionCalculatorInject calculator;
	
	TemperatureConverter tempConverter = new TemperatureConverter();
	
	MassConverter massConverter = new MassConvertStub();
	MassConverter massConFactor = new MassConverter();
	
	LiquidVolumeConverter liquidConverter = new LiquidConvertStub();
	LiquidVolumeConverter liquidConFactor = new LiquidVolumeConverter();
	
	@BeforeEach
    void setUp() {
        TemperatureConverter tempConverterStub = new tempStub();
        MassConverter massConverterStub = new massStub();
        LiquidVolumeConverter liquidConverterStub = new liquidStub();

        //ใช้ Stub แทน class ปกติ
        calculator = new CookingConversionCalculatorInject(tempConverterStub, massConverterStub, liquidConverterStub);
    }
	
	//-------------------------------------------------------------------------
	@Test
	void testTemp() {
		double actualResult = calculator.convert(77.0, "temperature", "fahrenheit", "celsius");
		
		assertEquals(25.0, actualResult, 0.01);
	}
	
	@Test
	void testMass() {
		double actualResult = calculator.convert(400, "mass", "teaspoon", "gram");
		
		assertEquals(1200.0, actualResult, 0.01);
	}
	
	@Test
	void testLiquid() {
		double actualResult = calculator.convert(2, "liquid", "cup", "ml");
		
		assertEquals(500.0, actualResult, 0.01);
	}
	
	//-------------------------------------------------------------------------
	@Test
	void testTemperatureConverter() {
		double actualResult = tempConverter.convert(40.0, "celsius", "fahrenheit");

		assertEquals(104.0, actualResult, 0.01);
	}
	
	//-------------------------------------------------------------------------
	@Test
	void testMassConverter() {
		double actualResult = massConverter.convert(4, "oz", "gram");
		
		assertEquals(113.396, actualResult, 0.01);
	}
	
	@Test
	void testMassConversionFactor() {
		double actualResult = massConFactor.getConversionFactor("pound", "kilogram");
		
		assertEquals(0.454, actualResult, 0.01);
	}
	
	//-------------------------------------------------------------------------
	@Test
	void testLiquidConverter() {
		double actualResult = liquidConverter.convert(1, "tablespoon", "ml");
		
		assertEquals(15, actualResult, 0.01);
	}
	
	@Test
	void testLiquidConversionFactor() {
		double actualResult = liquidConFactor.getConversionFactor("pint", "ml");
		
		assertEquals(473.176, actualResult, 0.01);
	}

}
