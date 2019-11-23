// Results of print should come out as made for getting used to java syntax
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567
// 12345678
// 123456789
// 12345678910
// 12345678910
// 123456789
// 12345678
// 1234567
// 123456
// 12345
// 1234
// 123
// 12
// 1

class Main 
{
  public static void main(String[] args) 
  {

    //Code of Java for loop  
    for(int i=1; i<=10; i++)
    {  
      for(int j = 1; j <= i; j++)
      {
        System.out.print(j); 
      }  
      // Create New Line
      System.out.println("");
    } // End for loop i++
    
    //Code of Java for loop  
    for(int i=10; i>=1; i--)
    {  
      for(int j = 1; j <= i; j++)
      {
        System.out.print(j); 
      }  
      System.out.println("");
    } // end for loop i--
  } // end main(args)
} // end class Main
