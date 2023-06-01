
public class duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Lakshmii";
		int count;
		char[] ch = name.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			count=1;
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					ch[j]='0';
				}
			}
			if(count >= 1 && ch[i] != '0')
			{
				System.out.println(ch[i] +"-"+count);
			}
		}

	}

}
