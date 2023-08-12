package com.workintech.company.model;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTask;// içine task objeleri gelecek instance variable oluşturduk
    private Set<Task> bobsTask;//öyle bir değişkenki içinde taskların setini tutuyor
    private Set<Task> carolTask;
    private Set<Task> unassignedTask;

    public TaskData() {

        annsTask = new HashSet<>();
        bobsTask = new HashSet<>();
        carolTask = new HashSet<>();
        unassignedTask = new HashSet<>();
    }

    public Set<Task> getTasks(String taskOwner) {
        if (taskOwner.equals("ann")) {
            return annsTask;
        }
        if (taskOwner.equals("bob")) {
            return bobsTask;
        }
        if (taskOwner.equals("carol")) {
            return carolTask;
        }
        if (taskOwner.equals("all")) {
            Set<Task> totals = new HashSet<>();
            totals.addAll(annsTask);
            totals.addAll(bobsTask);
            totals.addAll(carolTask);
            totals.addAll(unassignedTask);
            return getUnion(totals);
        }
        return null;//birşeyin tipi referanssa null dönebilir (ama int, stringse null dönemez, null pointer hatası döner
        //return new HashSet<>() diye boş set de döndürebilirdik
    }

    //task tipinde setler olan liste alır.
    //tüm set değerlerini alıp döneceği için bu set task tipinde olur
    public Set<Task> getUnion(Set<Task>... taskList) {
        Set<Task> totals = new HashSet<>();
        for (Set<Task> tasks : taskList) {
            totals.addAll(tasks);
        }
        return totals;
    }

    public Set<Task> getByTaskStatus(Status status) {
        Set<Task> allTasks = getTasks("all");
        Set<Task> filteredStatusSet = new HashSet<>();
        for (Task task : allTasks) {
            if (task.getStatus().name().equals(status.name())) {
                filteredStatusSet.add(task);
            }
        }
        return filteredStatusSet;
    }

    public Set<Task> getIntersect(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public Set<Task> getDifference(Set<Task> set1, Set<Task> set2) {
        Set<Task> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    public Set<Task> getUnassignedTask() {
        return unassignedTask;
    }
}

