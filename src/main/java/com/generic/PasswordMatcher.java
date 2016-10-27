package com.generic;

import java.util.Objects;
import org.apache.commons.lang3.time.StopWatch;

public class PasswordMatcher {
    private static StopWatch stopWatch = new StopWatch();

    private String[] upperCase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private String[] lowerCase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private String[] digits = {"1" ,"2", "3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9", "0"};
    private String[] specialCharacters = {"_"};

    public static void main (String[] args) {
        stopWatch.start();

        String password = "ABc12_";
        if (args.length != 0) {
            password = args[0];
        }

        bruteForceAttack(password.length(), password);

        stopWatch.reset();
    }

    private static String bruteForceAttack(int passwordLength, String password) {
        int[] intLength = new int[passwordLength];

        PasswordMatcher matcher = new PasswordMatcher();

        return matcher.computePermutations(passwordLength, intLength, 0, password);
    }

    private String computePermutations(int size, int[] password, int position, String pass) {
        String testString;
        String assemble = "";

        int optionCount = upperCase.length + lowerCase.length + digits.length + specialCharacters.length;

        for (int i = 0; i < optionCount; i ++) {
            password[position] = i;

            if (position != size - 1) {
                testString = computePermutations(size, password, position + 1, pass);
                if (!Objects.equals(testString, "")) {
                    return testString;
                }
            } else if (position == size - 1) {
                for (int j = 0; j < size; j ++) {
                    switch (password[j] + 1) {
                        case 1:
                            assemble = assemble + "A";
                            break;
                        case 2:
                            assemble = assemble + "B";
                            break;
                        case 3:
                            assemble = assemble + "C";
                            break;
                        case 4:
                            assemble = assemble + "D";
                            break;
                        case 5:
                            assemble = assemble + "E";
                            break;
                        case 6:
                            assemble = assemble + "F";
                            break;
                        case 7:
                            assemble = assemble + "G";
                            break;
                        case 8:
                            assemble = assemble + "H";
                            break;
                        case 9:
                            assemble = assemble + "I";
                            break;
                        case 10:
                            assemble = assemble + "J";
                            break;
                        case 11:
                            assemble = assemble + "K";
                            break;
                        case 12:
                            assemble = assemble + "L";
                            break;
                        case 13:
                            assemble = assemble + "M";
                            break;
                        case 14:
                            assemble = assemble + "N";
                            break;
                        case 15:
                            assemble = assemble + "O";
                            break;
                        case 16:
                            assemble = assemble + "P";
                            break;
                        case 17:
                            assemble = assemble + "Q";
                            break;
                        case 18:
                            assemble = assemble + "R";
                            break;
                        case 19:
                            assemble = assemble + "S";
                            break;
                        case 20:
                            assemble = assemble + "T";
                            break;
                        case 21:
                            assemble = assemble + "U";
                            break;
                        case 22:
                            assemble = assemble + "V";
                            break;
                        case 23:
                            assemble = assemble + "W";
                            break;
                        case 24:
                            assemble = assemble + "X";
                            break;
                        case 25:
                            assemble = assemble + "Y";
                            break;
                        case 26:
                            assemble = assemble + "Z";
                            break;
                        case 27:
                            assemble = assemble + "a";
                            break;
                        case 28:
                            assemble = assemble + "b";
                            break;
                        case 29:
                            assemble = assemble + "c";
                            break;
                        case 30:
                            assemble = assemble + "d";
                            break;
                        case 31:
                            assemble = assemble + "e";
                            break;
                        case 32:
                            assemble = assemble + "f";
                            break;
                        case 33:
                            assemble = assemble + "g";
                            break;
                        case 34:
                            assemble = assemble + "h";
                            break;
                        case 35:
                            assemble = assemble + "i";
                            break;
                        case 36:
                            assemble = assemble + "j";
                            break;
                        case 37:
                            assemble = assemble + "k";
                            break;
                        case 38:
                            assemble = assemble + "l";
                            break;
                        case 39:
                            assemble = assemble + "m";
                            break;
                        case 40:
                            assemble = assemble + "n";
                            break;
                        case 41:
                            assemble = assemble + "o";
                            break;
                        case 42:
                            assemble = assemble + "p";
                            break;
                        case 43:
                            assemble = assemble + "q";
                            break;
                        case 44:
                            assemble = assemble + "r";
                            break;
                        case 45:
                            assemble = assemble + "s";
                            break;
                        case 46:
                            assemble = assemble + "t";
                            break;
                        case 47:
                            assemble = assemble + "u";
                            break;
                        case 48:
                            assemble = assemble + "v";
                            break;
                        case 49:
                            assemble = assemble + "w";
                            break;
                        case 50:
                            assemble = assemble + "x";
                            break;
                        case 51:
                            assemble = assemble + "y";
                            break;
                        case 52:
                            assemble = assemble + "z";
                            break;
                        case 53:
                            assemble = assemble + "0";
                            break;
                        case 54:
                            assemble = assemble + "1";
                            break;
                        case 55:
                            assemble = assemble + "2";
                            break;
                        case 56:
                            assemble = assemble + "3";
                            break;
                        case 57:
                            assemble = assemble + "4";
                            break;
                        case 58:
                            assemble = assemble + "5";
                            break;
                        case 59:
                            assemble = assemble + "6";
                            break;
                        case 60:
                            assemble = assemble + "7";
                            break;
                        case 61:
                            assemble = assemble + "8";
                            break;
                        case 62:
                            assemble = assemble + "9";
                            break;
                        case 63:
                            assemble = assemble + "_";
                            break;
                        default:
                            assemble = assemble + "ERROR";
                            break;
                    }
                }

                // Uncomment this section to view the output in detail in the console but remember that doing so makes
                // the application take MUCH longer and could break the test.
                /*
                System.out.println(assemble);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                */

                if (assemble.equals(pass)) {
                    System.out.println("Password is: " + assemble);

                    stopWatch.split();
                    System.out.println("Approximate time taken: " + stopWatch.toSplitString());

                    return assemble;
                } else {
                    assemble = "";
                }
            }
        }
        return "";
    }
}