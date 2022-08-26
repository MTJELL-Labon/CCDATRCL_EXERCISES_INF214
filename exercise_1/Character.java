public class Character {
    // Character attributes
    int strength;
    int agility;
    int intelligence;
    String name;
    String quotes;

    // Character method
    public void sayMyName() {
        System.out.println("\nThe names " + name);
        System.out.println("Quote: " + quotes);
        System.out.println("\nStrength: " + strength + "\nAgility: " + agility + "\nIntelligence: " + intelligence);
    }
}
