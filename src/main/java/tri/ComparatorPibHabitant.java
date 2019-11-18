package tri;

import java.util.Comparator;

import entites.Pays;

public class ComparatorPibHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays pays1, Pays pays2) {
		return ((Double)pays1.getPibParHabitant()).compareTo(pays2.getPibParHabitant());
	}

}
