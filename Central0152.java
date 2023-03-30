/*sofia amanda*/
/*13020210152*/

interface A{ public void aaa(); }
interface B extends A{
}
class Central0152 implement B{
	public void aaa(){
		System.out.println("aaa");
	}
	public static void main(String[]) {
		Central0152 this = new Central0152();
		System.out.println("main");
		this.aaa();
	}
}