package com.lavish.hellospring2.model

import javax.persistence.*

@Entity
data class Article (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val title: String = "",

    val content: String = "",

    @OneToOne()
    @JoinColumn(name = "tagId")
    val tag: Tag = Tag(name = "")
)