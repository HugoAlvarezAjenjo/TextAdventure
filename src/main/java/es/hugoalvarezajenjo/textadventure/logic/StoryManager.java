package es.hugoalvarezajenjo.textadventure.logic;

import es.hugoalvarezajenjo.textadventure.model.Story;

public class StoryManager {
    private Story story;

    public StoryManager() {
        this.story = new Story("StoryTitle :)", "op1", "op2", "op3", "op4");
    }

    public String getStoryTitle() {
        return this.story.getName();
    }

    public String[] getStoryChoices() {
        return this.story.getChoices();
    }

    public boolean makeChoice(final String choice) {
        if (choice.isEmpty()) {
            return false;
        }
        final Story nextStory = this.story.makeChoice(choice);
        if (nextStory != null) {
            this.story = nextStory;
            return true;
        }
        return false;
    }
}
