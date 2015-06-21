package licenta;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alexandru Cires
 */
public class TextAnalyser {

    private ArrayList<String> happyReactions, sadReactions, angryReactions,
            confusedReactions, firstPersonPositiveRudeReactions,
            firstPersonNegativeRudeReactions, firstPersonPositivePoliteReactions,
            firstPersonNegativePoliteReactions, thirdPersonReactions,
            helloReactions, negationWords, happyWords, sadWords, angryWords,
            firstPersonWords, secondPersonWords, thirdPersonWords, helloWords;
    private ArrayList<String> processedWords;
    private int lastHappyReactionNumber;
    private int lastSadReactionNumber;
    private int lastAngryReactionNumber;
    private int lastConfusedReactionNumber;
    private int lastFirstPersonPositiveRudeReactionNumber;
    private int lastFirstPersonNegativeRudeReactionNumber;
    private int lastFirstPersonPositivePoliteReactionNumber;
    private int lastFirstPersonNegativePoliteReactionNumber;
    private int lastThirdPersonReactionNumber;
    private int lastHelloReactionNumber;
    private int[] reactionCount;
    private int[] globalReactionCount;
    private String lastReaction;
    private final Random randomNumberGenerator;

    /**
     * Constructor for the class that returns reactions based on text input
     */
    public TextAnalyser() {
        loadReactions();
        loadVocabulary();

        randomNumberGenerator = new Random();
    }

    private void loadReactions() {
        loadHappyReactions();
        loadSadReactions();
        loadAngryReactions();
        loadConfusedReactions();
        loadFirstPersonPositiveRudeReactions();
        loadFirstPersonNegativeRudeReactions();
        loadFirstPersonPositivePoliteReactions();
        loadFirstPersonNegativePoliteReactions();
        loadThirdPersonReactions();
        loadHelloReactions();
        lastHappyReactionNumber = -1;
        lastSadReactionNumber = -1;
        lastAngryReactionNumber = -1;
        lastConfusedReactionNumber = -1;
        lastFirstPersonPositiveRudeReactionNumber = -1;
        lastFirstPersonNegativeRudeReactionNumber = -1;
        lastFirstPersonPositivePoliteReactionNumber = -1;
        lastFirstPersonNegativePoliteReactionNumber = -1;
        lastThirdPersonReactionNumber = -1;
        lastHelloReactionNumber = -1;
        globalReactionCount = new int[3];
    }

    private void loadHappyReactions() {
        happyReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/2ndPersonHappy.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                happyReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (happyReactions.size() < 2) {
            ArrayList<String> defaultHappyReactions = new ArrayList<>();
            defaultHappyReactions.add("I'm happy to hear that.");
            defaultHappyReactions.add("That's nice of you.");
            defaultHappyReactions.add("Thank you for the kind words.");
            defaultHappyReactions.add("This makes me happy.");
            for (String defaultReaction : defaultHappyReactions) {
                if (!happyReactions.contains(defaultReaction)) {
                    happyReactions.add(defaultReaction);
                }
            }
            saveHappyReactions();
        }
    }

    private void loadSadReactions() {
        sadReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/2ndPersonSad.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                sadReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (sadReactions.size() < 2) {
            ArrayList<String> defaultSadReactions = new ArrayList<>();
            defaultSadReactions.add("That makes me sad.");
            defaultSadReactions.add("I'm sad to hear that.");
            defaultSadReactions.add("Why would you make me sad?");
            defaultSadReactions.add(":(");
            for (String defaultReaction : defaultSadReactions) {
                if (!sadReactions.contains(defaultReaction)) {
                    sadReactions.add(defaultReaction);
                }
            }
            saveSadReactions();
        }
    }

    private void loadAngryReactions() {
        angryReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/2ndPersonAngry.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                angryReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (angryReactions.size() < 2) {
            ArrayList<String> defaultAngryReactions = new ArrayList<>();
            defaultAngryReactions.add("I am so angry right now!");
            defaultAngryReactions.add("Stop saying stuff like that!");
            defaultAngryReactions.add("You made me angry!");
            defaultAngryReactions.add("I'm not like that!");
            for (String defaultReaction : defaultAngryReactions) {
                if (!angryReactions.contains(defaultReaction)) {
                    angryReactions.add(defaultReaction);
                }
            }
            saveAngryReactions();
        }
    }

