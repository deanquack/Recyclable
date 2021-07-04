/**
 * @author Dean Quach
 * @date April 9, 2019
 * @class CS108 4PM SECTION
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class RecycleDemo {
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Bottle fanta = new Bottle("Fanta", "Plastic", 0.58, 1.25);
		Bottle water = new Bottle("Arrowhead", "Plastic", 0.58, 1.04);
		Cans corn = new Cans("Green Giant", "Aluminium", 1.60, 0.93);
		Cans tuna = new Cans("Bumble Bee", "Aluminium", 1.60, 0.38);
		
		ArrayList <Recyclable> recycle = new ArrayList<Recyclable>();
		recycle.add(fanta);
		recycle.add(water);
		recycle.add(corn);
		recycle.add(tuna);

		createSpreadSheet(recycle);
		System.out.println("File created");
	}
	/**
	 * 
	 * @param recycle the ArrayList that is passed from the objects
	 * @throws FileNotFoundException
	 */
	public static void createSpreadSheet(ArrayList<Recyclable> recycle) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("recycle.csv", true);
		PrintWriter excel = new PrintWriter(fos);
		excel.println("Name, Material, Weight, Recycle Amount");
		
		for(int i = 0; i < recycle.size(); i++) {
			Recyclable temp = recycle.get(i);
			excel.println(temp.getName() + ", " + temp.getMaterialType() + ", " + temp.getWeight() + "," + temp.recycle());
		}
		
		int sum = 0;
		
		excel.println("Total,,,=SUM(D2..D5)");
		
		excel.close();
	}	

}
