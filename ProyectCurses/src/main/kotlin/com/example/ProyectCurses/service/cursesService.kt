package com.example.ProyectCurses.service

import com.example.ProyectCurses.model.curses
import com.example.ProyectCurses.repository.cursesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class cursesService {
    @Autowired
    lateinit var cursesRepository: cursesRepository

    fun list ():List<curses> {
        return cursesRepository.findAll()
    }

    fun save (curses: curses):curses{
        return cursesRepository.save(curses)
    }
 }