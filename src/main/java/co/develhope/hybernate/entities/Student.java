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

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column (nullable = false)
    public String lastName;
    @Column(nullable = false)
    public String firstName;
    @Column(unique = true, name = "userEmail", nullable = false)
    public String email;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}