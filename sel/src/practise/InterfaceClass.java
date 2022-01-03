package practise;


public final  class InterfaceClass  implements Newinterface {
     int b =35;
	public static void main(String[] args) {
		InterfaceClass ic = new InterfaceClass();
		ic.play();
		ic.eat();

	}

	public  void  play() {
		b=b+35;
		System.out.println(b);
	    System.out.println("hello world");
		
	}

	@Override
	public void eat() {
	System.out.println("eating is my hoboy");
	}

	

}
