package com.company;

import java.util.ArrayList;
import java.util.List;

public class TodoListView {
    public static void todoListView(List<Object> TaskList, List<Object> TaskFinishList) {
        
        int taskCount = 0;
        System.out.println("------------해야할 일------------");
        for (Object task : TaskList) {
            taskCount++;
            System.out.println(taskCount + ":" + task);
        }

        int finshCount = 0;
        System.out.println("-------------------------------");
        System.out.printf("\n\n");
        System.out.println("------------완료한 일-----------");

        for (Object task : TaskFinishList) {
            finshCount++;
            System.out.println(finshCount + ":" + task);
        }
        System.out.println("------------------------------");
    }

    public static void instruction(){
        System.out.println("할일을 선택하시오");
        System.out.println("1번 할일 추가");
        System.out.println("2번 할일 완료");
        System.out.println("3번 할일 삭제");
        System.out.println("4번 완료된 일 삭제");
        System.out.println("5번 우선순위 변경");
        System.out.println("6번 할일 수정");
        System.out.println("7번 끝내기");
    }
}
