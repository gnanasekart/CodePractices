package SingletonPattern;

public class MainENUM {

	public static void main(String[] args) {
		SingletonEnum.INSTANCE.setCounter(10);
		System.out.println(SingletonEnum.INSTANCE.getCounter());

	}

}
