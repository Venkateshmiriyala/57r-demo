public static void main(String[] args){
		System.out.println("main starts");
		sm1();
		System.out.println("main ends");
		
	}
	
	public void nsm1() {
         
		sm2();
		System.out.println("nsm1");
	}
	public void nsm2() {
		
	     nsm1();
		System.out.println("nsm2");
	}
	public  static void sm2() {
	System.out.println("sm2");
    }
	public  static void sm1() {
		Methods m = new Methods();
		
	     m.nsm2();
		System.out.println("sm1");
	}
}