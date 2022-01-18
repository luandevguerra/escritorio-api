package br.tec.escritorio.api.repositories

import br.tec.escritorio.api.models.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository: CrudRepository<Person, Long>