package pwo.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class SequenceTools {
    private static String getTerms(SequenceGenerator sg, int from, int to, String sep) {
        int i = from, stop = to, step = from > to ? -1 : 1;
        String terms = "";

        while (i != stop) {
            terms += sg.getTerm(i) + sep;
            i += step;
        }

        return terms.trim();
    }

    public static String getTermsAsColumn(SequenceGenerator sg, int from, int to) {
        return getTerms(sg, from, to, "\n");
    }

    public static String getTermsAsLine(SequenceGenerator sg, int from, int to) {
        return getTerms(sg, from, to, " ");
    }

    public static boolean writeToFile(SequenceGenerator sg, int from, int to, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(getTermsAsColumn(sg, from, to));
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
