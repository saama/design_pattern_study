package Observer;

public interface Observable {
	void regist(Observer o);
	void unregist(Observer o);
	void announce();
}
