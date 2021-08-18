package com.lavish.hellospring2.repo

import com.lavish.hellospring2.model.Article
import com.lavish.hellospring2.model.Tag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TagRepository : JpaRepository<Tag, Long>