package 第4章.课件;

public class Item {
	private String title;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;

	public Item(String title, int playingTime, boolean gotIt, String comment) {
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}

	public String getTitle() {
		return title;
	}

	public int getPlayingTime() {
		return playingTime;
	}
	public boolean isGotIt() {
		return gotIt;
	}

	public String getComment() {
		return comment;
	}

	public void print() {
		System.out.println(title);
	}

}
