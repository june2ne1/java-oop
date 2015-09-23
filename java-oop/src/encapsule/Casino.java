package encapsule;

public class Casino {
	private Card player1;
	private Card player2;
	private String winner;
	private String loser;
	
	public Casino(Card player1, Card player2) {
		this.player1 = player1;
		this.player2 = player2;
		
		
		if (player1.getNumber() > player2.getNumber()) {
			this.winner = player1.getName();
			this.loser = player2.getName();
			//this.setWinner(player1.getName());
			//this.setLoser(player2.getName());
			
		} else {
			this.winner = player2.getName();
			this.loser = player1.getName();
			

		}
		
	}

	public Card getPlayer1() {
		return player1;
	}

	public Card getPlayer2() {
		return player2;
	}

	public String getWinner() {
		return winner;
	}

	public String getLoser() {
		return loser;
	}

	public void setPlayer1(Card player1) {
		this.player1 = player1;
	}

	public void setPlayer2(Card player2) {
		this.player2 = player2;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public void setLoser(String loser) {
		this.loser = loser;
	}
	@Override
	public String toString() {
		
		return winner+"가"+loser+"를 이겼습니다.";
	}
	}

