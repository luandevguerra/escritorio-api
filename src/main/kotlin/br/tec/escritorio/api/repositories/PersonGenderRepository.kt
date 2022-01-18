package br.tec.escritorio.api.repositories

import br.tec.escritorio.api.models.PersonGender
import org.springframework.data.repository.CrudRepository

interface PersonGenderRepository: CrudRepository<PersonGender, Long>