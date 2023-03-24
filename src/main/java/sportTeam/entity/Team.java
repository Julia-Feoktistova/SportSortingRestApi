package sportTeam.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Team {

    @Basic
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "sport_type")
    private String sport_type;

    @Basic
    @Column(name = "foundation_date")
    private LocalDate foundation_date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return name.equals(team.name) && sport_type.equals(team.sport_type) && foundation_date.equals(team.foundation_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sport_type, foundation_date);
    }
}

