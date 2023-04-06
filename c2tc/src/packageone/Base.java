package packageone;

public class Base {
	int varDefault=10;// no acess specifier then it is default
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	 
	 
	 	void methodDefault() { // default method
		 System.out.println("default access base class");
		 System.out.println("default variable " +varDefault);
	 	}
		 
		 public void methodPublic() { // default method
			 System.out.println("public base class");
			 System.out.println("default variable"+varPublic);
		 }
			 
			 
			 private void methodPrivate() { // default method
				 System.out.println("private access base class");
				 System.out.println("default variable"+varPrivate);
			 }
				 
				 
				 protected void methodProtected() { // default method
					 System.out.println("private access base class");
					 System.out.println("default variable"+varProtected);
				 }



		 
		 
		 
	 }


