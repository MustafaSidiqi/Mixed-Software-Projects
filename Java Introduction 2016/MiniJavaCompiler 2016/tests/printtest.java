class testmain {
	
	public static void main (String[] args) {
		A a;
		a=new A();
		System.out.println(a.x);
		System.out.println(a.getX());
		System.out.println(a.x);
		return;
	}
}

class A {
   int x;

   public int getX() {
	 x=42;
     return (x);
   }
}
