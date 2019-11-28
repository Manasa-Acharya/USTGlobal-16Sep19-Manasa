
public class TestH {
	public static void main(String[] args) {
		FirstGen f= new FirstGen();
		f.mgs();
		f.call();
		System.out.println("***************************");

		SecondGen sc= new SecondGen();
		sc.mgs();
		sc.call();
		sc.games();
		System.out.println("***************************");


		ThirdGen th= new ThirdGen();
		th.mgs();
		th.call();
		th.games();
		th.camera();
		System.out.println("***************************");
	}

}
