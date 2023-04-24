package co.develhope.hybernate.entities;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")

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


    public SchoolClass(){}

    public SchoolClass(long id, String title, String description, List<Enrollment> enrollments) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.enrollments = enrollments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", enrollments=" + enrollments +
                '}';
    }
}