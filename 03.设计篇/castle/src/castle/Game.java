package castle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
	private Room currentRoom;
	private Map<String, Handler> handlers = new HashMap<String, Handler>();
	
	public Game(){
		handlers.put("go", new Handler() {
			@Override
			public boolean isBye() {return false;}
			@Override
			public void doCmd(String word) {
				goRoom(word);
			}
		});
		handlers.put("help", new Handler() {			
			@Override
			public boolean isBye() {return false;}			
			@Override
			public void doCmd(String word) {
				System.out.println();
				System.out.println("迷路了吗？你可以做的命令有：");
				System.out.println("go   —— 前往下个地点。如：go east");
				System.out.println("help —— 获取帮助");
		        System.out.println("bye  —— 结束游戏");
			}
		});
		handlers.put("bye", new Handler() {
			@Override
			public boolean isBye() {return true;}		
			@Override
			public void doCmd(String word) {
		        System.out.println("感谢您的光临。再见！");
		    }
		});
		createRooms();
	}
	
	private void createRooms() {
		// 制造房间
		Room outside = new Room("城堡外");
		Room lobby = new Room("大堂");
		Room pub = new Room("小酒吧");
		Room reception = new Room("会客厅");
		Room garden = new Room("花园");
		Room hall = new Room("大厅");
		Room bedroom = new Room("卧室");
		Room odeum = new Room("音乐厅");
		
		// 初始化房间出入口
		outside.setExit("north", lobby);
		lobby.setExit("north", garden);
		lobby.setExit("east", pub);
		lobby.setExit("south", outside);
		lobby.setExit("west", reception);
		pub.setExit("west", lobby);
		pub.setExit("north", garden);
		reception.setExit("east", lobby);
		reception.setExit("north", garden);
		garden.setExit("south", lobby);
		garden.setExit("east", pub);
		garden.setExit("west", reception);
		lobby.setExit("up", hall);
		hall.setExit("down", lobby);
		hall.setExit("west", bedroom);
		hall.setExit("east", odeum);
		bedroom.setExit("east", hall);
		odeum.setExit("west", hall);
		
		// 从城堡外开始
		currentRoom = outside;
	}

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        showPrompt();
    }
    
    public void run() {
    	printWelcome();
		play();
    }
    
    // 以下为用户命令
    
    public void goRoom(String direction) {
    	Room nextRoom = currentRoom.getExit(direction);
    	
    	if(nextRoom == null) {
    		System.out.println("那里没有门！");
    	} else {
    		currentRoom = nextRoom;
    		showPrompt();
    	}
    }
    
    public void showPrompt() {
    	System.out.println("你在" + currentRoom);
    	System.out.print("出口有：");
        System.out.println(currentRoom.getExitDesc());
        System.out.println();
    }
    
    public void play() {
    	Scanner scanner = new Scanner(System.in);
    	while(true) {
    		String line = scanner.nextLine();
    		String[] words = line.split(" ");
    		Handler handler = handlers.get(words[0]);
    		String value = "";
    		if(words.length > 1)
    			value = words[1];
    		if(handler != null) {
    			handler.doCmd(value);
    			if(handler.isBye())
    				break;
    		}
    	}
    	scanner.close();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.run();
	}

}
