import java.util.ArrayList;

public class StramAPI {

	public static void main(String[] args) {
		int count =0;
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ashutosh sharma");
		names.add("ashush");
		names.add("mohjit");
		names.add("dijjdf");
		names.add("bjnhag");
		names.add("klzjfhihiu");
		
		
		for(int i=0;i<names.size();i++) {
			String name = names.get(i);
			if(name.startsWith("a")) {
				count++;
				
			}
			
			System.out.println("total number of letter which start with A is :"+count);
		}

	}
	

}
