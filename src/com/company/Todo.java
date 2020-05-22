package com.company;

import java.util.ArrayList;
import java.util.List;

public class Todo {
     static List<Object> TaskList = new ArrayList<Object>();
     static List<Object> TaskFinishList = new ArrayList<Object>();

    public static void addTodo(String input) {
        TaskList.add(input);
        TodoListView.todoListView(TaskList, TaskFinishList);
    }

    public static void addFinishTodo(int count) {
        Object task = TaskList.remove(count);
        TaskFinishList.add(task);
        TodoListView.todoListView(TaskList, TaskFinishList);
    }

    public static void removeTodo(int count) {
        TaskList.remove(count);
        TodoListView.todoListView(TaskList, TaskFinishList);
    }

    public static void removeFinishTodo(int count) {
        Object finishTask = TaskFinishList.remove((count));
        System.out.println(finishTask + "를 삭제하셨습니다");
        TodoListView.todoListView(TaskList, TaskFinishList);
    }

    public static void ChangeTodoCount(int count, int DestinationCount) {
        Object task = TaskList.remove(count);
        TaskList.add(DestinationCount, task);
        TodoListView.todoListView(TaskList, TaskFinishList);
    }

    public static void modifyTodo(int count, String input) {
        TaskList.set(count, input);
        TodoListView.todoListView(TaskList, TaskFinishList);
    }
    
}