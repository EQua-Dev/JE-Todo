/*
 * Copyright (c) 2024.
 * Richard Uzor
 * Just Enough Studios
 */

package com.justenoughstudios.todo.services;

import com.justenoughstudios.todo.exceptions.ResourceNotFoundException;
import com.justenoughstudios.todo.models.Task;
import com.justenoughstudios.todo.repositories.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskService implements ITaskService {

    private final TaskRepository taskRepository;


    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void createTask(String task) {
        Task newTask = new Task();
        newTask.setTitle(task);
        newTask.setIsCompleted(false);
        taskRepository.save(newTask);

    }

    @Override
    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }

    @Override
    public void toggleTask(Long taskId) {
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new ResourceNotFoundException("Task not found"));
        task.setIsCompleted(!task.getIsCompleted());
        taskRepository.save(task);
    }
}
