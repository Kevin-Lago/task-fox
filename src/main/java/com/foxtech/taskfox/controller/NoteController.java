package com.foxtech.taskfox.controller;

import com.foxtech.taskfox.dto.Note;
import com.foxtech.taskfox.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/note")
public class NoteController {

    @Autowired
    NoteService noteService;

    @PostMapping("/create")
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    @GetMapping("/read/all")
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @DeleteMapping("/delete/all")
    public void deleteAllNotes() {
        noteService.deleteAllNotes();
    }

}