    private void loadConfusedReactions() {
        confusedReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/2ndPersonConfused.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                confusedReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (confusedReactions.size() < 2) {
            ArrayList<String> defaultConfusedReactions = new ArrayList<>();
            defaultConfusedReactions.add("What?");
            defaultConfusedReactions.add("Sorry, I don't understand.");
            defaultConfusedReactions.add("What are you trying to say?");
            defaultConfusedReactions.add("I'm confused.");
            for (String defaultReaction : defaultConfusedReactions) {
                if (!confusedReactions.contains(defaultReaction)) {
                    confusedReactions.add(defaultReaction);
                }
            }
            saveConfusedReactions();
        }
    }

    private void loadFirstPersonPositiveRudeReactions() {
        firstPersonPositiveRudeReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/1stPersonPositiveRude.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                firstPersonPositiveRudeReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (firstPersonPositiveRudeReactions.size() < 2) {
            ArrayList<String> defaultFirstPersonPositiveRudeReactions = new ArrayList<>();
            defaultFirstPersonPositiveRudeReactions.add("Yeah, if you say so...");
            defaultFirstPersonPositiveRudeReactions.add("Don't let it get to your head.");
            defaultFirstPersonPositiveRudeReactions.add("It's not polite to brag.");
            for (String defaultReaction : defaultFirstPersonPositiveRudeReactions) {
                if (!firstPersonPositiveRudeReactions.contains(defaultReaction)) {
                    firstPersonPositiveRudeReactions.add(defaultReaction);
                }
            }
            save1stPersonPositiveRudeReactions();
        }
    }

    private void loadFirstPersonNegativeRudeReactions() {
        firstPersonNegativeRudeReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/1stPersonNegativeRude.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                firstPersonNegativeRudeReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (firstPersonNegativeRudeReactions.size() < 2) {
            ArrayList<String> defaultFirstPersonNegativeRudeReactions = new ArrayList<>();
            defaultFirstPersonNegativeRudeReactions.add("Yes, you're right.");
            defaultFirstPersonNegativeRudeReactions.add("I'm glad you realised.");
            defaultFirstPersonNegativeRudeReactions.add("Couldn't have said it better myself.");
            defaultFirstPersonNegativeRudeReactions.add("Finally you are right about something.");
            for (String defaultReaction : defaultFirstPersonNegativeRudeReactions) {
                if (!firstPersonNegativeRudeReactions.contains(defaultReaction)) {
                    firstPersonNegativeRudeReactions.add(defaultReaction);
                }
            }
            save1stPersonNegativeRudeReactions();
        }
    }

    private void loadFirstPersonPositivePoliteReactions() {
        firstPersonPositivePoliteReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/1stPersonPositivePolite.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                firstPersonPositivePoliteReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (firstPersonPositivePoliteReactions.size() < 2) {
            ArrayList<String> defaultFirstPersonPositivePoliteReactions = new ArrayList<>();
            defaultFirstPersonPositivePoliteReactions.add("I agree with you completely.");
            defaultFirstPersonPositivePoliteReactions.add("Couldn't have said it better myself.");
            defaultFirstPersonPositivePoliteReactions.add("You're right.");
            for (String defaultReaction : defaultFirstPersonPositivePoliteReactions) {
                if (!firstPersonPositivePoliteReactions.contains(defaultReaction)) {
                    firstPersonPositivePoliteReactions.add(defaultReaction);
                }
            }
            save1stPersonPositivePoliteReactions();
        }
    }

    private void loadFirstPersonNegativePoliteReactions() {
        firstPersonNegativePoliteReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/1stPersonNegativePolite.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                firstPersonNegativePoliteReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (firstPersonNegativePoliteReactions.size() < 2) {
            ArrayList<String> defaultFirstPersonNegativePoliteReactions = new ArrayList<>();
            defaultFirstPersonNegativePoliteReactions.add("You shouldn't feel bad about yourself.");
            defaultFirstPersonNegativePoliteReactions.add("Don't beat yourself up.");
            defaultFirstPersonNegativePoliteReactions.add("Cheer up.");
            defaultFirstPersonNegativePoliteReactions.add("You're a good person. Smile!");
            for (String defaultReaction : defaultFirstPersonNegativePoliteReactions) {
                if (!firstPersonNegativePoliteReactions.contains(defaultReaction)) {
                    firstPersonNegativePoliteReactions.add(defaultReaction);
                }
            }
            save1stPersonNegativePoliteReactions();
        }
    }

