    import java.util.*;  
    class TestAnnotation2
	{  
    
	@SuppressWarnings("unchecked")  
    public static void main(String args[])
	{  
		ArrayList list=new ArrayList();  
		list.add("scott");  
		list.add("david");  
		list.add("john");  
		  
		for(Object obj:list)  
		System.out.println(obj);    
    }

}  