package thursday_9_2;


public class PalindromeCount {
	
	static boolean check(String s)
    {
        int n = s.length();
        s = s.toLowerCase();
        for (int i=0; i<n; i++,n--)
           if (s.charAt(i) != s.charAt(n - 1))
              return false;      
        return true;
    }
	
	
	static int count(String str)
    {       
        str = str + " ";
        String s2 = "";
        int count = 0;
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (ch != ' ')
                s2 = s2 + ch;
            else {
                if (check(s2))
                    count++;
                s2 = "";
            }
        }
        System.out.print("Total Palindrome = ");
        return count;
    }
	
	

	public static void main(String[] args) {
		System.out.println(count("Anna gave me coconut at noon in racecar tournament"));	     
	     
	}

}
