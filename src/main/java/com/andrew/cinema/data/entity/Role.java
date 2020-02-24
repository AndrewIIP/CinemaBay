package com.andrew.cinema.data.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
@Accessors(chain = true)
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String role;

//  @ManyToMany(mappedBy = "roles")
//  List<User> users;
}
