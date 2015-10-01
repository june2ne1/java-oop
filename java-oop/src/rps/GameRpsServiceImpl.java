package rps;
//서비스 구현 객체
public class GameRpsServiceImpl implements GameRpsService{
//
	GameRps game = new GameRps();
	@Override
	public String getResult(int result) {
		// TODO Auto-generated method stub
		return null;
	}
//두값을 받아서 가위,바위,보 승부
	@Override
	public String playGame(int a, int b) {
		int c = 0, win=0;
		if (a==b) {
		return getResult(3);
	}
		c=Math.abs(a-b);
		switch (c) {
		case 1:win = (a>b) ? a :b;break;
		case 2:win = (a>b) ? b :a;break;
		default:
			break;
		}
		String winner =(win ==a) ? "당신" :"컴퓨터";
		game.setRpsVal(a);
		String userRPS = game.getRpsVal();
		game.setRpsVal(b);
		String comRPS = game.getRpsVal();
		return "컴퓨터는 "+comRPS+"이고, 당신은"+userRPS+"이므로"+
				winner+"이(가) 이겼습니다.";
 }
}                                                                                                                          