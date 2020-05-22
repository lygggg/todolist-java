package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            Scanner selectNumber = new Scanner(System.in);
            TodoListView.instruction();
            int Number = selectNumber.nextInt();
            if(Number == 7) { break; }
            Select.select(Number);

        }
    }
}