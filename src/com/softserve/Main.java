package com.softserve;

//https://objectone.ru/java/for-geometricheskie-figury-s-pomoshhyu-ciklov/

public class Main {
    public static void main(String[] args) {
        int numberOfRows = 5;
        for (int i = 0; i < numberOfRows; i++){

            //Левое пустое пространство
            for (int j = numberOfRows; j > i; j--){
                System.out.print(" ");
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++){ //Здесь можно изменить счётчик или поставить равенство с внешним счётчиком что бы пирамидка была остроугольная
                System.out.print("*");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }

            //Правое пустое пространство
            for (int j = numberOfRows; j > i; j--){
                System.out.print(" ");
            }

            System.out.println("*"+i);
        }
      }
}








