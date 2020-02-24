package com.andrew.cinema.data.dto;

import com.polishchuk.cinema.cinema.data.entity.Role;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class UserDto {
    private int id;
    private String username;
    private String password;
    private String email;
    private boolean active;
    private List<Role> roles;
    private List<TicketDto> ticketList;
}
