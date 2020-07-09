package Observer;

public class ObserverMain {
	public static void main(String[] args) {
		O1 o1 = new O1();
		O2 o2 = new O2();
		Subject s = new Subject();
		s.regist(o1);
		s.regist(o2);
		s.announce();
		
		s.unregist(o1);
		
		s.announce();
	}
}
