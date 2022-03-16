package com.example.web_jp.service.User;

import com.example.web_jp.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> getAll();
}
