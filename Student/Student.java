class Student
{
  static int roll;
  static String name;

   void insertStudent(int r,String n)
	{
	  roll=r;
	  name=n;
    }
  void displayStudent()
    {
	  System.out.println("roll_no="+roll);
	  System.out.println("name="+name);
    }
  int marks(int a,int b)
	{
	  int c=a+b;
	  return c;
    }
  
  public static void main( String[] args )
	{
     Student obj1=new Student();
	 Student obj2=new Student();
	 obj1.insertStudent(1,"JAHID");
     obj2.insertStudent(2,"CHAHAT");
	 obj1.displayStudent();
	 obj2.displayStudent();
	 int m1=obj1.marks(50,40);
	 int m2=obj2.marks(60,20);
	 System.out.println(m1);
     System.out.println(m2);
	}

}