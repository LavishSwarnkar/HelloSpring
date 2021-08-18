package com.lavish.hellospring2.controller

import com.lavish.hellospring2.model.Tag
import com.lavish.hellospring2.repo.TagRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class TagController(private val tagRepository: TagRepository) {

    @GetMapping("/tags")
    fun getAllTags(): List<Tag> =
        tagRepository.findAll()


    @PostMapping("/tags")
    fun createNewTag(@RequestBody tag: Tag): Tag =
        tagRepository.save(tag)
}