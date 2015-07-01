package licenta;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class SynonymFinder {

    public SynonymFinder() {

    }

    public ArrayList<String> getSynonyms(String word, int numberOfLevels) {
        ArrayList<String> synonyms = getSynonyms(word);
        while (numberOfLevels-- > 1) {
            ArrayList<String> newSynonymsList = new ArrayList<>();
            for (String synonym : synonyms) {
                newSynonymsList.addAll(getSynonyms(synonym));
            }
            for (String synonym : newSynonymsList) {
                if (!synonyms.contains(synonym)) {
                    synonyms.add(synonym);
                }
            }
        }
        return synonyms;
    }

    private ArrayList<String> getSynonyms(String word) {
        ArrayList<String> synonyms = new ArrayList<>();
        if (word == null || word.isEmpty()) {
            return synonyms;
        }
        try {
            String section = getDictionarySection(word);
            section += " !padding!";
            String[] words = section.split("\\s+");
            for (int i = 2; i < words.length - 1; i++) {
                if (isLeftDelimiter(words[i - 1].charAt(words[i - 1].length() - 1))
                        && (isRightDelimiter(words[i].charAt(words[i].length() - 1))
                        || isRightDelimiter(words[i+1].charAt(0)))) {
                    synonyms.add(filterWord(words[i]));
                }
            }
        } catch (Exception ex) {
        } finally {
            return synonyms;
        }
    }

    private String getDictionarySection(String unfilteredWord) {
        String word = new StringBuilder(unfilteredWord.toUpperCase().charAt(0)
                + unfilteredWord.substring(1).toLowerCase()).toString();
        BufferedReader reader;
        StringBuilder unprocessedResult = new StringBuilder();
        String line;
        boolean wordHasBeenFound = false;
        boolean exitWhileLoop = false;
        int i = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/dictionary/"
                            + word.toUpperCase().charAt(0) + ".txt"), "utf-8"));
            line = reader.readLine();
            while (i++ < 10000 && !exitWhileLoop) {
                if (wordHasBeenFound) {
                    if (!line.isEmpty() && line.charAt(0) == '~'
                            && isLetter(line.charAt(1))) {
                        if (!line.startsWith("~" + word + "~")) {
                            exitWhileLoop = true;
                        }
                    } else {
                        if (!line.isEmpty()) {
                            unprocessedResult.append(line).append("\n");
                        }
                    }
                }
                if (line.startsWith("~" + word + "~") && (line.contains("_a._")
                        || line.contains("_n._"))) {
                    wordHasBeenFound = true;
                    unprocessedResult.append(line).append("\n");
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception ex) {
        }
        return unprocessedResult.toString();
    }

    private boolean isLetter(char input) {
        if (input >= 'a' && input <= 'z') {
            return true;
        } else if (input >= 'A' && input <= 'Z') {
            return true;
        } else if (input == '-') {
            return true;
        }
        return false;
    }

    private boolean isLeftDelimiter(char input) {
        if (input == ',') {
            return true;
        } else if (input == ')') {
            return true;
        } else if (input == '~') {
            return true;
        } else if (input == ']') {
            return true;
        } else if (input == '_') {
            return true;
        } else if (input == ';') {
            return true;
        }
        return false;
    }

    private boolean isRightDelimiter(char input) {
        if (input == ',') {
            return true;
        } else if (input == '.') {
            return true;
        } else if (input == ';') {
            return true;
        } else if (input == '(') {
            return true;
        }
        return false;
    }

    private String filterWord(String word) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (isLetter(word.charAt(i))) {
                output.append(word.charAt(i));
            }
        }
        return output.toString().toLowerCase();
    }

}
