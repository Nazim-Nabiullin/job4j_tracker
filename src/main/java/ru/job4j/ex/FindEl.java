package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element Not Found Exception");
        }
        return result;

    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        return true;
    }

    public static void process(String[] values, String key, String[] abuse) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuse);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        try {
            String[] array = {"one", "two", "three"};
            int index = indexOf(array, "two");
            System.out.println("Index: " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
