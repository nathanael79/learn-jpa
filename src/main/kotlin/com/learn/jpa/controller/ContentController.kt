package com.learn.jpa.controller

import com.learn.jpa.model.Content
import com.learn.jpa.service.ContentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1/content")
class ContentController @Autowired constructor(private val contentService: ContentService) {

    @GetMapping
    fun getAllContents(): ResponseEntity<MutableList<Content?>> {
        return ResponseEntity(contentService.allContents, HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getContentDetail(@PathVariable("id") id: Int): ResponseEntity<Optional<Content?>> {
        return ResponseEntity(contentService.getContentDetail(id), HttpStatus.OK)
    }

    @PostMapping
    fun createContent(@RequestBody content: Content): ResponseEntity<Content> {
        return ResponseEntity(contentService.createContent(content), HttpStatus.OK)
    }

    @PutMapping("/{id}")
    fun updateContent(@PathVariable("id") id: Int, @RequestBody content: Content): ResponseEntity<Content> {
        return ResponseEntity(contentService.updateContent(id, content), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteContent(@PathVariable("id") id: Int): ResponseEntity<Any> {
        return ResponseEntity(contentService.deleteContent(id), HttpStatus.OK)
    }
}