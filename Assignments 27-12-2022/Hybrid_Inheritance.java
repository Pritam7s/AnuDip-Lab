package abstractions;

class School{
	void result() {
		System.out.println("Result of School.");
	}
}

class Secondary extends School{
	void result1() {
		System.out.println("Result of Secondary Exam..");
	}
}

interface Hs {
	void result2();
}

class Graduation extends Secondary implements Hs{

	@Override
	public void result2() {
		System.out.println("Result of HS Exam...");
	}
	void ug() {
		System.out.println("U need Both Secondary and HS Results!!!");
	}

}
public class Hybrid_Inheritance {

	public static void main(String[] args) {
		Graduation pg = new Graduation();
		pg.result();
		pg.result1();
		System.out.println();
		pg.result2();
		pg.ug();
	}

}
