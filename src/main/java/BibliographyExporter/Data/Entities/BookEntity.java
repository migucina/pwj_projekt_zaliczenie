package BibliographyExporter.Data.Entities;

import org.hibernate.annotations.common.reflection.XProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private String Title;
    private String Press;
    private Date ReleaseDate;
    private Long AuthorId;

}
