package at.htl.sew.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.hibernate.annotations.Cascade;
import javax.persistence.*;

import static org.hibernate.annotations.CascadeType.PERSIST;

@Entity
@Table(name="S_STUDENT")
@SequenceGenerator(
        name = "vehicleSeq",
        sequenceName = "S_STUDENT_SEQ",
        initialValue = 1000
)
public class Student extends PanacheEntityBase {

    @Id
    @Column(name = "S_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentSeq")
    public long id;

    @Column(name = "S_NAME")
    public String name;

    @Column(name = "S_YOB")
    public int yob;

    @JoinColumn(name = "S_R_ID")
    @Cascade(PERSIST)
    @ManyToOne
    public Room room;

    public Student() {
    }

    public Student(String name, int yob, Room room) {
        this.name = name;
        this.yob = yob;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yob=" + yob +
                ", room=" + room +
                '}';
    }
}
