
import java.util.Comparator;


public class HouseComparator implements Comparator<House>{

	@Override
	public int compare(House h1, House h2) {
		// TODO Auto-generated method stub
		if(h1.getId()>h2.getId()) {
			return 1;
		}
		else if(h1.getId()<h2.getId()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
