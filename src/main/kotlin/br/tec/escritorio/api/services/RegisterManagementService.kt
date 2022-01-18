package br.tec.escritorio.api.services

import br.tec.escritorio.api.models.Person
import br.tec.escritorio.api.repositories.PersonRepository
import org.springframework.stereotype.Service

@Service
class RegisterManagementService(
        private val repository: PersonRepository
) {

    fun getAllPeople(person: Person): MutableIterable<Person> = repository.findAll()
}