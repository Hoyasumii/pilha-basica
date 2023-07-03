package com;

import java.util.Scanner;
import com.stack.*;

// TODO: Fazer um modificador para a classe Scanner, parecido com o Console.ReadLine; entretanto, caso eu coloque um tipo que seja diferente do desejado, ao invés do programa resultar um erro, ele só irá mostrar novamente a pergunta

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        
        while (running) {
            
            String[] options = { "Show items and find stack length", "Insert item", "Drop item", "Clear", "Close" };

            System.out.println("- Top: " + stack.getTop());
            System.out.println("- What do you want to do?");

            for (int index = 0; index < options.length; index++) {
                System.out.println("\t[" + (index + 1) + "] " + options[index]);
            }

            System.out.print("$ ");
            int optionMenu = scanner.nextInt();

            switch (optionMenu) {
                case 1:
                    StackIterator<Integer> stackIterator = new StackIterator<Integer>(stack);
                    System.out.println("[1] (" + stack.getSize() + ")" + stackIterator.run());
                    break;
                case 2:
                    System.out.print("[2] Choose the number to add: ");
                    int newItem = scanner.nextInt();
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
                    System.out.println("[*] enter a valid value.");
                    break;
            }

            for (int index = 0; index < 100; index++) System.out.print('-');
            System.out.println();

        }

        scanner.close();

    }
}