package com.example.potterep1.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.AUTO
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "pets")
data class Pet(
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "id")
    val id: Int? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "gender")
    val gender: String?,

    @Column(name = "type")
    val type: String?
)