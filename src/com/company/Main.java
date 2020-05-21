package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Object> TaskList = new ArrayList<Object>();
        List<Object> TaskFinishList = new ArrayList<Object>();

        while (true) {

            System.out.println("할일을 선택하시오");
            System.out.println("1번 할일 추가");
            System.out.println("2번 할일 완료");
            System.out.println("3번 완료된 일 삭제");
            System.out.println("4번 우선순위 변경");
            System.out.println("5번 할일 수정");
            System.out.println("6번 끝내기");

            Scanner selectNumber = new Scanner(System.in);
            Scanner selectText = new Scanner(System.in);

            int taskNumber = selectNumber.nextInt();

            if (taskNumber == 1) {
                System.out.println("할일을 입력하시오");
                Scanner task = new Scanner(System.in);
                String taskText = task.nextLine();
                TaskList.add(taskText);
            }

            if (taskNumber == 2) {
                System.out.println("완료한 번호를 선택하시오");

                for (int i = 0; i < TaskList.size(); i++) {
                    System.out.println((i + 1) + ":" + TaskList.get(i));
                }

                int removeNumber = selectNumber.nextInt();
                Object finishTask = TaskList.remove((removeNumber - 1));
                TaskFinishList.add(finishTask);
                System.out.println(finishTask + "를 완료 하셨습니다");
            }

            if (taskNumber == 3) {
                System.out.println("완료한 일중에 삭제할 번호를 선택하시오");

                for (int i = 0; i < TaskFinishList.size(); i++) {
                    System.out.println((i + 1) + ":" + TaskFinishList.get(i));
                }

                int removeNumber = selectNumber.nextInt();
                Object finishTask = TaskFinishList.remove((removeNumber - 1));
                System.out.println(finishTask + "를 삭제하셨습니다");
            }

            if (taskNumber == 4) {
                System.out.println("우선순위를 변경하고 싶은 번호를 선택하시오");

                for (int i = 0; i < TaskList.size(); i++) {
                    System.out.println((i + 1) + ":" + TaskList.get(i));
                }

                int removeNumber = selectNumber.nextInt();
                Object finishTask = TaskList.remove((removeNumber - 1));
                System.out.println("몇번으로 변경하시겠습니까?");
                int changeIndex = selectNumber.nextInt();
                TaskList.add((changeIndex - 1), finishTask);
            }

            if (taskNumber == 5) {
                System.out.println("수정 하고싶은 번호를 선택하시오.");

                for (int i = 0; i < TaskList.size(); i++) {
                    System.out.println((i + 1) + ":" + TaskList.get(i));
                }

                int modifyNumber = selectNumber.nextInt();
                System.out.println(TaskList.get(modifyNumber) + "를 선택하셨습니다.");
                System.out.println("변경할 텍스트를 입력해주세요");
                String changeTask = selectText.nextLine();
                TaskList.set((modifyNumber - 1), changeTask);
            }
            if (taskNumber == 6) {
                break;
            }

            System.out.println("------------해야할 일------------");
            for (int i = 0; i < TaskList.size(); i++) {
                System.out.println((i + 1) + ":" + TaskList.get(i));
            }

            System.out.println("-------------------------------");
            System.out.printf("\n\n");
            System.out.println("------------완료한 일-----------");

            for (int i = 0; i < TaskFinishList.size(); i++) {
                System.out.println((i + 1) + ":" + TaskFinishList.get(i));
            }

            System.out.println("------------------------------");
        }
    }
}