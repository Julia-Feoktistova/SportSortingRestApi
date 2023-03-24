package sportTeam.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Participant {

    @Basic
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "id_team")
    private Integer id_team;

    @Basic
    @Column(name = "surname")
    private String surname;

    @Basic
    @Column(name = "lastname")
    private String lastname;

    @Basic
    @Column(name = "otchestvo")
    private String otchestvo;

    @Basic
    @Column(name = "date_of_birth")
    private LocalDate date_of_birth;

    @Basic
    @Column(name = "position")
    private String position;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return id.equals(that.id) && id_team.equals(that.id_team) && surname.equals(that.surname) && lastname.equals(that.lastname) && Objects.equals(otchestvo, that.otchestvo) && Objects.equals(date_of_birth, that.date_of_birth) && position.equals(that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_team, surname, lastname, otchestvo, date_of_birth, position);
    }
}
