
public class Program {
	public static void main(String[] args) {
		task1();
		task2();
	}

	static void task1(){
		try {
			int [] arr1 = new GenerateArray().generateArray();
			int [] arr2 = new GenerateArray().generateArray();
			int [] result = new ProcessArray().arraysDifference(arr1, arr2);
			for (int a1 : arr1) System.out.printf("%d\t", a1);
			System.out.println();
			for (int a2 : arr2) System.out.printf("%d\t", a2);
			System.out.println();
			System.out.println("Разница элементов двух массивов равна:");
			for (int i : result) System.out.printf("%d\t", i);
		} catch (ProcessArray.CustomArraySizeException e) {
			System.out.println(e.getMessage());
			System.out.printf(
					"Длина первого массива: %d\nДлина второго массива: %d\n",
					e.getLength1(), e.getLength2());
		}
	}

	static void task2(){
		try {
			int [] arr1 = new GenerateArray().generateArray();
			int [] arr2 = new GenerateArray().generateArray();
			int [] result = new ProcessArray().arraysDivide(arr1, arr2);
			for (int a1 : arr1) System.out.printf("%d\t", a1);
			System.out.println();
			for (int a2 : arr2) System.out.printf("%d\t", a2);
			System.out.println();
			System.out.println("Частное элементов двух массивов равна:");
			for (int i : result) System.out.printf("%d\t", i);
		} catch (ProcessArray.CustomArraySizeException e) {
			System.out.println(e.getMessage());
			System.out.printf(
					"Длина первого массива: %d\nДлина второго массива: %d\n",
					e.getLength1(), e.getLength2());
		} catch (ProcessArray.CustomDivideException e) {
			System.out.println(e.getMessage());
			System.out.printf("Элемент по индексу %d равен нулю", e.getElement());
		}
	}
}
