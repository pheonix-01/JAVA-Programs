class Super{
	private int a;
	protected static int b;
	void display(){
	System.out.println(a);
	}
}

	class Sub extends Super{
		public void get(){
		System.out.println(b);
	}
}

class Inheritance{
	public static void main(String args[]){
	Sub s = new Sub();
	s.get();
	Super sup = new Super();
	sup.display();
	
	}
}
