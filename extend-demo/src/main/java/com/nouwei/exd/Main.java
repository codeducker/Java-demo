package com.nouwei.exd;

import com.nouwei.exd.inter.*;
import com.nouwei.exd.inter.impl.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
    //    List<Animal> animals = new ArrayList<Dog>();
        // Animal[] animals = new Dog[10];
        // animals[0] = new Dog();
        // animals[1] = new Cat();

       int[][] ab = new int[2][3];
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[i].length; j++) {
                System.out.print(ab[i][j]);
            }
            System.out.println("");
        }

        // GetAnimal(new ArrayList<Dog>(0));
    }

    public static void GetAnimal(List<? extends Animal> animals){
        animals.contains(new Dog());
        animals.remove(new Cat());
        // animals.add(0, new Dog());
    }
}