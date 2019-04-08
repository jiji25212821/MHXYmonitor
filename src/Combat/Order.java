package Combat;

enum OrderType {
	Attack, //1
	Skill, //2
	Object, //3
	Defence, //4
	Summon, //5
	SummonBack, //6
	Flee, //7
	trump, //8
}

public class Order {
	private OrderType orderId;
	
	private int targetMemberId;
	
	private int skillId;
	
	public OrderType getOrderId() {
		return orderId;
	}
	
	public int getTargetMemberId() {
		return targetMemberId;
	}
	
	public Order() {
		
	}
}
