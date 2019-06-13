import java.io.*;
import java.util.*;
public class Prefix
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		String arr[]=new String[m];
		int str=0;
		for(int i=0;i<m;i++)
		{
			arr[i]=input.next();
		}
		int str1=arr[0].length();
		int status=0,count=0,br=0;
		String common="";
		int temp=0;
		for(int i=1;i<m;i++)
		{
		    if(str1>arr[i].length())
		    {
		        str1=arr[i].length();
		    }
		}
		for(int i=0;i<str1;i++)
		{
		   	status=0;
			str=arr[0].charAt(i);
			for(int j=1;j<m;j++)
			{
			
				if(str==arr[j].charAt(i))
				{
					status++;
				}
				else{
				     br=1;
				    break;
				}
				
				if(status==m-1)
				{
					count++;
				}
			}
			if(br==1)
			{
			    break;
			}
		}
		for(int i=0;i<count;i++)
		{
			common=common+arr[0].charAt(i);
		}
		System.out.println(common);
	}
}
		
