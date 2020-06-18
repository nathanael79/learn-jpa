package com.learn.jpa.model

import javax.persistence.*

@Entity
@Table(name = "content")
data class Content (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id : Int? = null,

    @Column(name = "title")
    var title: String? = null,

    @Column(name = "description")
    var description: String? = null,

    @Column(name = "published")
    var isPublished: Boolean = false
)