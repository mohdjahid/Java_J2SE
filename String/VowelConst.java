class VowelConst 
{
	public static void main(String[] args) 
	{
		int vowel=0;
		for(int i=0;i<args[0].length();i++)
			if( args[0].charAt(i)=='A'||args[0].charAt(i)=='E'||args[0].charAt(i)=='I'||args[0].charAt(i)=='O'||args[0].charAt(i)=='U')
	            vowel++;
		char[] ch=new char[args[0].length()];
		for(int i=0,j=0;i<ch.length;i++)
			if( args[0].charAt(i)=='A'||args[0].charAt(i)=='E'||args[0].charAt(i)=='I'||args[0].charAt(i)=='O'||args[0].charAt(i)=='U')
			    ch[j++]=args[0].charAt(i);
		    else
                ch[vowel++]=args[0].charAt(i);
        System.out.println( new String(ch) ); 
	}
}
