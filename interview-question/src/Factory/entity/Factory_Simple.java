package Factory.entity;

public class Factory_Simple {
	 public BMW createBMW(int name){
		switch (name) {
		case 320:
			return new BMW320();
		case 532:
			return new BMW532();
		default:
			break;
		}
		return null;
	 }
}
