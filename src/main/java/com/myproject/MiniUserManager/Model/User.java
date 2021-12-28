package com.myproject.MiniUserManager.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    /*
        private Date birthday;
        private String address;
     */
}
