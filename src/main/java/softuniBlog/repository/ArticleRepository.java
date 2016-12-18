package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Article;

/**
 * Created by Flex on 3.12.2016 г..
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}