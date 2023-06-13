public enum StudentType {
    FULL_TIME("Full-time student"),
    PART_TIME("Part-time student"),
    DEGREE_APPRENTICE("Degree apprentice");

    private final String description;

    StudentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
