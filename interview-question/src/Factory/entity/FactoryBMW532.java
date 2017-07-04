package Factory.entity;

public class FactoryBMW532 implements FactoryBMW{

	@Override
	public BMW createBMW() {		
		return new BMW532();
	}

}
