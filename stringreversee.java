package reverse;

import java.util.Scanner;

public class stringreversee {

	public static void main(String[] args) {
		 {
	
				Scanner s=new Scanner(System.in);
				String a=s.nextLine();
	
				StringBuffer n=new StringBuffer(a);
				StringBuffer k=new StringBuffer();
				char c []=a.toCharArray();
				char v[]={'a','e','i','o','u'};
				for(int i=0;i<c.length;i++)
				{
					for(int j=0;j<v.length;j++)
					{
					if(c[i]==v[j])
					{
						k=n.deleteCharAt(i);
					}
					}
				}
				System.out.println(k.reverse());
				
			}

		}	
	}

