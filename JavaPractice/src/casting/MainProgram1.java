package casting;

public class MainProgram1 {
	public static void main(String[] args) {
		
		Program1 ref=new Program1();
		ref.demo(new Sample1());
		ref.demo(new Sample2());
		ref.demo(new Sample3());
		ref.demo1(new Sample2());
		ref.demo1(new Sample3());
		ref.demo2(new Sample3());
	}
}
