package main;
import packageone.ClassOne;
import packagetwo.ClassTwo;
import packagethree.ClassThree;

public class MainLab {
    public static void main(String[] args){
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();
        System.out.println(classOne.greet());
        System.out.println(classTwo.greet());
        System.out.println(classThree.greet());

    }
}
