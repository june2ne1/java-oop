package encapsule;

public class Card {
	//멤버필드
	private String kind; //카드무늬 (스페이드, 다이아, 하트, 클럽)
	private int number; //카드의 넘버 (1~13)
	private String name;
	static int WIDTH = 100; //카드의 너비
	static int HEIGHT =180; //카드의 높이
	public String getKind() {
		return kind;
	}
	
	
	public Card() {
		this.kind = "하트";
		this.number =(int) ((Math.random()*13)+1);
	}
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	public void setKind() {
		this.kind = "하트";
	}
	public void setNumber(int number) {
		this.number =(int) ((Math.random()*13)+1);
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	}
	//멤버메소드
	

