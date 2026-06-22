import java.util.List;

public class LibraryUtils {

    public static <T extends Comparable<T>> T findMin(T[] array) {
        T min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }

        return min;
    }

    public static void printAll(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static <T> void copyList(
            List<? super T> dest,
            List<? extends T> src) {

        dest.addAll(src);
    }
}