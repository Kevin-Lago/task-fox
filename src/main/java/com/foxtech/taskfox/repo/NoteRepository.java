package com.foxtech.taskfox.repo;

import com.foxtech.taskfox.dto.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {

}
