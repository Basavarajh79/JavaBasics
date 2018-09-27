package casting;

public class MainSample5 {
	public static void main(String[] args) {
		Sample4 ref=new Sample5();//upcasting
		System.out.println("a="+ref.a);
		ref.test();
		Sample5 ref1=(Sample5)ref;//down casting
		System.out.println("a="+ref1.a);
		ref1.test();
		System.out.println("b="+ref1.b);
		ref1.disp();
	}

}
