package co.develhope.hybernate.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "title", nullable = false)
    public String title;
    @Column (name = "description", nullable = false)
    public String description;

    @OneToMany(mappedBy = "class")
    private List<Enrollment> enrollments;

}