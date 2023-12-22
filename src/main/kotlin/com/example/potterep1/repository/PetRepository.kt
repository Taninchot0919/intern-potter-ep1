package com.example.potterep1.repository

import com.example.potterep1.entity.Pet
import org.springframework.data.jpa.repository.JpaRepository

interface PetRepository : JpaRepository<Pet, Int> {}