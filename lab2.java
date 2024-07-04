public class lab2 {

    private String name;
    private int maxHealth;
    private int level;
    private int exp;

    public lab2(String name) {
        this.name = name;
        this.maxHealth = 100;
        this.level = 1;
        this.exp = 0;
    }

    public void setExp(int exp) {
        this.exp += exp;
        checkLevelUp();
    }

    public void displayInfo() {
        System.out.println("*** Status ***********");
        System.out.println("Name: " + name);
        System.out.println("Max Health: " + maxHealth);
        System.out.println("Level: " + level);
        System.out.println("Current Exp: " + exp);
    }

    private void checkLevelUp() {
        int requiredExp = level * 1000;
        if (exp >= requiredExp) {
            level++;
            maxHealth += 100;
            System.out.println("Level Up! Level: " + level);
        }
    }

    public static void main(String[] args) {
        lab2 character = new lab2("Sofia");

        character.displayInfo();

        character.setExp(100);
        character.displayInfo();

        character.setExp(1000);
        character.displayInfo();
    }
}




