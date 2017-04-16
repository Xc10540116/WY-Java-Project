package 第4章.课件;

public class DVD extends Item {
	private String director;

	public DVD(String title, String director, int playingTime, String comment) {
		super(title, playingTime, false, comment);
		this.director = director;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("DVD:");
		super.print();
		System.out.print(director);
	}

}
