package car.shop.kaiser.myObj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import car.shop.kaiser.myObj.BlogPost;

@Repository
class BlogRepository {
    @Autowired
    private DataSource dataSource;

    public List<BlogPost> getAllPosts() throws SQLException {
        List<BlogPost> posts = new ArrayList<>();

        String sql = "select * from blog_post";

        try (Connection con = ((Statement) dataSource).getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);) {

            while (rs.next()) {
                Long id = rs.getLong("id");
                String title = rs.getString("title");
                String content = rs.getString("content");

                BlogPost post = new BlogPost(id, title, content);
                posts.add(post);
            }
        }

        return posts;
    }
}