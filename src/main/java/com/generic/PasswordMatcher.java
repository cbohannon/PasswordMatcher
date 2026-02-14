package com.generic;

import org.apache.commons.lang3.time.StopWatch;

public class PasswordMatcher {
    private static final char[] CHARSET =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_".toCharArray();

    private static final StopWatch stopWatch = new StopWatch();

    public static void main(String[] args) {
        String password = "_ABc12";
        if (args.length != 0) {
            password = args[0];
        }

        if (!isSupportedPassword(password)) {
            System.out.println("Unsupported characters in password. Only A-Z, a-z, 0-9, and _ are allowed.");
            return;
        }

        stopWatch.start();
        bruteForceAttack(password.length(), password);
        stopWatch.stop();
        stopWatch.reset();
    }

    static boolean isSupportedPassword(String password) {
        for (char c : password.toCharArray()) {
            boolean found = false;
            for (char valid : CHARSET) {
                if (c == valid) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return !password.isEmpty();
    }

    private static String bruteForceAttack(int passwordLength, String password) {
        int[] indices = new int[passwordLength];
        return computePermutations(passwordLength, indices, 0, password);
    }

    private static String computePermutations(int size, int[] indices, int position, String target) {
        for (int i = 0; i < CHARSET.length; i++) {
            indices[position] = i;

            if (position < size - 1) {
                String result = computePermutations(size, indices, position + 1, target);
                if (!result.isEmpty()) {
                    return result;
                }
            } else {
                StringBuilder assemble = new StringBuilder(size);
                for (int j = 0; j < size; j++) {
                    assemble.append(CHARSET[indices[j]]);
                }

                String candidate = assemble.toString();
                if (candidate.equals(target)) {
                    System.out.println("Password is: " + candidate);

                    stopWatch.split();
                    System.out.println("Approximate time taken: " + stopWatch.toSplitString());

                    return candidate;
                }
            }
        }
        return "";
    }
}
