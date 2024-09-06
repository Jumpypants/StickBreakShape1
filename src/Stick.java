import java.util.ArrayList;
import java.util.Comparator;

public class Stick {
	private ArrayList<Double> lengths = new ArrayList<Double>();
	public Stick (int numBreaks) {
		ArrayList<Double> breaks = new ArrayList<Double>();
		for (int i = 0; i < numBreaks; i++) {
			breaks.add(findBreakPoint());
		}

		breaks.sort(Comparator.naturalOrder());
		breaks.add(1.0);

		double prevBreak = 0;
		for (int i = 0; i < numBreaks; i++) {
			lengths.add(breaks.get(i) - prevBreak);
			prevBreak = breaks.get(i);
		}
	}

	public boolean canMakeShape () {
		for (double length : lengths) {
			if (length >= 0.5) return false;
		}
		return true;
	}

	private Double findBreakPoint() {
		return Math.random();
	}
}
