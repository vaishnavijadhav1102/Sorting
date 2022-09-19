
public class BubbleSort {
	public static void main(String[] args) {  
        int a[] ={3,6,5,2,45,32,5,72,34,12,31};  
		int n = a.length;  
	    int temp = 0;  
	     for(int i=0; i < n; i++){  
	             for(int j=1; j < (n-i); j++){  
	                      if(a[j-1] > a[j]){  
	                             //swap elements  
	                             temp = a[j-1];  
	                             a[j-1] = a[j];  
	                             a[j] = temp;  
                     }  
                      
             }  
     } 
         for(int i=0; i < a.length; i++){  
                 System.out.print(a[i] + " ");  
         }  

}
}
