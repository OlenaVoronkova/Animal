class Animal{
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Sound of animal");
    }
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years old.");
    }
}
class Dog extends Animal {
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("bark");
    }

    public void displayDogInfo() {
        displayInfo();
        System.out.println("Breed: " + breed);
    }
}