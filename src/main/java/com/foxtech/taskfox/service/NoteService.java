package com.foxtech.taskfox.service;

import com.foxtech.taskfox.dto.Note;
import com.foxtech.taskfox.repo.NoteRepository;
import com.foxtech.taskfox.repo.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoteService {

    NoteRepository noteRepository;
    TaskRepository taskRepository;

    public NoteService(NoteRepository noteRepository, TaskRepository taskRepository) {
        this.noteRepository = noteRepository;
        this.taskRepository = taskRepository;
    }

    public Note createNote(Note note) {
        note.setCreateDate(new Date());

        return noteRepository.save(note);
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public List<Note> getNotesByTaskId(String taskId) {
        return null;
    }

    public void deleteAllNotes() {
        noteRepository.deleteAll();
    }

}
