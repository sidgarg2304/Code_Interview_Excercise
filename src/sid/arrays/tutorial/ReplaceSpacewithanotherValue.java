/**
 * 
 */
package sid.arrays.tutorial;

/**
 * @author siddgarg
 *
 */
public class ReplaceSpacewithanotherValue {
	
	public void replaceString() {
		String str1="test test1 sid  ";
		String replaceString="%20";
		int spacecount=0;
		
		
		
		
		char [] str1char=str1.toCharArray();
		char [] replacestring=replaceString.toCharArray();
		for (int i=0;i<str1.length();i++)
		{
			if(str1char[i]==' ') {
				spacecount++;
			}
			
		}
		
		//int first = str1.indexOf(" ");
		//System.out.println("First index of space"+first);
		String str3=str1.replaceAll(" ", "%20");
		System.out.println("String 3"+ str3);
		for(int i=0;i<spacecount;i++){
			int first = str1.indexOf(" ");
			str1 = str1.substring(0,first) + "%20" + str1.substring(first+1);
		}
		
		System.out.println("Final string"+ str1);
		int newLength= str1.length()+spacecount*2;
		
		System.out.println(" old lenght"+ str1.length()+"New lenght"+ newLength+"repace staring legh"+ replaceString.length());	
		
		System.out.println(" Space count"+ spacecount);	
		
		
		str1.replace("", "%20");
		System.out.println("Replaced string"+ str1);
	}

}
