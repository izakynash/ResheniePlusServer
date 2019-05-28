package reshenie.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "chapter")
public class Chapter {
    @Id
    // для автоинкрементции id:
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false, length = 3)
    private long id;

    @Column(name = "titleChapter", nullable = false, length = 30)
    private String titleChapter;

//    // OneToOne
//    @OneToOne(optional = false)
//    @JoinColumn(name = "book_id", unique = true, nullable = false)


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

//    public Chapter() {
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitleChapter() {
        return titleChapter;
    }

    public void setTitleChapter(String title) {
        this.titleChapter = title;
    }
}
