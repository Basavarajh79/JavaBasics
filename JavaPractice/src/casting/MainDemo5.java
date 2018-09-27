package casting;

public class MainDemo5 {
	public static void main(String[] args) {
		Demo3 d1=new Demo5();
		System.out.println("a="+d1.a);
		if(d1 instanceof Demo4){
			Demo4 d2=(Demo4)d1;
			System.out.println("a="+d2.a);
			System.out.println("b="+d2.b);
	
		}
		if(d1 instanceof Demo5){
			Demo5 d3=new Demo5();
			System.out.println("a="+d3.a);
			System.out.println("b="+d3.b);
			System.out.println("c="+d3.c);
		}
		Demo3 ref1=new Demo4();
		if(ref1 instanceof Demo5)
		{
			Demo5 ref2=(Demo5)ref1;
			System.out.println("a="+ref2.a);
			System.out.println("b="+ref2.b);
			System.out.println("c="+ref2.c);
		}
		else{
			System.out.println("properties are not present");
		}
		
	}

}
