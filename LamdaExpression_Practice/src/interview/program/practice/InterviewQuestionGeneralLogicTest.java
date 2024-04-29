package interview.program.practice;

import java.util.Comparator;
import java.util.List;

import required.db.content.MyCollections;

public class InterviewQuestionGeneralLogicTest {

	public static void main(String[] args) {
		
		findLargestNumberInArray();

	}

	private static void findLargestNumberInArray() {
		/*----------------Using lamda Expression------------------  */
		//int max = MyCollections.getUniqueIntegerList().stream().map(num->num).mapToInt(n->n).max().getAsInt();
		//int max = MyCollections.getUniqueIntegerList().stream().sorted(Comparator.reverseOrder()).mapToInt(n->n).max().getAsInt();
		int max = MyCollections.getUniqueIntegerList().stream().sorted(Comparator.reverseOrder()).findFirst().get();
		int min = MyCollections.getUniqueIntegerList().stream().sorted().findFirst().get();
		System.out.println("Highest Number in list: "+max);
		System.out.println("Lowest Number in list: "+min);
		
		/*----------------Using Normal Logic------------------  */
		
		List<Integer> list = MyCollections.getUniqueIntegerList();
		int temp = list.get(0);
		for(int i=0; i<list.size(); i++) {
			if(temp < list.get(i)) {
				temp = list.get(i);
			}
		}
		System.out.println("Highest Number in array: "+temp);
		
	}

}
