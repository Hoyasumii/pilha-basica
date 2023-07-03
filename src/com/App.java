package com;

import java.util.Scanner;
import com.stack.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        
        while (running) {
            
            String[] options = { "Insert item", "Drop item", "Clear", "Close" };

            System.out.println("- Top: " + stack.getTop());
            System.out.println("- Size: " + stack.getSize());
            System.out.println("- What do you want to do?");

            for (int index = 0; index < options.length; index++) {
                System.out.println("\t[" + (index + 1) + "] " + options[index]);
            }

            System.out.print("$ ");
            int optionMenu = scanner.nextInt();

            switch (optionMenu) {
                case 1:
                    System.out.print("[1] Choose the number to add: ");
                    int newItem = scanner.nextInt();
                    stack.push(newItem);
                    System.out.println("[1] " + newItem + " has been successfully added!");
                    break;
                case 2:
                    int oldItem = stack.pop();
                    System.out.println("[2] " + oldItem + " has been successfully removed from stack!");
                    break;
                case 3:
                    int oldSize = stack.getSize();
                    stack.clear();
                    System.out.println("[3] " + oldSize + " items have been removed from the stack!");
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Valor padrão");
                    break;
            }

            for (int index = 0; index < 100; index++) System.out.print('-');
            System.out.println();

        }

        scanner.close();


    }
}