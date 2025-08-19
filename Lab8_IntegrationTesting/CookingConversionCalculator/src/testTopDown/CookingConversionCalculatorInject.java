//ชื่อ-นามสกุล นายตะวัน อุตมาน  รหัสนักศึกษา 663380210-2 Sec 1 

package testTopDown;

import sqa.main.LiquidVolumeConverter;
import sqa.main.MassConverter;
import sqa.main.TemperatureConverter;

public class CookingConversionCalculatorInject {
	 private TemperatureConverter tempConverter;
	 private MassConverter massConverter;
	 private LiquidVolumeConverter liquidConverter;

	 //สร้างคลาสให้มี constructor จะได้เปลี่ยน object ได้
	 public CookingConversionCalculatorInject(TemperatureConverter tempConverter, MassConverter massConverter, LiquidVolumeConverter liquidConverter) {
		 this.tempConverter = tempConverter;
	     this.massConverter = massConverter;
	     this.liquidConverter = liquidConverter;
	 }

	 public double convert(double value, String choice, String fromUnit, String toUnit) {
	     double result = 0.0;

	     if (choice.equals("temperature")) {
	         result = tempConverter.convert(value, fromUnit, toUnit);
	     } else if (choice.equals("mass")) {
	         result = massConverter.convert(value, fromUnit, toUnit);
	     } else if (choice.equals("liquid")) {
	         result = liquidConverter.convert(value, fromUnit, toUnit);
	     }

	     return result;
	 }
}
