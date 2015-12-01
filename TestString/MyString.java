package MyString;
public class MyString
{
	String str; // Data Member

    // Constructor
	public MyString() {}
	public MyString(String str)
	{
		this.str=str;
	}

	// charAt
	public char MyCharAt(int index) 
	{
		if(str.isEmpty())
		{
			System.out.println("String is empty");
			System.exit(0);
        }
		if(index>=str.length())
        {
			System.out.println("Index out f Range");
			System.exit(0);
		}
		char[] ch=str.toCharArray();
        return ch[index];
	}

    // toUpperCase
	public MyString MyToUpperCase()
	{
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
			if( ch[i]>96 && ch[i]<125 )
			    ch[i]-=32;
		return (new MyString(new String(ch)) );
	}

	// toLowerCase  ............ Remaining

	// MyPrint method()
	public static void MyPrint(MyString str1)
	{
		System.out.print(str1.str);
	}

   // MyPrintln method()
	public static void MyPrintln(MyString str1)
	{
		System.out.println(str1.str);
	}

	// MyStartsWith
	public boolean MyStartsWith(String str)
	{
		if(str.isEmpty())
			System.exit(0);
	    int i=0;  
		for( ; i<str.length() && (this.str).charAt(i)==str.charAt(i) ; i++ ) ;
     		return	( i==str.length() )? true: false;
	}		

	// MyEndsWith
	public boolean MyEndsWith(String str)
	{
		if(str.isEmpty())
			System.exit(0);
        int i=str.length()-1;  
		for(int j=(this.str).length()-1 ; i>=0 && (this.str).charAt(i)==str.charAt(i) ; j--,i-- ) ;
		    return (i==-1)? true: false;
	}	

	// MyContains
	public boolean MyContains(String str)
	{			
		if( (this.str).length() < str.length() | str.isEmpty() )
			System.exit(0);
		int i=0;
		for( ; !( (this.str).substring(i,i+str.length()).equals(str) ) && (i+str.length())<(this.str).length() ; i++ ) ;  
            return ( (i+str.length()) == (this.str).length() ) ? false: true;
	}

    // MyTrim
	public MyString MyTrim()
	{
		int i=0,j=str.length()-1;		
		while( str.charAt(i)==' ' | str.charAt(j)==' ' )
		{
			if( str.charAt(i)==' ')
				i++;
			if( str.charAt(j)==' ')
				j--;
		}
		return ( new MyString( (this.str).substring(i,j+1) ) );
	}	

    // MySubstring  with initial index
	public MyString MySubstring(int x)
	{
		if( x>=str.length() )// OutofBound
			System.exit(0);
        char[] ch=str.toCharArray();
		return ( new MyString(new String(ch,x,ch.length-x)) );
	}		

    // MySubstring with initial and last index
	public MyString MySubstring(int x,int y)
	{
		if( x > y | y >= str.length() )
			System.exit(0);
        char[] ch=str.toCharArray();
        return ( new MyString(new String(ch,x,y-x)) );
	}

	// MyIndexOf char in a String
	public int MyIndexOf(char c)
	{
		int i=0;
		for( ; i<str.length() && !(c==str.charAt(i)) ; i++ ) ;
		    return ( i==str.length() )? -1 : i;
	}

	// MyIndexOf char in a String with index
	public int MyIndexOf(char c,int i)
	{
		if( i>=str.length() ) // Index OutOfBound
			System.exit(0);    
		for( ; i<str.length() && !(c==str.charAt(i)) ; i++ ) ;
		    return ( i==str.length() ) ? -1  : i;
	}

	// MyIndexOf String in a String
	public int MyIndexOf(String str)
	{			
		if( (this.str).length() < str.length() | str.isEmpty() )
			System.exit(0);
		int i=0;
		for( ; !( (this.str).substring(i,i+str.length()).equals(str) ) && (i+str.length())<(this.str).length() ; i++ ) ;
              return( (i+str.length()) == (this.str).length() ) ? -1 : i;
	}

	// MyIndexOf String in a String with index
	public int MyIndexOf(String str,int i)
	{			
		if( (this.str).length() < str.length() | str.isEmpty() )
			System.exit(0);
		for( ; !( (this.str).substring(i,i+str.length()).equals(str) ) && (i+str.length())<(this.str).length() ; i++ ) ;
             return( (i+str.length()) == (this.str).length() )? 1 : i;
	}

