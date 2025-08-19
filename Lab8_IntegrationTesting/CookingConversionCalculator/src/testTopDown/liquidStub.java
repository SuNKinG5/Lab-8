package testTopDown;

import sqa.main.LiquidVolumeConverter;

public class liquidStub extends LiquidVolumeConverter{
	
	@Override
	public double convert(double liquidValue, String fromUnit, String toUnit) {
		return 500.0;
	}
}
