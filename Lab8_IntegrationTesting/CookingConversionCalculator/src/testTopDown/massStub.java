package testTopDown;

import sqa.main.MassConverter;

public class massStub extends MassConverter{
	
	@Override
	public double convert(double massValue, String fromUnit, String toUnit) {
		return 1200.0;
	}
}
