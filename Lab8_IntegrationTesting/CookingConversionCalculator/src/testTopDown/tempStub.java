//ชื่อ-นามสกุล นายตะวัน อุตมาน  รหัสนักศึกษา 663380210-2 Sec 1 

package testTopDown;

import sqa.main.TemperatureConverter;

public class tempStub extends TemperatureConverter{
	
	@Override
	public double convert(double tempValue, String fromUnit, String toUnit) {
		return 25.0;
	}
}
