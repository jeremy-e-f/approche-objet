package tri;

import java.util.Comparator;

import entites.Pays;

public class ComparatorHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays arg0, Pays arg1) {
		return ((Integer)arg0.getNbHabitants()).compareTo(arg1.getNbHabitants());
	}

}
