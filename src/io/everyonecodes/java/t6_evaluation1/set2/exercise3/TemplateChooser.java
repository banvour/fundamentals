package io.everyonecodes.java.t6_evaluation1.set2.exercise3;

public class TemplateChooser {

    public String choose(String name) {
        if (name.trim().isEmpty()) {
            return "default";
        }
        if (name.contains("Hokopoko")) {
            return "privileged";
        }
        if (name.startsWith("Ms.") || name.startsWith("Mrs.")) {
            return "female";
        }
        if (name.startsWith("Mr.")) {
            return "male";
        }
        return "default";
    }
}
