package softuniBlog.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Flex on 8.12.2016 г..
 */
@Entity
@Table(name="class")
public class Tag {
    private Integer id;
    private String name;
    private Set<Article> articles;

    public Tag() {
    }

    public Tag(String name) {
        this.name = name;
        this.articles = new HashSet<>();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(unique = true,nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ManyToMany
    @JoinColumn(table = "tags_articles")
    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}
