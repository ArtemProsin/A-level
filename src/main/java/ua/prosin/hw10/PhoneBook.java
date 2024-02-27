package ua.prosin.hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";
        findIndexByPhoneNumber("016/161616");
    }

    public static void  findIndexByPhoneNumber(String phoneNumber) {

        List<String> strings = Arrays.asList(PHONE_BOOK);
        Optional<Integer> result = strings.stream()
                .filter(s -> s.equals(phoneNumber))
                .findFirst()
                .map(strings::indexOf);

        if(result.isPresent()){
            System.out.println(result.get());
        } else {
            System.out.println("Not Found");
        }
    }
}
