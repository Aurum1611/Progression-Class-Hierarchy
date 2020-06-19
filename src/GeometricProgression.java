public class GeometricProgression extends Progression {

    private final long mul;

    GeometricProgression(long start, long mul) {
        super(start);
        this.mul = mul;
    }

    GeometricProgression(long start) {
        super(start);
        mul = 2;
    }

    GeometricProgression() {
        super(1);
        mul = 2;
    }

    @Override
    protected void advance() {
        start *= mul;
    }
}
