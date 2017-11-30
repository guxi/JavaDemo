package edu.wust.collection;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.*;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import static java.util.Comparator.comparing;
/**
 * 
 * @author yy
 *
 */
public class StreamTest {

	public static void main(String[] args) {
		firstStream();
//		findAnycTest();
//		distincTest() ;
//		reduceTest();
//		collectTest();

	}
	
	static void firstStream() {
		List<String> lowCaloricName =
				Fruit.menu.stream()
					.filter(d -> d.getCalories() < 60)
					.sorted(comparing(Fruit::getCalories))
					.map(Fruit::getName)					
					.collect(toList());
		for(String s:lowCaloricName)prtl(s);		
	}
	static void sortedTest() {
		List<Fruit> lowCaloricName =
				Fruit.menu.stream()					
					.sorted(comparing(Fruit::getCalories))									
					.collect(toList());
		for(Fruit s:lowCaloricName)prtl(s.getName());
	}
	static void distincTest() {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream()
			.filter(i -> i % 2 == 0)
			.distinct()
			.forEach(System.out::println);
	}
	
	static void findAnycTest() {
		Optional<Fruit> lowCaloric =
				Fruit.menu.stream()
				.filter(d -> d.getCalories() < 50)
				. findAny();
		prtl("一个小于50卡路里的水果："+lowCaloric.get().getName());
		
	}
	static void collectTest() {
		IntSummaryStatistics Statistics =
				Fruit.menu.stream()
				.collect(summarizingInt(Fruit::getCalories));
		prtl("统计："+Statistics.toString());
		
	}
	
	static void reduceTest() {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		int i=numbers.stream()
			.reduce(0,(a,b)->a+b);
		prtl("求和："+i);
		Optional<Integer> max = numbers.stream().reduce((x, y) -> x > y ? x : y);
		prtl("最大值："+max);
		Optional<Integer> min = numbers.stream().reduce((x, y) -> x < y ? x : y);
		prtl("最小值："+min);
		
			
	}
	
	static void prtl(String str) {
		System.out.println(str);
	}

	static void prt(String str) {
		System.out.print(str);
	}
}
