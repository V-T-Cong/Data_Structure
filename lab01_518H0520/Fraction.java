
public class Fraction {
	private int numer = 0;
    private int denom = 1;

	public Fraction() {}

	public Fraction(int x, int y) {
		this.numer = x;
		this.numer = y;
	}

	public Fraction(Fraction f) {
		this.numer = f.numer;
        this.denom = f.denom;
	}

	@Override
	public String toString() {
        if (denom == 1) {
            return Integer.toString(numer);
        } else {
            return numer + "/" + denom;
        }
	}
}