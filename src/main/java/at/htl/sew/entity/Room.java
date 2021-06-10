package at.htl.sew.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "R_ROOM")
@SequenceGenerator(
        name = "roomSeq",
        sequenceName = "R_ROOM_SEQ",
        initialValue = 2000
)
public class Room extends PanacheEntityBase {

    @Id
    @Column(name = "R_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roomSeq")
    public long id;

    @Column(name = "R_NAME")
    public String name;

    @Column(name = "R_NR")
    public int yob;
}