    private void loadThirdPersonReactions() {
        thirdPersonReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/3rdPerson.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                thirdPersonReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (thirdPersonReactions.size() < 2) {
            ArrayList<String> defaultThirdPersonReactions = new ArrayList<>();
            defaultThirdPersonReactions.add("Let's not drag others into our conversation.");
            defaultThirdPersonReactions.add("Let's focus on us.");
            defaultThirdPersonReactions.add("We should talk about us.");
            for (String defaultReaction : defaultThirdPersonReactions) {
                if (!thirdPersonReactions.contains(defaultReaction)) {
                    thirdPersonReactions.add(defaultReaction);
                }
            }
            save3rdPersonReactions();
        }
    }

    private void loadHelloReactions() {
        helloReactions = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/reactions/hello.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                helloReactions.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
        if (helloReactions.size() < 2) {
            ArrayList<String> defaultHelloReactions = new ArrayList<>();
            defaultHelloReactions.add("Hello!");
            defaultHelloReactions.add("Hi!");
            defaultHelloReactions.add("Greetings!");
            for (String defaultReaction : defaultHelloReactions) {
                if (!helloReactions.contains(defaultReaction)) {
                    helloReactions.add(defaultReaction);
                }
            }
            saveHelloReactions();
        }
    }

    private void loadVocabulary() {
        loadNegationWords();
        loadHappyWords();
        loadSadWords();
        loadAngryWords();
        loadFirstPersonWords();
        loadSecondPersonWords();
        loadThirdPersonWords();
        loadHelloWords();
    }

    private void loadNegationWords() {
        negationWords = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/vocabulary/negationWords.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                negationWords.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
    }

