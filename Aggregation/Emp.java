class Emp 
{
	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address) 
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}

    void display()
	{
		System.out.println(id+" "+name+" "+address.street+" "+address.city+" "+address.country);
    }

	public static void main(String[] args)
	{
      Address address1=new Address("West Delhi","Delhi","India");
	  Emp e1=new Emp(1,"JAHID",address1);
	  Address address2=new Address("Patna","Bihar","India");
	  Emp e2=new Emp(2,"ADEEB",address1);
	  e1.display();
	  e2.display();
    }

}
