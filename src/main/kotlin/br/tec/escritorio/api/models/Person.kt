package br.tec.escritorio.api.models

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "person")
data class Person(

        @Id
        @Column(name = "person_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column(name = "person_complete_name")
        var completeName: String? = null,

        @Column(name = "person_birth_date")
        var birthDate: LocalDate? = null,

        @Column(name = "person_cpf")
        var cpf: Long? = null,

        @ManyToOne
        @JoinColumn(name = "person_type_fk")
        var type: PersonType? = null,

        @ManyToOne
        @JoinColumn(name = "person_gender_fk")
        var gender: PersonGender? = null
)