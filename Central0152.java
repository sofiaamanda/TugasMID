/*sofia amanda*/
/*13020210152*/

interface A{ public void aaa(); }
interface B extends A{
	public void aaa();
}
class Central0152 implement A,B{
	public void aaa(){
		System.out.println("aaa");
	}
	public static void main(String[]) {
		System.out.println("main");
		this.aaa();
	}
}