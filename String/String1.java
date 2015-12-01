import static java.lang.System.out;
class String1 
{
	public static void main(String[] args) 
	{
		char ch[]={'p','r','o','l','o','g'};
		String s=new String(ch);  // char to String
		String s1=new String(ch,2,4); // char with index+char to String
		out.println(s);   
		out.println(s1);

		String s2=new String(new byte[] {65,66,67,68,69}); // byte[] to String
		String s3=new String(new byte[] {65,66,67,68,69},1,3); //byte[] with index+bytes to String
		out.println(s2);
		out.println(s3);
	}
}
