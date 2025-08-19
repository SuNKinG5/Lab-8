//ชื่อ-นามสกุล นายตะวัน อุตมาน  รหัสนักศึกษา 663380210-2 Sec 1 

package testTopDown;

import sqa.main.MassConverter;

public class MassConvertStub extends MassConverter{
	
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 28.349;
	}
}
