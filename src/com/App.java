package com;

import java.util.Scanner;

import com.stack.*;
import com.resources.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean running = true;
        Stack<Integer> stack = new Stack<Integer>();
        
        while (running) {
            
            String[] options = { "Show items and find stack length", "Insert item", "Drop item", "Clear", "Close" };

            System.out.println("- Top: " + stack.getTop());
            System.out.println("- What do you want to do?");

            for (int index = 0; index < options.length; index++) {
                System.out.println("\t[" + (index + 1) + "] " + options[index]);
            }

            int optionMenu = ScannerImproved.nextInt("$ ");

            switch (optionMenu) {
                case 1:
                    StackIterator<Integer> stackIterator = new StackIterator<Integer>(stack);
                    System.out.println("[1] (" + stack.getSize() + ")" + stackIterator.run());
                    break;
                case 2:
                    int newItem = ScannerImproved.nextInt("[2] Choose the number to add: ");
                    stack.push(newItem);
                    System.out.println("[2] " + newItem + " has been successfully added!");
                    break;
                case 3:
                    Integer oldItem = stack.pop();
                    System.out.println("[3] " + (
                        (oldItem == null) ? "The stack could not remove the item because the stack is empty" : oldItem + " has been successfully removed from the stack!")
                    );
                    break;
                case 4:
                    int oldSize = stack.getSize();
                    stack.clear();
                    System.out.println("[4] " + oldSize + " items have been removed from the stack!");
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    break;
            }

            for (int index = 0; index < 100; index++) System.out.print('-');
            System.out.println();

        }

    }
}