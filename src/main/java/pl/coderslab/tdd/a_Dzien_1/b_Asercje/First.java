package pl.coderslab.tdd.a_Dzien_1.b_Asercje;

public class First {

	public String concatString(String first, String second) {
		return first + second;
	}

	public int multiply(int first, int second) {
		return first * second;
	}

	public void printMessage(String message){
		if(message == null){
			throw new IllegalArgumentException();
		}else{
			System.out.println(message);
		}
	}
	

}
