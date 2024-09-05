// Write a Java Program to create a base class Animal having properties: consume 
// food, capable of motion. Two subclasses Mammal and Reptile having features: 
// covered with hairs and feed breast milk to its infants, can crawl, have scales and 
// cold blooded respectively. Show the properties of Human and cow for Mammal 
// category, snake and crocodile for reptile category adding one new feature for each 
// of the classes.

class Animal {
    void consumeFood() {
        System.out.println("Eats food");
    }

    void motion() {
        System.out.println("Moves");
    }
}

class Mammal extends Animal {
    void coveredWithHairs() {
        System.out.println("Covered with hairs");
    }

    void feedBreastMilk() {
        System.out.println("Feeds breast milk to infants");
    }
}

class Reptile extends Animal {
    void crawl() {
        System.out.println("Crawls");
    }

    void haveScales() {
        System.out.println("Has scales");
    }

    void coldBlooded() {
        System.out.println("Cold-blooded");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Speaks");
    }
}

class Cow extends Mammal {
    void produceMilk() {
        System.out.println("Produces milk");
    }
}

class Snake extends Reptile {
    void venomous() {
        System.out.println("Venomous");
    }
}

class Crocodile extends Reptile {
    void aquatic() {
        System.out.println("Aquatic");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Human human = new Human();
        Cow cow = new Cow();
        Snake snake = new Snake();
        Crocodile crocodile = new Crocodile();

        System.out.println("\nHUMAN:");
        human.coveredWithHairs();
        human.feedBreastMilk();
        human.consumeFood();

        System.out.println("\nCOW:");
        cow.produceMilk();
        cow.motion();

        System.out.println("\nSNAKE:");
        snake.coldBlooded();
        snake.crawl();
        snake.venomous();

        System.out.println("\nCROCODILE:");
        crocodile.aquatic();
        crocodile.coldBlooded();
        crocodile.consumeFood();
    }
}
