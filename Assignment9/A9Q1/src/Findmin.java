import java.util.Iterator;

public class Findmin  {
	 static <T extends Number > T findmin(T[] arr)
	{
		 T result=arr[0];
		 {
			 for(T ele : arr)
			 {
				 if(result.doubleValue() > ele.doubleValue()) // cont use </> with objects so convert into double for not loosing data
					 result=ele;		// double to int conversion leads to data loss
			 }
		 }
		 return result;
	}
	
	public static void main(String[] args) 
	{
		Integer[] arr1= {88,22,33,44,55};
		Integer min=findmin(arr1);
		System.out.println("minimum value is :" + min);
		
		Double[] arr2= {1.1,2.2,3.3,4.4,5.5};
		Double min1=findmin(arr2);
		System.out.println("minimum value is :" + min1);
		
	}

	

}
