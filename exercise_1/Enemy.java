public class Enemy {
    // Enemy attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunity;
    String name;
    String quotes;

    // Enemy method
    public void enemyDialogue() {
        System.out.println("\nFear me player for my name is " + name + " and I deal " + damage + " damage!");
        System.out.println ("Taunt: " + quotes);
    }
}
