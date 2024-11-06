package com.example.ProyectCurses.model

import jakarta.persistence.*

@Entity
@Table(name = "curses")
class curses {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(updatable = false)
        var id: Long? = null
        var title: String? = null
        var description: String? = null
        var modality: String? = null
        var price: Double? = null
        var inscription: Boolean? = true

        @OneToMany
        @JoinColumn (name="students_id")
        var curse: curses? = null
    }

