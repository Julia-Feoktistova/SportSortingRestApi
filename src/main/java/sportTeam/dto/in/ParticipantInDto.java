package sportTeam.dto.in;

import lombok.*;
import sportTeam.entity.Team;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@EqualsAndHashCode
public class ParticipantInDto {

    private Integer id;
    private Team team;
    private String surname;
    private String lastName;
    private String otchestvo;
    private LocalDate birthDate;
    private String position;
}