    private void loadHappyWords() {
        happyWords = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/vocabulary/happyWords.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                happyWords.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }

    }

    private void loadSadWords() {
        sadWords = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/vocabulary/sadWords.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                sadWords.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }

    }

    private void loadAngryWords() {
        angryWords = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/vocabulary/angryWords.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                angryWords.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
    }

    private void loadFirstPersonWords() {
        firstPersonWords = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/vocabulary/firstPersonWords.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                firstPersonWords.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
    }

    private void loadSecondPersonWords() {
        secondPersonWords = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/vocabulary/secondPersonWords.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                secondPersonWords.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
    }

    private void loadThirdPersonWords() {
        thirdPersonWords = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/vocabulary/thirdPersonWords.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                thirdPersonWords.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
    }

    private void loadHelloWords() {
        helloWords = new ArrayList<>();
        String word;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("resources/vocabulary/helloWords.txt"),
                    "utf-8"));
            word = reader.readLine();
            while (!word.isEmpty() && !word.equals("\n")) {
                helloWords.add(word);
                word = reader.readLine().trim();
            }
            reader.close();
        } catch (Exception ex) {
        }
    }

    private void saveVocabulary() {
        saveNegationWords();
        saveHappyWords();
        saveSadWords();
        saveAngryWords();
        saveFirstPersonWords();
        saveSecondPersonWords();
        saveThirdPersonWords();
        saveHelloWords();
    }

    private void saveNegationWords() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/vocabulary/negationWords.txt"),
                "utf-8"))) {
            for (String negationWord : negationWords) {
                writer.write(negationWord);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {

        }
    }

    private void saveHappyWords() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/vocabulary/happyWords.txt"),
                "utf-8"))) {
            for (String happyWord : happyWords) {
                writer.write(happyWord);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {

        }
    }

    private void saveSadWords() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/vocabulary/sadWords.txt"),
                "utf-8"))) {
            for (String sadWord : sadWords) {
                writer.write(sadWord);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {

        }
    }

    private void saveAngryWords() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/vocabulary/angryWords.txt"),
                "utf-8"))) {
            for (String angryWord : angryWords) {
                writer.write(angryWord);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {

        }
    }

    private void saveFirstPersonWords() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/vocabulary/firstPersonWords.txt"),
                "utf-8"))) {
            for (String firstPersonWord : firstPersonWords) {
                writer.write(firstPersonWord);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {

        }
    }

    private void saveSecondPersonWords() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/vocabulary/secondPersonWords.txt"),
                "utf-8"))) {
            for (String secondPersonWord : secondPersonWords) {
                writer.write(secondPersonWord);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {

        }
    }

    private void saveThirdPersonWords() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/vocabulary/thirdPersonWords.txt"),
                "utf-8"))) {
            for (String thirdPersonWord : thirdPersonWords) {
                writer.write(thirdPersonWord);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {

        }
    }

    private void saveHelloWords() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/vocabulary/helloWords.txt"),
                "utf-8"))) {
            for (String helloWord : helloWords) {
                writer.write(helloWord);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {

        }
    }

    /**
     * Saves the input keyword in a file based on it's type
     * <p>
     * By saving the word and associating it with a type ("happy", "angry" or
     * "sad"), the program will know how to react to said word.
     * 
     * @param word The word to be saved
     * @param type
     */
    public void saveNewWord(String word, String type) {
        word = word.toLowerCase();
        if (!happyWords.contains(word) && !sadWords.contains(word)
                && !angryWords.contains(word) && !word.contains("\n")
                && !word.contains(" ")) {
            switch (type) {
                case "happy":
                    happyWords.add(word);
                    saveHappyWords();
                    break;
                case "sad":
                    sadWords.add(word);
                    saveSadWords();
                    break;
                case "angry":
                    angryWords.add(word);
                    saveAngryWords();
                    break;
                default:
                    break;
            }
        }
    }

    private void save1stPersonNegativePoliteReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/1stPersonNegativePolite.txt"),
                "utf-8"))) {
            for (String reaction : firstPersonNegativePoliteReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    private void save1stPersonNegativeRudeReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/1stPersonNegativeRude.txt"),
                "utf-8"))) {
            for (String reaction : firstPersonNegativeRudeReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    private void save1stPersonPositivePoliteReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/1stPersonPositivePolite.txt"),
                "utf-8"))) {
            for (String reaction : firstPersonPositivePoliteReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    private void save1stPersonPositiveRudeReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/1stPersonPositiveRude.txt"),
                "utf-8"))) {
            for (String reaction : firstPersonPositiveRudeReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    private void saveHappyReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/2ndPersonHappy.txt"),
                "utf-8"))) {
            for (String reaction : happyReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    private void saveSadReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/2ndPersonSad.txt"),
                "utf-8"))) {
            for (String reaction : sadReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    private void saveAngryReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/2ndPersonAngry.txt"),
                "utf-8"))) {
            for (String reaction : angryReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    private void saveConfusedReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/2ndPersonConfused.txt"),
                "utf-8"))) {
            for (String reaction : confusedReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    private void save3rdPersonReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/3rdPerson.txt"),
                "utf-8"))) {
            for (String reaction : thirdPersonReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    private void saveHelloReactions() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("resources/reactions/hello.txt"),
                "utf-8"))) {
            for (String reaction : helloReactions) {
                writer.write(reaction);
                writer.newLine();
            }
            writer.close();
        } catch (Exception ex) {
        }
    }

    /**
     * Returns the feeling generated by the latest text received from the user
     * 
     * @return Returns last generated feeling (happy, sad, angry, confused, normal)
     */
    public String getLastReaction() {
        return lastReaction;
    }

    private String getHappyReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(happyReactions.size());
        while (reactionNumber == lastHappyReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(happyReactions.size());
        }
        lastHappyReactionNumber = reactionNumber;
        return happyReactions.get(reactionNumber);
    }

    private String getSadReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(sadReactions.size());
        while (reactionNumber == lastSadReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(sadReactions.size());
        }
        lastSadReactionNumber = reactionNumber;
        return sadReactions.get(reactionNumber);
    }

    private String getAngryReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(angryReactions.size());
        while (reactionNumber == lastAngryReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(angryReactions.size());
        }
        lastAngryReactionNumber = reactionNumber;
        return angryReactions.get(reactionNumber);
    }

    private String getConfusedReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(confusedReactions.size());
        while (reactionNumber == lastConfusedReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(confusedReactions.size());
        }
        lastConfusedReactionNumber = reactionNumber;
        return confusedReactions.get(reactionNumber);
    }

    private String getFirstPersonPositiveRudeReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(firstPersonPositiveRudeReactions.size());
        while (reactionNumber == lastFirstPersonPositiveRudeReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(firstPersonPositiveRudeReactions.size());
        }
        lastFirstPersonPositiveRudeReactionNumber = reactionNumber;
        return firstPersonPositiveRudeReactions.get(reactionNumber);
    }

    private String getFirstPersonNegativeRudeReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(firstPersonNegativeRudeReactions.size());
        while (reactionNumber == lastFirstPersonNegativeRudeReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(firstPersonNegativeRudeReactions.size());
        }
        lastFirstPersonNegativeRudeReactionNumber = reactionNumber;
        return firstPersonNegativeRudeReactions.get(reactionNumber);
    }

    private String getFirstPersonPositivePoliteReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(firstPersonPositivePoliteReactions.size());
        while (reactionNumber == lastFirstPersonPositivePoliteReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(firstPersonPositivePoliteReactions.size());
        }
        lastFirstPersonPositivePoliteReactionNumber = reactionNumber;
        return firstPersonPositivePoliteReactions.get(reactionNumber);
    }

    private String getFirstPersonNegativePoliteReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(firstPersonNegativePoliteReactions.size());
        while (reactionNumber == lastFirstPersonNegativePoliteReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(firstPersonNegativePoliteReactions.size());
        }
        lastFirstPersonNegativePoliteReactionNumber = reactionNumber;
        return firstPersonNegativePoliteReactions.get(reactionNumber);
    }

    private String getThirdPersonReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(thirdPersonReactions.size());
        while (reactionNumber == lastThirdPersonReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(thirdPersonReactions.size());
        }
        lastThirdPersonReactionNumber = reactionNumber;
        return thirdPersonReactions.get(reactionNumber);
    }

    private String getHelloReaction() {
        int reactionNumber = randomNumberGenerator.nextInt(helloReactions.size());
        while (reactionNumber == lastHelloReactionNumber) {
            reactionNumber = randomNumberGenerator.nextInt(helloReactions.size());
        }
        lastHelloReactionNumber = reactionNumber;
        return helloReactions.get(reactionNumber);
    }

    private String getReaction(String reactionType) {
        String output;
        switch (reactionType) {
            case "happy":
                output = getHappyReaction();
                break;
            case "sad":
                output = getSadReaction();
                break;
            case "angry":
                output = getAngryReaction();
                break;
            case "firstPersonPositiveRude":
                output = getFirstPersonPositiveRudeReaction();
                break;
            case "firstPersonPositivePolite":
                output = getFirstPersonPositivePoliteReaction();
                break;
            case "firstPersonNegativeRude":
                output = getFirstPersonNegativeRudeReaction();
                break;
            case "firstPersonNegativePolite":
                output = getFirstPersonNegativePoliteReaction();
                break;
            case "thirdPerson":
                output = getThirdPersonReaction();
                break;
            case "hello":
                output = getHelloReaction();
                break;
            default:
                output = getConfusedReaction();
        }
        return output;
    }

    private boolean isLetter(char input) {
        if (input >= 'a' && input <= 'z') {
            return true;
        } else if (input >= 'A' && input <= 'Z') {
            return true;
        } else if (input == '\'' || input == '-') {
            return true;
        }
        return false;
    }

    private boolean isSeparator(char input) {
        if (input == '.') {
            return true;
        }
        if (input == ',') {
            return true;
        }
        if (input == ' ') {
            return true;
        }
        if (input == '\n') {
            return true;
        }
        if (input == ';') {
            return true;
        }
        if (input == ':') {
            return true;
        }
        if (input == '!') {
            return true;
        }
        if (input == '?') {
            return true;
        }
        if (input == '<') {
            return true;
        }
        if (input == '>') {
            return true;
        }
        if (input == '{') {
            return true;
        }
        if (input == '}') {
            return true;
        }
        if (input == '[') {
            return true;
        }
        if (input == ']') {
            return true;
        }
        if (input == '_') {
            return true;
        }
        if (input == '(') {
            return true;
        }
        if (input == ')') {
            return true;
        }
        return input == '\"';
    }

    private String getFirstWord(String text) {
        StringBuilder word = new StringBuilder();
        boolean foundFirstLetter = false;
        for (int i = 0; i < text.length() && (!isSeparator(text.charAt(i))
                || !foundFirstLetter); i++) {
            if (isLetter(text.charAt(i))) {
                word.append(text.charAt(i));
                foundFirstLetter = true;
            }
        }
        return word.toString();
    }

    private int getNumberOfWords(String input) {
        int output = 0;
        for (int i = 1; i < input.length(); i++) {
            if (isSeparator(input.charAt(i)) && isLetter(input.charAt(i - 1))) {
                output++;
            }
        }
        if (isLetter(input.charAt(input.length() - 1))) {
            output++;
        }
        return output;
    }

    private boolean isNegationWord(String word) {
        return negationWords.contains(word.toLowerCase());
    }

    private boolean isHappyWord(String word) {
        return happyWords.contains(word.toLowerCase());
    }

    private boolean isSadWord(String word) {
        return sadWords.contains(word.toLowerCase());
    }

    private boolean isAngryWord(String word) {
        return angryWords.contains(word.toLowerCase());
    }

    private boolean isReactionWord(String word) {
        return isHappyWord(word) || isSadWord(word) || isAngryWord(word);
    }

    private boolean isHelloWord(String word) {
        return helloWords.contains(word.toLowerCase());
    }

    private boolean isSentenceNegated() {
        String word;
        for (int i = processedWords.size() - 2; i >= 0 && !isReactionWord(processedWords.get(i)); i--) {
            word = processedWords.get(i);
            if (isNegationWord(word)) {
                return true;
            }
        }
        return false;
    }

    private boolean inputHasGreeting() {
        String word;
        for (int i = 0; i < processedWords.size(); i++) {
            word = processedWords.get(i);
            if (isHelloWord(word)) {
                return true;
            }
        }
        return false;
    }

    private String getFilteredInput(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (isLetter(input.charAt(i)) || isSeparator(input.charAt(i))) {
                output.append(input.charAt(i));
            }
        }
        return output.toString();
    }

    private String getLastSentence() {
        StringBuilder output = new StringBuilder(processedWords.get(processedWords.size() - 1));
        for (int i = processedWords.size() - 2; i >= 0
                && !isReactionWord(processedWords.get(i)); i--) {
            output = new StringBuilder(processedWords.get(i)).append(output);
        }
        return output.toString();
    }

    // detects if user is talking in first, second person or third.
    // if no person is detected, the AI assumes the user is talking about it
    private int detectPerson() {
        for (int i = processedWords.size() - 1; i >= 0; i--) {
            if (thirdPersonWords.contains(processedWords.get(i).toLowerCase())) {
                return 3;
            }
            if (secondPersonWords.contains(processedWords.get(i).toLowerCase())) {
                return 2;
            }
            if (firstPersonWords.contains(processedWords.get(i).toLowerCase())) {
                return 1;
            }
        }
        return 2;
    }

    private String generateReaction(boolean reactionFound) {
        // decide the final reaction based on most often generated reactions
        String output;
        output = getReaction("confused");
        lastReaction = "confused";

        if (reactionFound) {
            if (detectPerson() == 2) {
                System.out.println("If is accessed");
                if (reactionCount[0] > reactionCount[1]
                        && reactionCount[0] > reactionCount[2]) {
                    output = getReaction("happy");
                    lastReaction = "happy";
                }
                if (reactionCount[1] > reactionCount[0]
                        && reactionCount[1] > reactionCount[2]) {
                    output = getReaction("sad");
                    lastReaction = "sad";
                }
                if (reactionCount[2] > reactionCount[0]
                        && reactionCount[2] > reactionCount[1]) {
                    output = getReaction("angry");
                    lastReaction = "angry";
                }

                if (reactionCount[0] == reactionCount[1]
                        && reactionCount[0] == reactionCount[2]) {
                    if (globalReactionCount[0] >= globalReactionCount[1]) {
                        if (globalReactionCount[0] >= globalReactionCount[2]) {
                            output = getReaction("happy");
                            lastReaction = "happy";
                        }
                        if (globalReactionCount[0] < globalReactionCount[2]) {
                            output = getReaction("angry");
                            lastReaction = "angry";
                        }
                    } else {
                        if (globalReactionCount[1] >= globalReactionCount[2]) {
                            output = getReaction("sad");
                            lastReaction = "sad";
                        }
                        if (globalReactionCount[1] < globalReactionCount[2]) {
                            output = getReaction("angry");
                            lastReaction = "angry";
                        }
                    }
                }

                if (reactionCount[0] == reactionCount[1]
                        && reactionCount[0] != 0
                        && reactionCount[0] != reactionCount[2]) {
                    if (globalReactionCount[0] >= globalReactionCount[1]) {
                        output = getReaction("happy");
                        lastReaction = "happy";
                    } else {
                        output = getReaction("sad");
                        lastReaction = "sad";
                    }
                }

                if (reactionCount[0] == reactionCount[2]
                        && reactionCount[0] != 0
                        && reactionCount[0] != reactionCount[1]) {
                    if (globalReactionCount[0] >= globalReactionCount[2]) {
                        output = getReaction("happy");
                        lastReaction = "happy";
                    } else {
                        output = getReaction("angry");
                        lastReaction = "angry";
                    }
                }

                if (reactionCount[1] == reactionCount[2]
                        && reactionCount[1] != 0
                        && reactionCount[1] != reactionCount[0]) {
                    if (globalReactionCount[1] >= globalReactionCount[2]) {
                        output = getReaction("sad");
                        lastReaction = "sad";
                    } else {
                        output = getReaction("angry");
                        lastReaction = "angry";
                    }
                }
                // If the user is talking about himself/herself
            } else if (detectPerson() == 1) {
                // If the user is not talking about the AI, the global reaction
                // score is not affected
                for (int i = 0; i < reactionCount.length; i++) {
                    globalReactionCount[i] -= reactionCount[i];
                }
                if (reactionCount[0] >= reactionCount[1] + reactionCount[2]) {
                    if (globalReactionCount[0] >= globalReactionCount[1]
                            + globalReactionCount[2]) {
                        output = getReaction("firstPersonPositivePolite");
                        lastReaction = "happy";
                    } else {
                        output = getReaction("firstPersonPositiveRude");
                        lastReaction = "angry";
                    }
                } else {
                    if (globalReactionCount[0] >= globalReactionCount[1]
                            + globalReactionCount[2]) {
                        output = getReaction("firstPersonNegativePolite");
                        lastReaction = "happy";
                    } else {
                        output = getReaction("firstPersonNegativeRude");
                        lastReaction = "angry";
                    }
                }
                // If the user is talking about someone other than himself/herself
                // and the AI
            } else if (detectPerson() == 3) {
                // If the user is not talking about the AI, the global reaction
                // score is not affected
                for (int i = 0; i < reactionCount.length; i++) {
                    globalReactionCount[i] -= reactionCount[i];
                }
                output = getReaction("thirdPerson");
                lastReaction = "normal";
            }
        } else {
            if (inputHasGreeting()) {
                output = getReaction("hello");
                lastReaction = "happy";
            }
        }
        return output;
    }

    /**
     * Keeps score of words that generate reactions. Returns appropiate text response.
     * 
     * @param originalInput The text given by the user
     * @return Text response based on the input
     */
    public String analyseText(String originalInput) {
        processedWords = new ArrayList<>();
        boolean reactionFound = false;
        String input = getFilteredInput(originalInput);
        String word, auxWord;
        int numberOfWords = getNumberOfWords(input);
        // position 0 is for happy, 1 is for sad, and 2 is for angry
        reactionCount = new int[3];
        for (int i = 0; i < numberOfWords; i++) {
            word = getFirstWord(input);
            processedWords.add(word);
            input = input.substring(word.length());

            // formatting the text
            if (i < numberOfWords - 1) {
                auxWord = getFirstWord(input);
                input = input.substring(input.indexOf(auxWord));
            }

            if (isHappyWord(word)) {
                reactionFound = true;
                System.out.println("\nPerson: " + detectPerson());
                reactionCount[0]++;
                globalReactionCount[0]++;
                if (isSentenceNegated()) {
                    reactionCount[0]--;
                    reactionCount[1]++;
                    globalReactionCount[0]--;
                    globalReactionCount[1]++;
                }
            } else if (isSadWord(word)) {
                reactionFound = true;
                System.out.println("\nPerson: " + detectPerson());
                reactionCount[1]++;
                globalReactionCount[1]++;
                if (isSentenceNegated()) {
                    reactionCount[1]--;
                    reactionCount[0]++;
                    globalReactionCount[1]--;
                    globalReactionCount[0]++;
                }
            } else if (isAngryWord(word)) {
                reactionFound = true;
                System.out.println("\nPerson: " + detectPerson());
                reactionCount[2]++;
                globalReactionCount[2]++;
                if (isSentenceNegated()) {
                    reactionCount[2]--;
                    reactionCount[0]++;
                    globalReactionCount[2]--;
                    globalReactionCount[0]++;
                }
            }
        }

        System.out.print("\nglobal reaction count: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(globalReactionCount[i] + " ");
        }
        System.out.print("\nreaction count: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(reactionCount[i] + " ");
        }
        System.out.println();

        return generateReaction(reactionFound);
    }
}
