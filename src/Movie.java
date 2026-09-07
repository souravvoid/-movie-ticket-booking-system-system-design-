// ================= FILE: Movie.java =================
public class Movie {

    // OOP Concept: Encapsulation (fields are private, exposed via getters)
    private String title;
    private String language;
    private int durationInMinutes;

    // OOP Concept: this keyword (distinguishes instance field from parameter)
    public Movie(String title, String language, int durationInMinutes) {
        this.title = title;
        this.language = language;
        this.durationInMinutes = durationInMinutes;
    }

    public String getTitle() {
        return this.title;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }
}