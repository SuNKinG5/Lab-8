package testTopDown;

import sqa.main.MassConverter;

public class MassConvertStub extends MassConverter{
	
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 28.349;
	}
}
