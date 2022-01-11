import facade.frontFace.FacadePatternInsuranceInterface;
import facade.frontFace.FacadePatternInsuranceInterfaceImpl;

public class Client {
	static FacadePatternInsuranceInterface face = new FacadePatternInsuranceInterfaceImpl();
	
	public static void main(String[] args) {
		
		//facade
		System.out.println("face insurance = "+face.getInsurance());
		System.out.println("police data = "+face.getPoliceRepo());
	}
}
