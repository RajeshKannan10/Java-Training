package arrayMethods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayiteratingMethods {

	int[] Numarray = new int[] { 2, 4, 6, 8, 10 };
	int[] numarray2 = new int[] { 2, 4, 6, 8, 10 };
	String[] object;
	String[] names = new String[] { "rajesh", "vimal", "murali" };

	public void firstLastElement() {

		System.out.println("First Index of Element: " + Numarray[0]);
		System.out.println("Last Index of Element: " + Numarray[Numarray.length - 1]);
	}

	public void randomvalue() {

		int anyValue = Numarray[new Random().nextInt(Numarray.length)];
		System.out.println("Randomvalue:" + anyValue);
	}

	public void appendtoarray() {
		int[] newArray = Arrays.copyOf(Numarray, Numarray.length + 1);
		newArray = ArrayUtils.add(Numarray, 88);
		for (int append : newArray) {
			System.out.println(append);
		}
	}

	public void insertelement() {
		int[] largerArray = ArrayUtils.insert(2, Numarray, 77);
		for (int insert : largerArray) {
			System.out.println(insert);
		}
	}

	public void comparetwoarray() {
		boolean areEqual = Arrays.equals(Numarray, numarray2);
		System.out.println(areEqual);
	}

	public void arrayisempty() {
		boolean isEmpty = ArrayUtils.isEmpty(object);
		System.out.println(isEmpty);
	}

	public void shuffleelement() {
		ArrayUtils.shuffle(Numarray);
		for (int shuffle : Numarray) {
			System.out.println(shuffle);
		}
	}

	public void Boxunboxarray() {
		// int [] numarray = new int []{2,4,6,8,10};

		Integer[] list = ArrayUtils.toObject(Numarray); // boxing-wrapping
		int[] Numarray = ArrayUtils.toPrimitive(list); // unboxing
		for (int box : Numarray) {
			System.out.println(box);
		}
	}

	public void removeduplicate() {

		Integer[] list = { 2, 4, 6, 4, 10, 2 };
		// Remove duplicates
		Set<Integer> setlist = new HashSet<Integer>(Arrays.asList(list));
		setlist.toArray(new Integer[setlist.size()]);
		System.out.println(setlist);
	}

	public void printarray() {

		String AsString = ArrayUtils.toString(Numarray);
		System.out.println(AsString);

		System.out.println("------------");

		for (int print : Numarray) {
			System.out.println(print);
		}
	}

	public void filter() {

		int[] Num = new int[] { 2, 3, 4, 5, 6, 9, 10 };
		int[] evenArray = Arrays.stream(Num).filter(value -> value % 2 == 0).toArray();
		for (int Fvalue : evenArray) {
			System.out.println(Fvalue);
		}

	}

	public void MaptoanotherType() {
		
		int[] num = new int [] {2,4,6,8,10};
		System.out.println(num.getClass().getSimpleName());
		String map = Arrays.toString(num);
		
		String[] mapping = null;
		String[] str = ArrayUtils.addAll(mapping, map);
		System.out.println(str.getClass().getSimpleName());
		for (String string : str) {
			System.out.println(string);
		}
		
		List<String> str1 = Arrays.asList(map);
		System.out.println(str1.getClass().getSimpleName());
		for (String string : str1) {
			System.out.println(string);
		}

		String[] stringArray = Arrays.stream(Numarray).mapToObj(value -> String.format("Value: %s", value))
				.toArray(String[]::new);
		
		for (String maping : stringArray) {
			System.out.println(maping);
		}
	}

	public void removefirst() {

		int[] val = (ArrayUtils.remove(Numarray, 2));
		System.out.println(Arrays.toString(val));
	}

}
