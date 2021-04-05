public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program");

		int X1,X2,Y1,Y2;
		int p1,p2,q1,q2;
		double lengthOfTheLine1, lengthOfTheLine2;
		X1 = 0;
		X2 = 0;
		Y1 = 9;
		Y2 = -6;

		p1 = 0;
		p2 = 9;
		q1 = 0;
		q2 = 5;

		lengthOfTheLine1 = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
		lengthOfTheLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		System.out.println("length of the first line (" + X1 + "," + Y1 + ")(" + X2 + "," + Y2 + ") is: " + lengthOfTheLine1);
		System.out.println("length of the second line (" + p1 + "," + q1 + ")(" + p2 + "," + q2 + ") is: " + lengthOfTheLine2);

		if (lengthOfTheLine1 < lengthOfTheLine2)
			System.out.println("Line1 is smaller then line2.");

		else if (lengthOfTheLine1 > lengthOfTheLine2)
			System.out.println("Line1 is larger then line2.");

		else
			System.out.println("Lines are equal.");

	}



}
