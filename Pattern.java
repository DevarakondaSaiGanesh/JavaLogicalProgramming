public class Pattern
{

     
//Add main method here
 public static void main(String[] args) 
    {
//Declare variable n and initialize value as 5

       int n=5;
 
         
        System.out.println("Here is your pattern....!!!");
      
        //Check whether the i and j are equal or not using for loop 
      
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
              
            //If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero
                
                if((i+j)%2 == 0)
                {
                  
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
          System.out.println();
          }
    
      }
}
