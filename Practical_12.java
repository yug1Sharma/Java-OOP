class Practical_12{
	int x;
	int y;

	Practical_12(){
		x = 5;
		y = 5;
	}

	Practical_12(int a, int b){
		x = a;
		y = b;
	}

	Practical_12(Practical_12 P){
		x = P.x;
		y = P.y;
	}

	void Display(){
		System.out.println("Point :(" + x + ", " + y + ")");
	}

	public static void main(String []args){
		Practical_12 P1 = new Practical_12();
		Practical_12 P2 = new Practical_12();
		Practical_12 P3 = new Practical_12();

		P1.Display();
		P2.Display();
		P3.Display();
	}
}