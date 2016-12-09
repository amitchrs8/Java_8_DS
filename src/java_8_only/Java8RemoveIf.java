package java_8_only;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Java8RemoveIf {

	private List<String> getUseRemoveIf(List<String> strList){
		if(strList != null){
			strList.removeIf(new Predicate<String>() {
				@Override
				public boolean test(String t) {
					if(t.contains("2")){
						return true;
					}
					else
					return false;
				}
			});
		}
		return strList;
	}
	
	private List<String> getUseRemoveIfLambda(List<String> strList){
		if(strList != null){
			strList.removeIf((String s)-> {
				if(s.contains("1")){
					return true;
				}
				else {
					return false;
				}
			});
		}
		return strList;
	}
	
	
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		for(int i=0;i<30;i++){
			strList.add("Test-"+i);
		}
		System.out.println("Printing all the Strings before rmeoval");
		System.out.println("=======================================");
		strList.stream().forEach(System.out :: println);
		System.out.println("Printing all the Strings after rmeoval");
		System.out.println("=======================================");
		Java8RemoveIf obj = new Java8RemoveIf();
		strList = obj.getUseRemoveIfLambda(strList);
		strList.stream().forEach(System.out :: println);
	}
	
}
