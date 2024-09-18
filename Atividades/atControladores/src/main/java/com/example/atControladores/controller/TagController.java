package com.example.atControladores.controller;
import com.example.atControladores.model.Tag;
import com.example.atControladores.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tags")
public class TagController {   
    
    @Autowired
    private TagRepository tagRepository;

    @GetMapping
    public List<Tag> getAllTags(){
        return tagRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tag> getTagById(@PathVariable Long id){
        return tagRepository.findById(id);
    }

    @PostMapping
    public Tag createTag(@RequestBody Tag tag){
        return tagRepository.save(tag);
    }

    @PutMapping("/{id}")
    public Tag updateTag(@PathVariable Long id, @RequestBody Tag tag){
        return tagRepository.save(tag);
    }

    @DeleteMapping("/{id}")
    public void deleteTag(@PathVariable Long id){
        tagRepository.deleteById(id);
    }

}
