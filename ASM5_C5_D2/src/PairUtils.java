public class PairUtils {

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }

    public static <K, V extends Comparable<V>> boolean comparePairs(
            Pair<K, V> p1,
            Pair<K, V> p2) {

        return p1.getValue().compareTo(p2.getValue()) > 0;
    }
}