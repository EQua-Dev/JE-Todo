/*
 * Copyright (c) 2024.
 * Richard Uzor
 * Just Enough Studios
 */

package com.justenoughstudios.todo.services;

import com.justenoughstudios.todo.models.Task;

import java.util.List;

public interface ITaskService {

    List<Task> getAllTasks();
    void createTask(String task);
    void deleteTask(Long taskId);
    void toggleTask(Long taskId);
}
