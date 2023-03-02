package College.OOM_Prac5;

class TestMath {
    public static void main(String[] args ) {
            
    Maths myMath = new Maths();
    System.out.println("\n1st object created via default constructor:");
    System.out.println("Before Swap");
    System.out.println("A: " + myMath.getA());
    System.out.println("B: " + myMath.getB());
    myMath.swap();
    System.out.println("After Swap");
    System.out.println("A: " + myMath.getA());
    System.out.println("B: " + myMath.getB());

    myMath.setA(10);
    myMath.setB(15);
    System.out.println("\n1st object was reset with 10 & 15:");
    System.out.println("Before Swap");
    System.out.println("A: " + myMath.getA());
    System.out.println("B: " + myMath.getB());
    myMath.swap();
    System.out.println("After Swap");
    System.out.println("A: " + myMath.getA());
    System.out.println("B: " + myMath.getB());

    Maths myMath2 = new Maths(4,5);
    System.out.println("\n2nd object created via 2-args constructor:");
    System.out.println("Before Swap");
    System.out.println("A: " + myMath2.getA());
    System.out.println("B: " + myMath2.getB());
    myMath2.swap();
    System.out.println("After Swap");
    System.out.println("A: " + myMath2.getA());
    System.out.println("B: " + myMath2.getB());

    }
    
}
