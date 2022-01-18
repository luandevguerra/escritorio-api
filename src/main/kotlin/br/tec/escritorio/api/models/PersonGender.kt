package br.tec.escritorio.api.models

import javax.persistence.*

@Entity
@Table(name = "person_gender")
data class PersonGender(

    @Id
    @Column(name = "person_gender_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "person_gender_name")
    var name: String? = null,

    @OneToMany(mappedBy = "gender")
    var people: List<Person>? = null
)