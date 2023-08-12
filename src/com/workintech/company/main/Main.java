package com.workintech.company.main;

import com.workintech.company.model.Priority;
import com.workintech.company.model.Status;
import com.workintech.company.model.Task;
import com.workintech.company.model.TaskData;

public class Main {
    public static void main(String[] args) {

        TaskData taskData = new TaskData();
        Task task1 = new Task("Java Collections", "Write List",
                "Ann", Priority.LOW, Status.ASSIGNED);
        Task task2 = new Task("Java Collections", "Write Set",
                "Bob", Priority.LOW, Status.ASSIGNED);
        Task task3 = new Task("Java Collections", "Write LinkedList",
                "Carol", Priority.LOW, Status.ASSIGNED);
        Task task4 = new Task("Java Collections", "Write Map",
                "Bob", Priority.LOW, Status.ASSIGNED);
        Task task5 = new Task("Java Collections", "Write ArrayList",
                "Ann", Priority.LOW, Status.ASSIGNED);
        Task task6 = new Task("Java Collections", "Write List in Set",
                "", Priority.MED, Status.IN_QUEUE);
        System.out.println(task2);
        taskData.getTasks("ann").add(task1);
        taskData.getTasks("ann").add(task5);
        taskData.getTasks("bob").add(task2);
        taskData.getTasks("bob").add(task4);
        taskData.getTasks("carol").add(task3);
        taskData.getUnassignedTask().add(task6);
        System.out.println(taskData.getTasks("ann"));
        System.out.println(taskData.getTasks("all"));
        System.out.println("************");
        System.out.println(taskData.getUnassignedTask());
        System.out.println(taskData.getTasks("all"));
        System.out.println("------------------");
        System.out.println(taskData.getByTaskStatus(Status.IN_QUEUE));
        System.out.println(taskData.getTasks("ann"));


    }

}