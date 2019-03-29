package com.candidates.dream

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Candidate(
        var firstName: String = "",
        var lastName: String = "",
        var birthDate: String = "",
        var email: String = "",
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null)