import static Output.SysOut.*;
import Output.SysOut;
class Temp1
{
   public static void main(String... args)
   {
     d.show(10); // No need to add SysOut because SysOut is statically imported.
     SysOut obj=new SysOut(); // Here object of SysOut is created beacuse SysOut is imported.
     obj.msgSysOut();
   }
}