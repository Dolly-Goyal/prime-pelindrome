
public class Main {
	public static void main(String[] args) {
		String tmp;
		for(int g=999; g>=1; g--) { 
			if(isPrime(g)) {
		tmp = Integer.toString(g);
		if(tmp.charAt(0)==tmp.charAt(tmp.length()-1)) {
		System.out.println(g);
		break;
		}
		} 
		}
		}
		
}
