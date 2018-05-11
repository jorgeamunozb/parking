package co.com.ceiba.parking.controller;

import co.com.ceiba.parking.model.Motorcycle;
import co.com.ceiba.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @GetMapping("/getMotorcycles")
    public List<Motorcycle> getParking() {
        return parkingService.getMotorcycles();
    }

    @PostMapping("/saveCar")
    public String createNote(@Valid @RequestBody String parking) {
        //return parkingRepository.save(parking);
        return null;
    }


    /**
     * public Note getNoteById(@PathVariable(value = "id") Long noteId) {
     *     return noteRepository.findById(noteId)
     *             .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
     * }
     */

    /**
     * // Update a Note
     * @PutMapping("/notes/{id}")
     * public Note updateNote(@PathVariable(value = "id") Long noteId,
     *                                         @Valid @RequestBody Note noteDetails) {
     *
     *     Note note = noteRepository.findById(noteId)
     *             .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
     *
     *     note.setTitle(noteDetails.getTitle());
     *     note.setContent(noteDetails.getContent());
     *
     *     Note updatedNote = noteRepository.save(note);
     *     return updatedNote;
     * }
     */

    /**
     * @DeleteMapping("/notes/{id}")
     * public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
     *     Note note = noteRepository.findById(noteId)
     *             .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
     *
     *     noteRepository.delete(note);
     *
     *     return ResponseEntity.ok().build();
     * }
     */
}
