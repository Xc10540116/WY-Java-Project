package 第4章.课件;

import java.util.ArrayList;

public class Database {

//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
//	public void add(CD cd) {
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd){
//		listDVD.add(dvd);
//	}
	
	public void add(Item item) {
		listItem.add(item);
	}
	
	public void list() {
//		for(CD cd : listCD) {
//			cd.print();
//		}
//		for(DVD dvd : listDVD) {
//			dvd.print();
//		}
		for(Item item : listItem) {
			item.print();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("abc", "abc", 4, 60,
			"..."));
		db.add(new CD("def", "def", 4, 60,
				"..."));
		db.add(new DVD("xxx", "aaa", 60, "..."));
		db.add(new VideoGame("ddd", 10, true, "...", 4));
		db.add(new MP3("依恋", 3, true, "", "张乐声",
				"G. Salesses/J.F. Porry", "蔡淳佳", 320,
				"华纳新声 Vol.1", 8.91));
		db.list();
	}

}
