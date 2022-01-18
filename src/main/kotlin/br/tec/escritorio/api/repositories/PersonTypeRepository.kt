package br.tec.escritorio.api.repositories

import br.tec.escritorio.api.models.PersonType
import org.springframework.data.repository.CrudRepository

interface PersonTypeRepository: CrudRepository<PersonType, Long>