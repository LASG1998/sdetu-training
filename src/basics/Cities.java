package basics;


public class Cities {

	public static void main(String[] args) {
		String[] cities ={"New York", "San Francisco","miami","dallas"};
		
		//FOR
		for(int x=0; x<4; x++) {
			System.out.println(cities[x]);
		}
		
		
		String[] states=new String[5];
		states[0]="california";
		states[2]="New Jersey";
		int i=0;
		
		//DO WHILE
		do {
			System.out.println("STATE: "+ states[i]);
			i++;
			
			
		}while (i<5);
		
		
	}

}
