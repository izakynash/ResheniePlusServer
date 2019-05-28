package reshenie.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false, length = 3)
    private long id;

    @Column(name = "title", nullable = false, length = 30)
    private String title;

    @Column(nullable = false, length = 100)
    private String description;

    @Column(nullable = false, length = 50)
    private String link;

//    // OneToOne
//    @OneToOne(optional = false, mappedBy = "book")
//    public Chapter chapter;
//
//    public Chapter getChapter() {
//        return chapter;
//    }
//
//    public void setChapter(Chapter chapter) {
//        this.chapter = chapter;
//    }


    // OneToMany
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "book")
    private Set<Chapter> chapters;

    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Book() {
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
}


