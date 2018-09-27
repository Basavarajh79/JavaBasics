package casting;

public class MainFactory {
	public static void main(String[] args) {
		Factory ref=new Factory();
		ref.enginemaker(new TwoWheeler());
		ref.enginemaker(new ThreeWheeler());
		ref.enginemaker(new FourWheeler());
	}
}
