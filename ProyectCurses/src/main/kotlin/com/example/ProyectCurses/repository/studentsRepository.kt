package com.example.ProyectCurses.repository

import com.example.ProyectCurses.model.curses
import com.example.ProyectCurses.model.students
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
    interface studentsRepository: JpaRepository<students, Long> {
}