package BasicString.programs;

//WAP to reverse a string 
//converting string to charAt()
public class ReverseString1 {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		String s1 = new String();
		System.out.println("Enter the String : ");
		s1 = input.nextLine();
		System.out.println("Input: " + s1)*/;
		
		String input="JavaCoding";
	
		//convert string to character array by using toCharArray()
		char[] reverse=input.toCharArray();
		
		//create for loop to reverse
		for(int i=reverse.length-1; i>=0;i--){
			System.out.print(reverse[i]);
		}

	}

}

/*
 * output:- gnidoCavaJ
 */
