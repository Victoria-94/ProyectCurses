package com.example.ProyectCurses.repository

import com.example.ProyectCurses.model.curses
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface cursesRepository: JpaRepository<curses, Long> {
}