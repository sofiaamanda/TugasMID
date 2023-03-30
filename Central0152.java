/*sofia amanda*/
/*13020210152*/

interface A{ public void aaa(); }
interface B extends A{ public void aaa();
}
class Central0152 implements A, B{
	public void aaa()
{
		System.out.println("aaa");
	}
	public static void main(String arg[]) {
		System.out.println("main");
		Central0152 obj = new Central0152();
		obj.aaa();
	}
}