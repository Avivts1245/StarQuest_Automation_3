package app.netlify.star_quest.StarQuestAutomation;

public class Main {
    public static void main(String[] args) {
        StarQuestTests starQuestTests = new StarQuestTests(ChromeDriverSetup.getInitialDriverSetup());
       starQuestTests.init();
    }
}