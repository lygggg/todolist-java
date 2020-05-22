package com.company;

import java.util.Scanner;

public class Select {
    public static void select(int deptNumber){
        
        Scanner selectNumber = new Scanner(System.in);
        Scanner selectText = new Scanner(System.in);
        
        if (deptNumber == 1) {
            System.out.println("할일을 입력하시오");
            Scanner task = new Scanner(System.in);
            String taskText = task.nextLine();
            Todo.addTodo(taskText);
        }
        if (deptNumber == 2) {
            System.out.println("완료한 번호를 선택하시오");
            int removeNumber = selectNumber.nextInt();
            Todo.addFinishTodo(removeNumber-1);
        }

        if (deptNumber == 3) {
            System.out.println("할일중에 삭제할 번호를 선택하시오.");
            int removeNumber = selectNumber.nextInt();
            Todo.removeTodo(removeNumber-1);
        }

        if (deptNumber == 4) {
                System.out.println("완료한 일중에 삭제할 번호를 선택하시오");
                int removeNumber = selectNumber.nextInt();
                Todo.removeFinishTodo(removeNumber-1);
        }

        if (deptNumber == 5) {
                System.out.println("우선순위를 변경하고 싶은 번호를 선택하시오");
                int removeNumber = selectNumber.nextInt();
                System.out.println(removeNumber+"을 선택하셨습니다. " + "몇번으로 변경하시겠습니까?");
                int changeIndex = selectNumber.nextInt();
                Todo.ChangeTodoCount(removeNumber-1, changeIndex-1);
            }
//
        if (deptNumber == 6) {
            System.out.println("수정 하고싶은 번호를 선택하시오.");
            int modifyNumber = selectNumber.nextInt();
            System.out.println(modifyNumber + " 선택하셨습니다.");
            System.out.println("변경할 텍스트를 입력해주세요");
            String changeTask = selectText.nextLine();
            Todo.modifyTodo(modifyNumber-1, changeTask);
        }
    }
}
