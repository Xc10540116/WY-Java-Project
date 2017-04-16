package 第4章.课件;

public class MP3 extends Item {
	private String songwriters;	// 作词者
	private String tunesmith;	// 作曲者
	private String singer;		// 歌手
	private int bitrate;		// 比特率
	private String album;		// 唱片集
	private double size;		// 歌曲大小
	
	public MP3(String title, int playingTime, boolean gotIt, String comment,
			String songwriters, String tunesmith, String singer, int bitrate,
			String album, double size) {
		super(title, playingTime, gotIt, comment);
		this.songwriters = songwriters;
		this.tunesmith = tunesmith;
		this.singer = singer;
		this.bitrate = bitrate;
		this.album = album;
		this.size = size;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("歌曲名: " + super.getTitle());
		System.out.print(", 作词者为：" + songwriters);
		System.out.print(", 作曲者为:" + tunesmith);
		System.out.print(", 歌手是:" + singer);
		System.out.print(", 比特率:" + bitrate + "kbps");
		System.out.print(", 属于唱片集:" + album);
		System.out.print(", 歌曲大小:" + size);
		System.out.print(", 歌曲时长:" + super.getPlayingTime());
		System.out.print(", 能否复制:" + super.isGotIt());
		System.out.print(", 介绍:" + super.getComment());
		System.out.println();
	}
	
}
