package testTopDown;

import sqa.main.TemperatureConverter;

public class tempStub extends TemperatureConverter{
	
	@Override
	public double convert(double tempValue, String fromUnit, String toUnit) {
		return 25.0;
	}
}
