package DATA;

public class Data implements DataTransmission{
	String playerName;
	int money;
	int round = 1;

	// setter von Name
	public void setName(String playerName) {
		this.playerName = playerName;
	}

	// getter von Round
	public int getRound() {
		return round;
	}

	// setter von Round
	public void setRound(int round) {
		this.round = round;
	}

	// getter von Money
	public int getMoney() {
		return money;
	}

	// setter von Money
	public void setMoney(int money) {
		this.money = money;
	}

	// getter von Name
	public String getName() {
		return playerName;
	}
}
