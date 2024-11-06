package com.example.ProyectCurses.controller

import com.example.ProyectCurses.model.curses
import com.example.ProyectCurses.model.students
import com.example.ProyectCurses.service.cursesService
import com.example.ProyectCurses.service.studentsService
import jakarta.persistence.OneToMany
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class studentsController {

    @Autowired
    lateinit var studentsService: studentsService


    @GetMapping
    fun list(): List <students> {
        return studentsService.list()
    }
    @PostMapping
    fun save(@RequestBody students: students): students {
        return studentsService.save(students)
    }
@OneToMany()

}
