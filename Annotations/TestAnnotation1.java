class A{  
	void m1()
		{
		System.out.println("A m1 called");
		}
	void m2()
		{
				System.out.println("A m2 called");
		}
	void m3()
		{
				System.out.println("A m3 called");
		}
	void m44()
		{
				System.out.println("A m4 called");
		}
	}  
      
  class B extends A{  
		
		void m3()
		{
				System.out.println("B m3 called");
		}
	
	@Override void m1()
		{
		 System.out.println("B m1 called");
		}

@Override  
void m2()
		{
				System.out.println("B m2 called");
		}

void m4()
		{
				System.out.println("B m4 called");
		}
    }  
      
    class TestAnnotation1{  
    public static void main(String args[]){  
    A a=new B();  
    a.m1();
	a.m2();
	a.m3();
    }
	}  