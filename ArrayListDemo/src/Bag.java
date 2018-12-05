import java.util.ArrayList;

public class Bag {
	private ArrayList<Integer> numbers = new ArrayList<>();

	public void addNumber(int num) {
		numbers.add(num);
	}
	public void replaveValueAt(int index, Integer newValue) {
		numbers.set(index, newValue);
	}
	public void removeNum(int num) {
		boolean removed = numbers.remove(new Integer(num));
		if (removed) {
			System.out.println(num + "Removed!");
		} else
			System.out.println(num + "not removed");
	}
	public int getSize() {
		return numbers.size();
	}
	
	public String toString() {
		String allNumbers = "";
		for(Integer num : numbers) {
			allNumbers += num+ " ";
		}
		return allNumbers;
	}
	public static void main(String[] args) {
		Bag mybag = new Bag();
		mybag.addNumber(20);
		mybag.addNumber(30);
		mybag.addNumber(12);
		mybag.replaveValueAt(0, -11);
		System.out.println(mybag.toString());
		System.out.println(mybag.getSize());
	}
}
