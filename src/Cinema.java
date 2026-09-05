import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String cinemaName;
    // OOP Concept: Composition (Cinema owns its Screens)
    private List<Screen> screens;

    public Cinema(String cinemaName) {
        this.cinemaName = cinemaName;
        this.screens = new ArrayList<>();
    }

    public void addScreen(Screen screen) {
        this.screens.add(screen);
    }

    public List<Screen> getScreens() {
        return this.screens;
    }

    public String getCinemaName() {
        return this.cinemaName;
    }
}