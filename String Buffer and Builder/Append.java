class Append 
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("Hello");
		StringBuilder sc=sb;
		sb.append("Java");
		System.out.println(sb);
		System.out.println(sc);
	}
}
