package 第4章.课件;

public class VideoGame extends Item {
	private int numberOfPlayers;

	public VideoGame(String title, int playingTime, boolean gotIt,
			String comment, int number) {
		super(title, playingTime, gotIt, comment);
		numberOfPlayers = number;
	}

	@Override
	public void print() {
		System.out.print("VideoGame");
		super.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
