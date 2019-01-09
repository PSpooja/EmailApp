package emailApp;

public class Main {

	public static void main(String[] args) {
		Email em1 = new Email("john","smith");
		
		em1.setaltEmail("j@ohn");
		System.out.println("alternative Email is :" + em1.getaltEmail());
		System.out.println(em1.showInfo());

	}

}
