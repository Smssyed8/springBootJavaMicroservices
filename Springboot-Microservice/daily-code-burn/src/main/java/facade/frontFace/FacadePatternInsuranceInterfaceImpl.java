package facade.frontFace;

import facade.SubSystems.InsuranceRepo;
import facade.SubSystems.PoliceRepo;

public class FacadePatternInsuranceInterfaceImpl implements FacadePatternInsuranceInterface{

	InsuranceRepo repo;
	PoliceRepo policeRepo;

	@Override
	public String getPoliceRepo() {
		// TODO Auto-generated method stub
		repo = new InsuranceRepo();
		return repo.getInsurance();
	}

	@Override
	public String getInsurance() {
		// TODO Auto-generated method stub
		policeRepo = new PoliceRepo();
		return "police";
	}
}
