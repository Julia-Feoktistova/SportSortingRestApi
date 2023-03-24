package sportTeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sportTeam.entity.Participant;
import java.util.List;
import java.util.Optional;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
    Optional<List<Participant>> findAllById(Integer id);
}
