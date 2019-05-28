package reshenie.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "chapter")
public class Chapter {
    @Id
    // для автоинкрементции id:
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "titleChapter", nullable = false, length = 30)
    private String titleChapter;

    public Chapter() {
    }

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
