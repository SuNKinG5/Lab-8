//ชื่อ-นามสกุล นายตะวัน อุตมาน  รหัสนักศึกษา 663380210-2 Sec 1 

package testBottomUp;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import sqa.main.CookingConversionCalculator;
import sqa.main.LiquidVolumeConverter;
import sqa.main.MassConverter;
import sqa.main.TemperatureConverter;

class TestBottomUp {

	CookingConversionCalculator cal = new CookingConversionCalculator();
	
	TemperatureConverter temp = new TemperatureConverter();
	MassConverter mass = new MassConverter();
	LiquidVolumeConverter liquid = new LiquidVolumeConverter();
	
	@Test
	void testLiquidConversionFactor() {
		double actualResult = liquid.getConversionFactor("tablespoon", "ml");
		
		assertEquals(15, actualResult, 0.01);
	}
	
	@Test
	void testLiquidConverter() {
		double actualResult = liquid.convert(5, "tablespoon", "ml");
		
		assertEquals(75, actualResult, 0.01);
	}
	
	//-------------------------------------------------------------------------
	@Test
	void testMassConversionFactor() {
		double actualResult = mass.getConversionFactor("kilogram", "pound");
		
		assertEquals(2.205, actualResult, 0.01);
	}
	
	@Test
	void testMassConverter() {
		double actualResult = mass.convert(4, "kilogram", "pound");
		
		assertEquals(8.820, actualResult, 0.01);
	}

	
	//-------------------------------------------------------------------------
	@Test
	void testTemperatureConverter() {
		double actualResult = temp.convert(40, "celsius", "fahrenheit");
		
		assertEquals(104, actualResult, 0.01);
	}
	
	//-------------------------------------------------------------------------
	@Test
	void testCalculator() {
		double actualResult = cal.convert(50, "mass", "cup", "gram");
		
		assertEquals(6250, actualResult, 0.01);
	}

}
