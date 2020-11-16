package Project1;
import java.util.ArrayList;
import java.util.Collections;

public class Trio<T extends Comparable<? super T>> {
	private T item1;
	private T item2;
	private T item3;
	public Trio(T item1, T item2, T item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	public Trio(T singleitem) {
		this(singleitem, singleitem, singleitem);
	}
	public T getItem1() {
		return item1;
	}
	public T getItem2() {
		return item2;
	}
	public T getItem3() {
		return item3;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	public void setItem3(T item3) {
		this.item3 = item3;
	}
	@Override
	public String toString() {
		return item1 + " is a first item. " + item2 + " is a second item. And " + item3 + " is a third item";
	}
	public void reset(T item) {
		item1 = item;
		item2 = item;
		item3 = item;
	}
	public int count(T itemToCount) {
		int count = 0;
		if(item1.equals(itemToCount)) {
			count++;
			}
		if(item2.equals(itemToCount)) {
			count++;
			}
		if(item3.equals(itemToCount)) {
			count++;
			}
		return count;
	}
	public boolean hasDuplicates() {
		return item1.equals(item2)||item1.equals(item3)||item2.equals(item3);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Trio<?>) {
			Trio<?> OtherTrio = (Trio<?>)obj;
			ArrayList<T> box1 = new ArrayList<T>();
			box1.add(this.item1);
			box1.add(this.item2);
			box1.add(this.item3);
			Collections.sort(box1);
			
			ArrayList<T> box2 = new ArrayList<T>();
			box2.add((T) OtherTrio.getItem1());
			box2.add((T) OtherTrio.getItem2());
			box2.add((T) OtherTrio.getItem3());
			Collections.sort(box2);
			
			return box1.get(0).equals(box2.get(0))&&box1.get(1).equals(box2.get(1))&&box1.get(2).equals(box2.get(2));


		}
		return false;
	}
	
}
