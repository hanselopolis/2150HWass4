
public class HWassignment4Question5 {
    public static void main(String args[]) {
    
        System.out.println();
        

        System.out.println("Object 1 created: (Base object/Base type)");
        Base obj1 = new Base();		// creates Base object, of super (grandparent) class
        System.out.println(obj1); // calls base toString method
        System.out.println();
        

        System.out.println("Object 2 created: (Derive object/Derive type)");
        Derive obj2 = new Derive(); // creates Derive object, of first subclass (parent)
        System.out.println(obj2); //calls derive toString method
        System.out.println();
        

        System.out.println("Object 3 created: (D1 object/D1 type)");
        D1 obj3 = new D1();			// creates D1 object, of second sublass of super (child)
        System.out.println(obj3); // no D1 toString, calls Derive toString method
        System.out.println();
        

        System.out.println("Object 4 created: (Derive object/Base type)");
        Base obj4 = new Derive();	// creates Derive object of Base type, of parent class
        System.out.println(obj4); // calls derive toString method
        
    }
}

class Base {

	public Base () {
		this.m1();
	}

    public void m1 () {
    	System.out.println("m1() from Base");
    }
    
    public String toString() {
    	return "Class: Base";
    } 
}

class Derive extends Base {

	public Derive () {
		super();
	}
	
	public void m1 () {
    	System.out.println("m1() from Derive");
    }
    
    public String toString() {
    	return "Class: Derive from Class: Base";
    }
}

class D1 extends Derive {

	public D1 () {
		super();	
	}

	public void m1 () {
    	System.out.println("m1() from D1");
    }

    public String toString() {
    	return "Class: D1 from Class: Derive from Class: Base";
    }
}

