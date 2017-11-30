package edu.wust.collection;

import java.util.*;


public class CollectionTest {

	public static void main(String[] args) {
		prtl("----- list&Set Test ------");
		listSetTest();
//		prtl("----- map Test------");
		//MapTest();
//		prtl("-----Arrays Iterator  Test------");
//		ArraysIteratorTest();
//		prtl("-----Collections  Test------");
//		CollectionsTest();
//		prtl("-----Comparator  Test------");
//		ComparatorTest();
//		prtl("-----LambdaTest  Test------");
//		LambdaTest();
	}
	
	/**
	 * List & Set
	 */
		static void listSetTest() {
			String[] str={"香蕉","苹果","大鸭梨","大鸭梨"};
			Set<String> set=new HashSet<String>();
			List<String> list=new ArrayList<String>();
			for(String s:str) {
				list.add(s);
				set.add(s);
			}				
			prtl("list成员数量："+list.size());
			prtl("set成员数量："+set.size());
			prtl("list包含：");
			for(String strs:list) {				
				prt(" "+strs);
			}			
			prtl("\n Set包含：");			
			for(String strs:set) {				
				prt(" "+strs);
			}
			prtl("\n 返回list的大鸭梨序号："+list.indexOf("大鸭梨"));			
		}
		/**
		 * map
		 */
		static void MapTest() {
			String[] str={"香蕉","苹果","大鸭梨","大鸭梨"};
			Map<Integer, String> map=new HashMap<Integer, String>();
			for(int i=0 ;i<str.length;i++) {
				Integer j=i;
				map.put(j, str[i]);				
			}			
			prtl("map大小："+map.size());
			prtl("map键值："+map.keySet());
			prtl("map值："+map.values());
			prtl("键1的值："+map.get(1));

		}
		/**
		 * Arrays & Iterator
		 */
		static void ArraysIteratorTest(){
			String[] str={"香蕉","苹果","大鸭梨","大鸭梨"};			
			Arrays.fill(str,2,3, "芒果");
			prtl("替换后排序前：");
			for(String s:str) {prt(s);}
			Arrays.sort(str);
			List<String> list=Arrays.asList(str);			
			Iterator<String> it =list.iterator();
			prtl("\n 排序后:");
			while(it.hasNext()) {
				prt(" "+it.next());
			}
			prtl("");
		}	
		/**
		 * Collections类测试
		 */
		static void CollectionsTest(){
			String[] str={"香蕉","苹果","大鸭梨","大鸭梨"};
			List<String> list=Arrays.asList(str);
			prtl("排序前苹果的序号："+Collections.binarySearch(list, "苹果"));
			Collections.sort(list);		
			prtl("\n 排序后:");
			Iterator<String> it =list.iterator();
			while(it.hasNext()) {
				prt(" "+it.next());
			}
			Collections.reverse(list);
			prtl("\n 反转排序:");
			 it =list.iterator();
			while(it.hasNext()) {
				prt(" "+it.next());
			}
			
		}	
		/**
		 * Comparator测试
		 * 用到Fruit类
		 * 需重写比较器 fruitComparator		 * 
		 */
		static void ComparatorTest(){			
			List<Fruit> list = Fruit.menu;
			Collections.sort(list, new FruitComparator());  //使用比较器排序
			for(Fruit f:list)
			{
				prtl(f.getName()+f.getCalories());
			}				
		}	
		
		static void LambdaTest() {
			List<Fruit> list = Fruit.menu;
			Collections.sort(list,Comparator.comparing(
					(Fruit a)->a.getName()
					)); 
			Collections.sort(list,Comparator.comparingInt(Fruit::getCalories)); 
			//1.8 List新增方法
			list.sort(Comparator.comparing(
					(Fruit a)->a.getName())
					);			
			for(Fruit f:list)
			{
				prtl(f.getName()+f.getCalories());
			}	
		}
	
	static void prtl(String str) {
		System.out.println(str);
	}

	static void prt(String str) {
		System.out.print(str);
	}
}