   // MyReplace
	public MyString MyReplace(String s,String r) // s=search, r=replace
	{
        if( s.isEmpty() | this.MyOccurance(s)==0 ) // Either Serached String is Empty or not founded
  			System.exit(0);
        int l=0;
		if( s.length() <= r.length() )
			l=str.length()+this.MyOccurance(s)*( r.length()-s.length() );
		else l=str.length()-this.MyOccurance(s)*( s.length()-r.length() );
		char[] ch=new char[l];
		if( s.length() <= r.length() )    // CASE 1 AND 2
		{
            for( int i=str.length()-1,j=ch.length-1; i>=0 ;  )
			{ 	
				if(i>=s.length()-1)	
				{	if( s.equals( str.substring((i-s.length()+1),i+1) ) )
				     {
						for( int k=r.length()-1;k>=0;k-- )
					         ch[j--]=r.charAt(k);        
						     i-=s.length(); 
					 }
                    else  	
                         ch[j--]=str.charAt(i--); 
				}
				else
                      ch[j--]=str.charAt(i--); 
			}			
        }
		else     // CASE 3
		{
		  for( int i=0,j=0; i<str.length() ;  )
		  {
			 if( i<=str.length()-s.length() )
			 {     if( s.equals( str.substring(i,i+s.length()) ) )
				   {
					  for( int k=0;k<r.length();k++ )
						  ch[j++]=r.charAt(k);
					      i+=s.length();
				   }
				   else		
					   ch[j++]=str.charAt(i++);                              
			  }
			  else
				  ch[j++]=str.charAt(i++);
          }
         }
		return ( new MyString(new String(ch,0,l)) );
	}

	// MyOccurance
	public int MyOccurance(String s) // s=search
	{
        if( s.isEmpty() )
			System.exit(0);
		int freq=0;
		for( int i=0; i<=str.length()-s.length(); i++ )
             if( str.substring(i,i+s.length()).equals(s) )
			     freq++;
		return freq;
	}

	// MyRegex
	public MyString[] MyRegex( String regex )
	{		 
		MyString[] str=new MyString[this.MyOccurance(regex)+1];
		int x=0,y=0,z=0,split=0;                   
		for( ; x<=(this.str).length()-regex.length(); x++ )
		{
		
			if( regex.equals( ((this.str).substring(x,x+regex.length()) )) )
			{
				if(x!=y)
				{
					str[z++]=new MyString((this.str).substring(y,x));
					split++;
				}
				y=x+=regex.length()-1; y++;
			}
		}
		if( x!=(this.str).length() )
		{
			str[z++]=new MyString((this.str).substring(y,(this.str).length()));
			split++;
		}			
		MyString[] str1=new MyString[split];
		for( int i=0;i<split;i++)
             str1[i]=str[i];
		return str1;
	}
    
	// MyAppend ...StringBuilder
	public void MyAppend(String apd)
	{
        char[] ch=new char[str.length()+apd.length()];
		for( int i=0,j=0,k=0; i<str.length()+apd.length();i++ )
			ch[i]= (i<str.length())? str.charAt(j++) : apd.charAt(k++);
		str=new String(ch);
	}

	//MyDelete ...StringBulider
	public void MyDelete(int x,int y)
	{
		char[] ch=new char[str.length()];
		for(int i=0,j=0;i<str.length();i++)
			if ( !(i>=x & i<y) )
			    ch[j++]=str.charAt(i);
		str=new String(ch);
	}

	//MyInsert ...StringBuilder
    public void MyInsert(int port,String s)
	{
		//less than 0 
		char[] ch=new char[str.length()+s.length()];
		for(int i=0,j=0,k=0; i<str.length()+s.length(); i++ )
          ch[i]= ( i>=port & i<port+s.length() )? s.charAt(k++) : str.charAt(j++);
        str=new String(ch);
	}

	//MyReverse ...StringBuilder
	public void MyReverse()
	{
		this.MyReverse(0,str.length()-1 );
	}

	//MyReverse with initial and final index
	public void MyReverse(int x,int y)
	{
        char[] ch=str.toCharArray();
		for( ; x<y ; x++,y-- )
		{
			char c=ch[x];
			ch[x]=ch[y];
			ch[y]=c;
		}
		str=new String(ch);
		System.out.println(str);
	}

	//MyReplace ...StingBuilder
	public void MyReplace(int x,int y,String s)
	{
       if(x>0 | y>x)
		   System.exit(0);
	   char[] ch=new char[str.length()+s.length()];
	   for(int i=0,j=0; i<str.length();  )
		{
		   if(j==x)
		    {
		      for( int k=0; k<s.length() ;k++ ) 
		    	  ch[j++]=s.charAt(k);
			  i=y;
			}
	       else
               ch[j++]=str.charAt(i++);
		}
		   str=new String(ch);
	}

	// MyReverseWord 
    public void MyReverseWord()
	{
		for( int i=0,x=0,y=0; i<=str.length(); i++ )
              if( i==str.length() || str.charAt(i)==' '  )
		       {
			       this.MyReverse(x,y);
				   y=x=i+1;
			   }
		      else
				  y=i;
    }

}
