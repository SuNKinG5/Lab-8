package testBottomUp;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import sqa.main.LiquidVolumeConverter;

class TestBottomUp {

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

}
