package patterns.structural.wrappers.facade;

public class Facade {
    public  <T extends Comparable<T>> int binarySearch(T[] array, T value, int min, int max) {
        sort(array, min, max);
        int mid;
        if (min > max) {
            return -1;
        } else {
            mid = (max - min) / 2 + min;
        }

        if (array[mid].compareTo(value) < 0) {
            return binarySearch(array, value, mid + 1, max);
        } else {
            if (array[mid].compareTo(value) > 0) {
                return binarySearch(array, value, min, mid - 1);
            } else return mid;
        }
    }


    private <T extends Comparable<T>> void sort(T[] array, int startIndex, int endIndex) {
        if (startIndex > endIndex) return;
        int middleIndex = (endIndex - startIndex) / 2 + startIndex;

        T middleElement = array[middleIndex];
        int i = startIndex;
        int j = endIndex;

        while (i <= j) {
            while (array[i].compareTo(middleElement) < 0) i++;
            while (array[j].compareTo(middleElement) > 0) j--;

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        sort(array, startIndex, j);
        sort(array, i, endIndex);
    }

    private <T extends Comparable<T>> void swap(T[] array, int leftIndex, int rightIndex) {
        T temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }

}
