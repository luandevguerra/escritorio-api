package br.tec.escritorio.api.models

import javax.persistence.*

@Entity
@Table(name = "person_type")
data class PersonType(

        @Id
        @Column(name = "person_type_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column(name = "person_type_name")
        var name: String? = null,

        @OneToMany(mappedBy = "type")
        var people: List<Person>? = null
)