package com.okta.password_inline_hook.service.impl;

import com.okta.password_inline_hook.service.McKessonService;
import org.springframework.stereotype.Service;

@Service
public class McKessonServiceImpl implements McKessonService {
    @Override
    public Boolean isAvailable(String username, String password) {

        return Boolean.TRUE;
    }
}
