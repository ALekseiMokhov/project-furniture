package com.gmail.qwertygoog.Project.furniture;

import com.gmail.qwertygoog.Project.furniture.dao.UserRepository;
import com.gmail.qwertygoog.Project.furniture.service.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProjectFurnitureApplication.class)
@EnableJpaRepositories
@Transactional
@SpringBootTest
public class TestRepo {
    private final static Logger LOG
            = LoggerFactory.getLogger( TestRepo.class );
    @Autowired
    private UserRepository repo;
    @Before
    public void setUp(){
        User Vasya = new User();
        Vasya.setName("Vasil Ivanovich Chapayev");
        repo.save( Vasya );
        User Petya = new User();
        Vasya.setName("Pet'ka");
        repo.save( Petya );
    }
    @Test
    public void testCountUsers(){
        LOG.info( "The number of users in DB is..." );
        assert repo.count()==2;
    }
    @Test
    public void testFindByNameIgnoreCase(){
       User user = repo.findByNameIgnoreCase( "Pet'ka" );
       LOG.info( user.getName() );
       assert user != null;
    }

}
