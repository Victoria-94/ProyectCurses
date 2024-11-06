package com.example.ProyectCurses.model

import jakarta.persistence.*

@Entity
@Table(name = "students")
class students(var age: Int? = null) {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nui: String? = null
    var fullname: String? = null
    var email: String? = null

    @OneToMany(mappedBy = "curse", cascade = [(CascadeType.ALL)])
    val students: List<students> = ListOf()
}


/*relacion con la tabla

 */
