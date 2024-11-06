package com.example.ProyectCurses.controller

import com.example.ProyectCurses.model.curses
import com.example.ProyectCurses.response.errorResponse
import com.example.ProyectCurses.response.failedResponse
import com.example.ProyectCurses.response.successResponse
import com.example.ProyectCurses.service.cursesService
import jakarta.websocket.server.PathParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/curses")
class cursesController {
    /*@GetMapping("/{id}")
    fun curses (@PathVariable("id") id: Int):  String {
        return "hello world $id"
    }

    @GetMapping("/{id}")
    fun curses (@PathParam("id") id: Int):  String {
        return "hello world $id"
    }

    @GetMapping()
    fun curses (@RequestBody model: curses): String {
        return "hello world ${model.id} ${model.price} ${model.description} ${model.title} ${model.modality} ${model.inscription}"
    }*/



}

     @Autowired
    lateinit var cursesService: cursesService


    @GetMapping
    fun list(): List<curses> {
        return cursesService.list()
    }

    @PostMapping
    fun save(@RequestBody curses: curses): curses {
        return cursesService.save(curses)
    }

    @GetMapping()
    fun succsess(@RequestBody curses: curses): ResponseEntity<*> {

        return ResponseEntity ( successResponse().apply {
            status = "success"
            data = curses
        },
            HttpStatus.OK
        )
    }

/*
    @GetMapping("/failed")
    fun failed(@RequestBody curses: curses): failedResponse {
        return failedResponse().apply {
            status = "failed"
            data = curses
        }
    }
    @GetMapping("/error")
    fun error(@RequestBody curses: curses): errorResponse {
        return errorResponse().apply {
            status = "error"
            message = "error en el server"
        }
    }*/
