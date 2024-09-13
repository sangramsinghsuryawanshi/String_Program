package string.java;
//character in it and return its index. If it doesn't exist, return -1.
//- Example:
//  - Input: "leetcode"
//  - Output: 0
//  - Input: "loveleetcode"
//  - Output: 2

public class ReturnNonRepeatingChar 
{
	public static int is()
	{
		String str="leetcode"
				+ "";
		char ch[]=str.toCharArray();
		int cnt=-1;
		for(int i=0;i<ch.length;i++)
		{
			int c=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
				}
			}
			if(c==0)
			{
				cnt=i;
				break;
			}
		}
		if(cnt>=0)
		{
			return cnt;
		}
		else
		{
			return -1;
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println(is());
	}

}
