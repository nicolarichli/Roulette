package DATA;

/**
 * @author Nicola Richli, Tobias Meier
 * @version 1.0
 */
public class Data implements DataTransmission{
	String playerName;
	int money;
	int round = 1;

	/**
	 * Setter von Name
	 * @param playerName
	 */
	public void setName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * Getter von Round
	 * @return round
	 */
	public int getRound() {
		return round;
	}

	/**
	 * Setter von Round
	 * @param round
	 */
	public void setRound(int round) {
		this.round = round;
	}

	/**
	 * Getter von Money
	 * @return money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * Setter von Money
	 * @param money
	 */
	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * Getter von Name
	 * @return playerName
	 */
	public String getName() {
		return playerName;
	}
}
