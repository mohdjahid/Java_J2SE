// Abiguity beacuse 'd' is present in both SysOut and SysOut1
// If i add SysOut or SysOut1 before the d.show(), as they are statically impoerted, compiler considers them as packages. 
import static Output.SysOut.*;
//import static Output1.SysOut1.*;
class Temp2
{
   public static void main(String... args)
   {
     d.show(); // d is abigious
     SysOut.d.show(); // Error
   }
}