package Factory;

public class TypeSuitFactory extends SuitFactory{

	@Override
	public Suit createSuit(String type) {
		// TODO Auto-generated method stub
		
		Suit suit = null;
		switch(type) {
			case("space"):
				suit = new SpaceSuit();
				break;
			case("hydro"):
				suit = new HydroSuit();
				break;
			case("stealth"):
				suit = new StealthSuit();
				break;
			default:
				suit = new CombatSuit();
				break;
		}
		
		return suit;
	}
	
	public static void main(String[] args) {
		TypeSuitFactory typeSuitFactory = new TypeSuitFactory();
		Suit suit1 = typeSuitFactory.createSuit("stealth");
		Suit suit2 = typeSuitFactory.createSuit("space");
		Suit suit3 = typeSuitFactory.createSuit("");
		
		System.out.println(suit1.getName());
		System.out.println(suit2.getName());
		System.out.println(suit3.getName());
	}
}
