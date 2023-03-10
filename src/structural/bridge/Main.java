package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Theme theme = new DarkTheme();

        About about = new About(theme);
        Careers careers = new Careers(theme);

        System.out.println(about.getContent());
        System.out.println(careers.getContent());
    }
}