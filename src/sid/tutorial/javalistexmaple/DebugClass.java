package sid.tutorial.javalistexmaple;

public class DebugClass {
	
	public static void main(String [] args) {
		MakeTheNumbersMatch();
		
	}
	
	public static  void MakeTheNumbersMatch()
    {  int a=-5;int b=6;int x=-1;int y=2;
		// here the bug is that both the conditions should satisfy to the loop to trigger though if 
    //one value reaches the point other will still hold the wrong value
        while(a!=x || b!=y)
        {
            if(a> x)
            {
                a--;
                System.out.println("a>x loop"+a);
            }
            else if(a< x)
            {
                a++;
                System.out.println("a<x loop"+a);
            }
            if(b>y)
            {
                b--;
                System.out.println("b>x loop"+b);
            }
            else if (b<y)
            {
                b++;
                System.out.println("b<x loop"+b);
            }
        }
        
        System.out.println("a--"+a+"b--"+b);
    }
	

}
