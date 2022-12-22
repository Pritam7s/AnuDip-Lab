package oops;

class Team{
	public void dev()
	{
		System.out.println("Developer Team.");
	}
}

class Frontend extends Team{
	public void frontDev()
	{
		System.out.println("Front end Develpoer.");
	}
}

class Backend extends Team{
	public void backDev()
	{
		System.out.println("Back end Developer. ");
	}
}
public class Hierarchical_inheritance {

	public static void main(String[] args) {
		Frontend fe = new Frontend();
		Backend be = new Backend();
		fe.frontDev();
		fe.dev();
		be.backDev();
		be.dev();
	}

}
