package com.JDBC2.SpringBootJDBC.Repo;

import com.JDBC2.SpringBootJDBC.Model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class AlienRepo {

    private JdbcTemplate temp;

    public JdbcTemplate getTemp() {
        return temp;
    }

    @Autowired
    public void setTemp(JdbcTemplate temp) {
        this.temp = temp;
    }

    public void save(Alien alien) {
        String sql = "insert into alien(id,name,tech) values(?,?,?)";
        int rows = temp.update(sql, alien.getId(), alien.getName(), alien.getTech());
        System.out.print(rows);
    }

    public List<Alien> findAll() {
        String sql = "select * from alien";
//        RowMapper<Alien> rowMapper = new RowMapper<Alien>() {
//
//            @Override
//            public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Alien alien = new Alien();
//                alien.setId(rs.getInt("id"));
//                alien.setName(rs.getString("name"));
//                alien.setTech(rs.getString("tech"));
//                return alien;
//            }
//        };
//        List<Alien> aliens = temp.query(sql,rowMapper);
//        return  aliens;
//    }

            return temp.query(sql, (rs, rowNum) -> {
                Alien alien = new Alien();
                alien.setId(rs.getInt("id"));
                alien.setName(rs.getString("name"));
                alien.setTech(rs.getString("tech"));
                return alien;
            });
    }
}
