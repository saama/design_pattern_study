package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable{
	
	List<Observer> observerList = new ArrayList<>();

	@Override
	public void regist(Observer o) {
		// TODO Auto-generated method stub
		observerList.add(o);
	}

	@Override
	public void unregist(Observer o) {
		// TODO Auto-generated method stub
		observerList.remove(o);
	}

	@Override
	public void announce() {
		// TODO Auto-generated method stub
		observerList.forEach(item->item.update());
	}

}
