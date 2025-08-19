package testTopDown;

import sqa.main.LiquidVolumeConverter;

public class LiquidConvertStub extends LiquidVolumeConverter{
	
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 15.0;
	}
}
