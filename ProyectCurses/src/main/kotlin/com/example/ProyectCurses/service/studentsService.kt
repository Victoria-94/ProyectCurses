package com.example.ProyectCurses.service

import com.example.ProyectCurses.model.curses
import com.example.ProyectCurses.model.students
import com.example.ProyectCurses.repository.cursesRepository
import com.example.ProyectCurses.repository.studentsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class studentsService {
    @Autowired
    lateinit var studentsRepository: studentsRepository

    fun list ():List<students> {
        return studentsRepository.findAll()
    }

    fun save (students: students): students {
        return studentsRepository.save(students)
    }
}