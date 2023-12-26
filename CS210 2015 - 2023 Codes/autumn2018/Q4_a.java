package autumn2018;

public class Q4_a {	
	public static void main(String[] args){ 
        System.out.println(compute(100)); 
    } 
     
    public static int compute(int number){ 
        if(number<20){ 
            return number%7; 
        } 
        
        System.out.println("Running..."); 
        return (compute((number*2)%53)+17); 
    } 
}
