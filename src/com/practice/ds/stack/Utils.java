package com.practice.ds.stack;

import static java.util.Arrays.asList;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;



public class Utils {

    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_";
    private static final String NUM_LIST = "1234567890";
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * This method generates random string
     *
     * @return
     */
    public static String generateRandomString(int length) {

        StringBuffer randStr = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }

    public static String generateRandomNumber(int length) {

        StringBuffer randStr = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = getRandomNumber(NUM_LIST.length());
            char ch = NUM_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }

    public static String generateRandomNumber(int length, String charList) {

        StringBuffer randStr = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = getRandomNumber(charList.length());
            char ch = charList.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }

    private static int getRandomNumber(int length) {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(length);
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }

    /**
     * This method generates random numbers
     *
     * @return int
     */
    private static int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }


    public static boolean checkEmptyOrNULLString(String string) {
        if (string == null || "".equals(string.trim())) {
            return true;
        }
        return false;
    }


    public static String getURL(String ip, String port, String uri) {
        String url = "http://" + ip + uri;
        if (port != null && !"".equals(port.trim())) {
            url = "http://" + ip + ":" + port + uri;
        }
        return url;
    }

    public static String generateTransactionId() {
        return Calendar.getInstance().getTimeInMillis() + generateRandomNumber(6);
    }

    public static Boolean checkListHasElement(List list) {
        if (list == null) {
            return false;
        } else {
            if (list.size() == 0) {
                return false;
            }
            return true;
        }
    }

    public static String toCamelCase(String s) {
        String[] parts = s.split(" ");
        String camelCaseString = "";
        for (String part : parts) {
            camelCaseString = camelCaseString + toProperCase(part) + " ";
        }
        return camelCaseString;
    }

    public static String getCommaSeperatedString(List<String> strings) {
        return strings
                .stream()
                .collect(Collectors.joining(","));
    }

    public static List<String> getListFromCSV(String stringCSV) {
        return asList(stringCSV.split(","));
    }

    public static boolean isCollectionEmpty(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String dateToString(Date date) {
        return sdf.format(date);
    }

    public static String centsToAbsolute(long cent) {
        double absolute = (double) cent/100;
        return absolute + "";
    }
    
    static String[] operations = {"+","-"};
    
    public static String getOperation()
    {
        return operations[getRandomNumber(0, 1)];
    }
    
}
