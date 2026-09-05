
public class Movie {
    private String title;
    private String language;
    private int durationInMinutes; 

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

    public void displayDetails() {
        System.out.println(this.title + " (" + this.language + ", " + this.durationInMinutes + " mins)");
    }
}