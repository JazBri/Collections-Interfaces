package com.company;

import com.company.exercice1.ListClass;
import com.company.exercice1.ListMap;
import com.company.exercice1.ListSet;
import com.company.exercise2.Species;
import com.company.exercise2.Dog;
import com.company.exercise2.Human;
import com.company.exercise2.Marathon;
import com.company.exercise2.Robot;
import com.company.exercise2.ISprintable;
import java.util.ArrayList;
import java.util.List;

import static com.company.exercise3.Exercise3.removeEvenLength;
import static com.company.exercise3.Exercise3.showEvenLength;
import static com.company.exercise4.Lists.sortArray;

public final class Exercises {
    public static void showFirstExercise(){
        //ArrayList
        ListClass listInteger = new ListClass();
        //Add
        listInteger.addNumber(8);
        listInteger.addNumber(9);
        listInteger.addNumber(5);
        listInteger.addNumber(7);
        //Show
        System.out.println(listInteger.getListInteger());
        //Delete
        listInteger.deleteNumber(9);
        System.out.println(listInteger.getListInteger());
        System.out.println(listInteger.toString());
        //Iterate
        System.out.println("For Each");
        listInteger.iterateForEach();
        System.out.println("For");
        listInteger.iterateFor();
        //Sort
        System.out.println("Sort");
        listInteger.sortArray();
        listInteger.iterateFor();
        //Reverse
        System.out.println("Reverse");
        listInteger.reverseArray();
        listInteger.iterateForEach();

        //HashMap
        ListMap listMap = new ListMap();
        //Add
        listMap.putMap(2, "Two");
        listMap.putMap(1, "One");
        listMap.putMap(3, "Tree");
        //Show
        System.out.println(listMap.getMapInteger());
        //Delete
        listMap.deleteForKey(1);
        System.out.println(listMap.getMapInteger());
        //Iterate
        System.out.println("Arrow");
        listMap.iterateArrow();
        System.out.println("Entry");
        listMap.iterateEntry();
        //Sort
        //Reverse

        //TreeSet
        ListSet listSet = new ListSet();
        //Add
        listSet.addSet(52);
        listSet.addSet(8);
        listSet.addSet(7);
        listSet.addSet(52);
        listSet.addSet(4);
        //Show
        System.out.println(listSet.getSetList());
        //Delete
        listSet.deleteSet(8);
        System.out.println(listSet.getSetList());
        //Iterate
        System.out.println("For Each");
        listSet.iterateForEach();
        System.out.println("Iterator");
        listSet.iterateIterator();
        //Sort
        //Reverse
    }

    public static void showSecondExercise(){
        Dog dog = new Dog();
        Human human = new Human();
        Robot robot = new Robot();
        Marathon marathon = new Marathon();
        marathon.addSpecies(dog);
        marathon.addSpecies(human);
        marathon.addSpecies(robot);
        marathon.getList();
    }

    public static void showThirdExercise(){
        ArrayList<String> arrayString = new ArrayList<>();
        arrayString.add("Dog");
        arrayString.add("Mouse");
        arrayString.add("Omen");
        arrayString.add("Matilda");
        arrayString.add("Stitch");

        System.out.println("Before");
        showEvenLength(arrayString);

        System.out.println("\nTo remove");
        removeEvenLength(arrayString);

        System.out.println("\nAfter");
        showEvenLength(arrayString);
    }

    public static void showFourthExercise(){
        List<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(0);
        arrayInteger.add(5);
        arrayInteger.add(6);
        arrayInteger.add(2);
        arrayInteger.add(3);

        sortArray(20, arrayInteger);
    }
}
