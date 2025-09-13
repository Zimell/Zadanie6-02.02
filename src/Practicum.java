import .shapes.Circle;
import .shapes.Ellipse;
import .shapes.Rectangle;
import .shapes.Square;
import .soup.machine.*;
import animalsounds.*;
import Q.Texla.*;

public class Practicum {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        threeTask();
        FourthTask.decision();
        fivethTask();
    }

    static void firstTask(){
        var circle = new Circle();
        var square = new Square();
        var rectangle = new Rectangle();
        var ellipse = new Ellipse();
        circle.drawCircle();
        square.drawSquare();
        rectangle.drawRectangle();
        ellipse.drawCircle();
        ellipse.circleToEllipse();
    }

    static void secondTask(){
        ModelQ testCar = new ModelQ();

        System.out.println("Характеристики модели:");
        System.out.println("Ускорение: " + testCar.acceleration + " км/(ч*с)");
        System.out.println("Максимальная скорость: " + testCar.maxSpeed + " км/ч");
        // Символ \n позволяет оставлять пустую строку в консоли
        System.out.println("\nНачало теста!");
        System.out.println("Количество колёс: " + testCar.wheelsNumber);

        testCar.turnTo("Север");
        System.out.println("Направление: " + testCar.direction);
        System.out.println("Едем на автопилоте:");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.println("Скорость Q спустя 5с на автопилоте: " + testCar.speed + " км/ч");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.println("Скорость Q спустя ещё 5с на автопилоте: " + testCar.speed + " км/ч");

        System.out.println("Переходим в ручной режим:");
        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.println("Скорость Q спустя 2с в ручном режиме: " + testCar.speed + " км/ч");
        System.out.println("Проверяем торможение:");
        int brakingTime = 0;
        while (testCar.speed > 0) {
            testCar.brake();
            brakingTime++;
        }
        System.out.println("Время торможения до полной остановки: " + brakingTime + "c");
    }

    static void threeTask(){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Mouse mouse = new Mouse();
        Cow cow = new Cow();
        Duck duck = new Duck();
        Elephant elephant = new Elephant();
        Fish fish = new Fish();
        Frog frog = new Frog();
        Seal seal = new Seal();
        System.out.println("Dog goes " + dog.say());
        System.out.println("Cat goes " + cat.say());
        System.out.println("Bird goes " + bird.say());
        System.out.println("And mouse goes " + mouse.say());
        System.out.println("Cow goes " + cow.say());
        System.out.println("Frog goes " + frog.say());
        System.out.println("And the elephant goes " + elephant.say());
        System.out.println("Ducks say " + duck.say());
        System.out.println("And fish go " + fish.say());
        System.out.println("And the seal goes " + seal.say());
    }

    static void fivethTask(){
        System.out.println("Готовим основу:");
        SoupBase soupBase = new SoupBase(2, 5);
        soupBase.printIngredients();

        System.out.println("\nИз основы приготовим вегетарианский суп и бульон:");
        Bouillon bouillon = new Bouillon(soupBase, 300);
        bouillon.printIngredients();
        VegetarianSoup vegetarianSoup = new VegetarianSoup(soupBase, 200);
        vegetarianSoup.printIngredients();

        System.out.println("\nПриготовим вегетарианский суп с нуля");
        VegetarianSoup vegetarianSoupWithoutBase = new VegetarianSoup(1.5, 5, 200);
        vegetarianSoupWithoutBase.printIngredients();

        System.out.println("\nПриготовим другой бульон для картофельного супа:");
        Bouillon anotherBouillon = new Bouillon(5, 10, 800);
        anotherBouillon.printIngredients();

        System.out.println("\nИз этого бульона приготовим суп с картошкой:");
        PotatoSoup potatoSoup = new PotatoSoup(anotherBouillon, 4, 1);
        potatoSoup.printIngredients();

        System.out.println("\nСуп с картошкой можно приготовить и из суповой основы:");
        PotatoSoup potatoSoupFromBase = new PotatoSoup(soupBase, 200, 3, 0);
        potatoSoupFromBase.printIngredients();

        System.out.println("\nА можно и совсем с нуля:");
        PotatoSoup totallyNewPotatoSoup = new PotatoSoup(5, 10, 400, 5, 1);
        totallyNewPotatoSoup.printIngredients();
    }
}