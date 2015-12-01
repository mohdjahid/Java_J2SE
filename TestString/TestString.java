import static MyString.MyString.*; 
import MyString.*;
class TestString 
{
	public static void main(String[] args) 
	{
		MyString s=new MyString("MyString");
		char ch=s.MyCharAt(4);
	//	System.out.println(ch);

		MyString s1=new MyString("abcdFDz");
		MyString s2=s1.MyToUpperCase();
	//	MyPrint(s2);

		MyString s3=new MyString("Today i have realise something");
	//	System.out.println(s3.MyStartsWith("Today "));

	//	System.out.println(s3.MyEndsWith("thing"));

	//  System.out.println( s3.MyContains("some") );

	    MyString s4=new MyString("           We are studying Java   ");
	//	MyPrint( s4.MyTrim() );
    //  System.out.println(".");
        MyString s5=new MyString("ProLOg is best");
	//	MyPrint( s5.MySubstring(5) );
	//	MyPrint( s5.MySubstring(2,6) );

    //  System.out.println( s5.MyIndexOf(' ') );
    //	System.out.println( s5.MyIndexOf(' ',7) );
    //  System.out.println( s5.MyIndexOf("is") );
        MyString s6=new MyString("are areisWe areaarethe best bczareare we are in ProLogare areaare");

    //  System.out.println( s6.MyIndexOf("are",7) );
	     
	    MyString s7=new MyString("My name is Khan");
	//  System.out.println(s6.MyOccurance("were was we"));
	//  MyPrintln( s6.MyReplace("are","isi") );

	    MyString[] str=s6.MyRegex("are");
	//	for( MyString w:str )
	//		MyPrintln(w);

	//  s7.MyAppend("?????");
    //  MyPrint(s7);

	//  s6.MyDelete(1,5);
	//	MyPrintln(s6);
	    
	//	s7.MyInsert(3,"(NAAM)");
	//	MyPrintln(s7);

	//  s7.MyReverse(3,6);
    //	MyPrintln(s7);

	//	s7.MyReverse();
    //	MyPrintln(s7);

    //  s7.MyReverseWord();
    //	MyPrintln(s7);


	//  s7.MyReplace(2,5,"were");
	//	MyPrintln(s7);
	}

}
