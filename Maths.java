package College.OOM_Prac5;

public class Maths {

	private int a;
	private int b;

	public Maths() {

		a = 0;
		b = 0;

	}

	public Maths(int x, int y) {

		a = x;
		b = y;

	}

	public void setA(int x) {

		a = x;

	}

	public void setB(int y) {

		b = y;

	}

	public int getA() {

		return a;

	}

	public int getB() {

		return b;

	}

	public int swap() {

		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		return temp;

	}

}


