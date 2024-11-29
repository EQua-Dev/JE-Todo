/*
 * Copyright (c) 2024.
 * Richard Uzor
 * Just Enough Studios
 */

package com.justenoughstudios.todo.repositories;

import com.justenoughstudios.todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {
}
