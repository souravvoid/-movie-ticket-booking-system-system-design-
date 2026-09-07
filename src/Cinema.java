// ================= FILE: Cinema.java =================
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    // OOP Concept: Composition (Cinema owns its Screens, created and managed internally)
    private String name;
    private List<Screen> screens;

    // OOP Concept: this keyword (distinguishes instance field from parameter)
    public Cinema(String name) {
        this.name = name;
        this.screens = new ArrayList<>();
    }

    public Screen createScreen(int screenNumber) {
        Screen screen = new Screen(screenNumber);
        this.screens.add(screen);
        return screen;
    }

    public List<Screen> getScreens() {
        return this.screens;
    }

    public String getName() {
        return this.name;
    }
}