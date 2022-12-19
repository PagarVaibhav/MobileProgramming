package Factory;

public class GetPlanFactory {

	public Plan getPlan(String planType) {
		
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTIC")) {
			return new Domestic();
			
		} else if (planType.equalsIgnoreCase("COMMERCIAL")) {
			return new Commercial();
			
		} else if (planType.equalsIgnoreCase("INDUSTRIAL")) {
			return new Industrial();
		}
		
		return null;
}  
}
