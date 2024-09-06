public class Main {
	public static void main (String[] args) {
		int successCount = 0;
		for (int i = 0; i < 10000; i++) {
			Stick s = new Stick(2);
			if (s.canMakeShape()) successCount++;
		}
		System.out.println((double) successCount / 10000);
	}
}
