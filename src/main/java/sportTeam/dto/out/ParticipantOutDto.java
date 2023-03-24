package sportTeam.dto.out;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
public class ParticipantOutDto {

    private Integer id;
    private Integer teamId;
    private String surname;
    private String lastName;
    private String otchestvo;
    private LocalDate birthDate;
    private String position;
}
