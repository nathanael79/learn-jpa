package com.learn.jpa.service

import com.learn.jpa.model.Content
import com.learn.jpa.repository.ContentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import java.util.function.Consumer

@Service
class ContentService @Autowired constructor(private val contentRepository: ContentRepository) {

    fun updateContent(id: Int, content: Content): Content {
        content.id = id
        return contentRepository.save(content)
    }

    val allContents: MutableList<Content?>
        get() {
            return contentRepository.findAll()
        }

    fun getContentDetail(id: Int): Optional<Content?> {
        return contentRepository.findById(id)
    }

    fun createContent(content: Content): Content {
        content.id = null
        return contentRepository.save(content)
    }

    fun deleteContent(id: Int){
        return contentRepository.deleteById(id)
    }

}