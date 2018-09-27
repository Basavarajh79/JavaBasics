package casting;

public class Program1 {
	public void demo(Sample1 s1){
		
		System.out.println("a="+s1.a);
	}
	public void demo1(Sample2 s2){
		System.out.println("a="+s2.a);
		s2.test();
		System.out.println("b="+s2.b);
		s2.start();
	}
	public void demo2(Sample3 s3){
		System.out.println("a="+s3.a);
		s3.test();
		System.out.println("b="+s3.b);
		s3.start();
		System.out.println("c="+s3.c);
		s3.disp();
	}

}
