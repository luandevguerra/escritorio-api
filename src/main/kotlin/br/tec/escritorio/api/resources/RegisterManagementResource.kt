package br.tec.escritorio.api.resources

import br.tec.escritorio.api.models.Person
import br.tec.escritorio.api.services.RegisterManagementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/register-management")
class RegisterManagementResource(
        private val service: RegisterManagementService
) {

    @GetMapping
    fun getAllPeople(@RequestBody person: Person) = service.getAllPeople(person)

}