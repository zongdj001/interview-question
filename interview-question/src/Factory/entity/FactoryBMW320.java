package Factory.entity;

public class FactoryBMW320 implements FactoryBMW{

	@Override
	public BMW createBMW() {
		return new BMW320();
	}
}
