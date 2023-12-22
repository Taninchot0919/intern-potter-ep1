package com.example.potterep1.controller

import com.example.potterep1.service.PetService
import org.springframework.web.bind.annotation.RestController

@RestController
class PetController(private val petService: PetService) {
    // TODO()
}