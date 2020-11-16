package Project1;

public class test {
	
	public static void main(String[]args) {
		Trio<String> box = new Trio<>("qwe","rty", "asd");
		Trio<String> box2 = new Trio<>("rty","rty", "asd");
		System.out.println(box.hasDuplicates());
		System.out.println(box2.count("qwe"));
		System.out.println("__________");
		System.out.println(box.equals(box2));
		
	}
}
