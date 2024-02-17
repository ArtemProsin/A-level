package ua.prosin.hw10;

import java.util.Arrays;
import java.util.Optional;

class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";
        System.out.print(findIndexByPhoneNumber("016/161616"));
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {

        int index = Arrays.asList(PHONE_BOOK).indexOf(phoneNumber);
        System.out.println(index);
        if (index >= 0) {
            return Optional.of(index);
        } else {
            return Optional.empty();
        }
    }
}
