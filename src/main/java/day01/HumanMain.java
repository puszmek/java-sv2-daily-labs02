package day01;

public class HumanMain {

    public static void main(String[] args) {
        Human human = new Human("Bill", 12);

        new Human("Jack", 56);

        System.out.println(human.getName());
        System.out.println(human.getAge());
    }
}
