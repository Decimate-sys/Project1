//yunis khamis, 2/3/20, CSCI 1660
package com.company.Khamis;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<String>();



        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {
                case 4:
                    showList(items);
                    break;
                case 1:
                    String task = addItem();
                    items.add(task);
                    break;
                case 2:
                    int item = removeItem();
                    items.remove(item);
                    break;
                case 3:
                    int list = updateItem();
                    String changedItem = input.nextLine();
                    items.set(list, changedItem);
                case 0:
                    break;
                default:
                    System.out.println("Don't r`ecognize input. ");

            }
        }
    }

    static int menu() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("\nMain Menu\n");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. Update a task");
        System.out.println("4. List all tasks");
        System.out.println("0. Exit");
        System.out.println();
        System.out.println("Enter a choice: ");
        choice = input.nextInt();
        return choice;
    }

    static void showList(ArrayList<String> a) {
        System.out.println("\nTo-do List\n");
        System.out.println(a);

        }


    static String addItem() {

        Scanner input = new Scanner(System.in);
        System.out.println("which item do you want to add?");
        String choice = input.next();
        return choice;

        }



    static int removeItem() {


        Scanner input = new Scanner(System.in);
        System.out.println("which item do you want to remove?");
        int choice = input.nextInt();
        return choice;

    }
   static int updateItem() {
       Scanner input = new Scanner(System.in);
       System.out.println("which item do you want to update?");
       int choice = input.nextInt();
       return choice;
    }
    private static  ArrayList<String> items = new ArrayList<String>();




}
