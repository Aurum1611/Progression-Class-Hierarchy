public class TestProgression {
    public static void main(String[] args) {
        Progression prog;

        System.out.println("ArithmeticProgression");
        prog = new ArithmeticProgression();
        prog.printProgression(9);
        prog = new ArithmeticProgression(3);
        prog.printProgression(9);
        prog = new ArithmeticProgression(2, 3);
        prog.printProgression(9);

        System.out.println("GeometricProgression");
        prog = new GeometricProgression();
        prog.printProgression(9);
        prog = new GeometricProgression(4);
        prog.printProgression(9);
        prog = new GeometricProgression(2, 3);
        prog.printProgression(9);

        System.out.println("FibonacciSeries");
        prog = new FibonacciSeries();
        prog.printProgression(9);
        prog = new FibonacciSeries(4, 7);
        prog.printProgression(9);
    }
}
