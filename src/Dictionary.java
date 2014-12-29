import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Dictionary {
	public static void main(String[]args) throws FileNotFoundException
	{
		getrandomword();
	}

	public static String getrandomword() throws FileNotFoundException {
		List<String> dictionary = new ArrayList<String>();    
		Scanner fileScanner = new Scanner(new File("wordsEn.txt"));

		while (fileScanner.hasNext()){
		   dictionary.add(fileScanner.next());
		}

		int randomindex= new Random().nextInt(109582);
		return (dictionary.get(randomindex));
	}
}
