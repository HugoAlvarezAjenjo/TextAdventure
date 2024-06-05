package es.hugoalvarezajenjo.textadventure.model;

public class Story {
    private String storyName;
    private String storyOption1;
    private String storyOption2;
    private String storyOption3;
    private String storyOption4;

    public Story(final String storyName, final String storyOption1, final String storyOption2, final String storyOption3, final String storyOption4) {
        this.storyName = storyName;
        this.storyOption1 = storyOption1;
        this.storyOption2 = storyOption2;
        this.storyOption3 = storyOption3;
        this.storyOption4 = storyOption4;
    }

    public String[] getChoices() {
        final String[] choices = new String[4];
        choices[0] = storyOption1;
        choices[1] = storyOption2;
        choices[2] = storyOption3;
        choices[3] = storyOption4;
        return choices;
    }

    public String getName() {
        return this.storyName;
    }

    public Story makeChoice(final String choice) {
        return null;
    }
}
