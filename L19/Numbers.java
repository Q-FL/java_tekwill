import java.lang.IllegalArgumentException;
public class Numbers {
	int n;
	Numbers(int n){this.n = n;}
	public double divideBy(int i){
		try{
			return n / i;
		}
		catch (ArithmeticException e) {
			throw new IllegalArgumentException();
		}
	}
}