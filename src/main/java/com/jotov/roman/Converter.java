package com.jotov.roman;


import lombok.extern.java.Log;

@Log
public class Converter {
    static private final String[] single = {"I", "V", "X"};
    static private final String[] ten = {"X", "L", "C"};
    static private final String[] hudert = {"C", "D", "M"};
    static private final String[] thousand = {"M", "V", "T"};
    static private final String[][] consts = {single, ten, hudert, thousand};

    public String toRoman(int arabic) {
        int length = (int) Math.log10(arabic);
        int index = 0;
//        log.info("arabic: " + arabic);
        StringBuilder result = new StringBuilder();
        int tail = arabic;
        do {
//            log.info("index: " + index);
            int head = tail % 10;
            tail = tail / 10;
//            log.info("head: " + head + " tail: " + tail);

            result.insert(0, digitAlayse(consts[index], head));
            index++;
        } while (index <= length);


        return result.toString();
    }

    private String digitAlayse(String[] localConsts, int digit) {
        switch (digit) {
            case 1:
                return localConsts[0];
            case 2:
                return localConsts[0] + localConsts[0];
            case 3:
                return localConsts[0] + localConsts[0] + localConsts[0];
            case 4:
                return localConsts[0] + localConsts[1];
            case 5:
                return localConsts[1];
            case 6:
                return localConsts[1] + localConsts[0];
            case 7:
                return localConsts[1] + localConsts[0] + localConsts[0];
            case 8:
                return localConsts[1] + localConsts[0] + localConsts[0] + localConsts[0];
            case 9:
                return localConsts[0] + localConsts[2];
            default:
                return "";
        }
    }
}
