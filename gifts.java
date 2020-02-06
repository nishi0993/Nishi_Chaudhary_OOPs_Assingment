class Gifts{
	int chocolates;
	int sweets;
	int chocolates_cost(int chocolates){
		return chocolates*15;
	}
	int sweets_cost(int sweets){
		return sweets*15;
	}
}
class Main{
	public static void main(String[] agrs){
		//Encapsulation of variables and methods in the object
		Gifts children1 = new Gifts();
		children1.chocolates=4;
		children1.sweets=12;
		System.out.println("Cost of chocolates for "+children1.chocolates+" is "+children1.chocolates_cost(children1.chocolates));
		System.out.println("Cost of sweets for "+children1.sweets+" is "+children1.sweets_cost(children1.sweets));
	}
}
