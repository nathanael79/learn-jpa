package com.learn.jpa.repository

import com.learn.jpa.model.Content
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface ContentRepository : JpaRepository<Content?, Int?> {
    fun findByPublished(published: Boolean): List<Content?>
    fun findByTitleContaining(title: String?): List<Content?>
}