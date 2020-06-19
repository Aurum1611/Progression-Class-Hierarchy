public class ArithmeticProgression extends Progression {

    private final long inc;

    ArithmeticProgression(long start, long inc) {
        super(start);
        this.inc = inc;
    }

    ArithmeticProgression(long inc) {
        super();
        this.inc = inc;
    }

    ArithmeticProgression() {
        super();
        inc = 1;
    }

    @Override
    protected void advance() {
        start += inc;
    }
}
