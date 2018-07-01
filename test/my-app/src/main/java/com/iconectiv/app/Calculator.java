package com.iconectiv.app;


public class Calculator
{
    private int solution;
    private int x;
    private int y;


    public Calculator()
    {
        solution = 0;
       
    }

    public int add(int x, int y)
    {
       return x + y;
    }
    public int subtract(int x, int y)
    {
       return x - y;
    }
    public int multiply(int x, int y)
    {    
       return x * y;
    }
    public double divide(int x, int y)
    {
    	if (y ==0) {
    		return 0.0;
    	}
       solution = x / y;
       return solution;
    }

    public void calc(int ops){
        x = 4; 
        System.out.println("operand 2: "); 
        y = 5; 

        switch(ops) 
        { 
            case(1): 
              System.out.println(add(x, y)); 

          //    operands.next(); 
              break; 
            case(2): 
                System.out.println(subtract(x, y)); 
             // operands.next(); 
              break; 
            case(3): 
                System.out.println(multiply(x, y)); 
            //  operands.next(); 
              break; 
            case(4): 
                System.out.println(divide(x, y));
            //  operands.next(); 
              break; 
         } 
   }
}
         