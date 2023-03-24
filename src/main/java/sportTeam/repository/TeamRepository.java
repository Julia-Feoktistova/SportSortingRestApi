package sportTeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sportTeam.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
