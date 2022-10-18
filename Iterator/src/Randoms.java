import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {

    protected Random random;
    private int min;
    private int max;
    private int diff;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.diff = max - min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    public class RandomsIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int i;
            random = new Random();
            i = random.nextInt(diff + 1) + min;
            return i;
        }
    }
}