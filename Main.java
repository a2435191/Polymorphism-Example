public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.say(); // woof!

        Cat cat1 = new Cat();
        cat1.say(); // meow!
        
        Pet cat2 = new Cat();
        cat2.say(); // meow!

        Pet[] pets = new Pet[] {dog1, cat1, new Dog(), new Cat(), new Cat()};
        for (int i = 0; i < pets.length; i++) {
            Pet pet = pets[i]; // we don't know if it's a Dog or Cat, ...
            pet.say(); // but the say() method works anyway!
        }
        /*
          woof!
          meow!
          woof!
          meow!
          meow!
        */
    }
}
