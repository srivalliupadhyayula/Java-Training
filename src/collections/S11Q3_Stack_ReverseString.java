package collections;

public class S11Q3_Stack_ReverseString {
	int size; 
    int top; 
    char[] a;  
  
    //function to check if stack is empty 
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
      
    S11Q3_Stack_ReverseString(int n) 
    { 
        top = -1; 
        size = n; 
        a = new char[size]; 
    } 
  
    //function to push element in Stack 
    boolean push(char x) 
    { 
        if (top >= size) 
        { 
        System.out.println("Stack Overflow"); 
        return false; 
        } 
        else
        { 
            a[++top] = x; 
            return true; 
        } 
    } 
  
    //function to pop element from stack 
    char pop() 
    { 
        if (top < 0) 
        { 
        System.out.println("Stack Underflow"); 
        return 0; 
        } 
        else
        { 
            char x = a[top--]; 
            return x; 
        } 
    } 
	
    //function to reverse the string 
    public static void reverse(StringBuffer str) 
    { 
        // Create a stack of capacity  
        // equal to length of string 
        int n = str.length(); 
        S11Q3_Stack_ReverseString obj = new S11Q3_Stack_ReverseString(n); 
          
        // Push all characters of string  
        // to stack 
        int i; 
        for (i = 0; i < n; i++) 
        obj.push(str.charAt(i)); 
      
        // Pop all characters of string  
        // and put them back to str 
        for (i = 0; i < n; i++) 
        {  
            char ch = obj.pop(); 
            str.setCharAt(i,ch); 
        } 
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	//create a new string 
      
	}

}
