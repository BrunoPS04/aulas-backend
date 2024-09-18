package com.example.atControladores.service;

import com.example.atControladores.model.Tag;
import com.example.atControladores.repository.TagRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    public Tag getTagById(Long id) {
        Optional<Tag> tag = tagRepository.findById(id);
        return tag.orElse(null);
    }
    public Tag createTag(Tag tag) {
        return tagRepository.save(tag);
    }
    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }
   
    public Tag updateTag(Long id, Tag tag) {
       return tagRepository.save(tag);
    }
    
}
