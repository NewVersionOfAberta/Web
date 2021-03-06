package com.natali.service;

import com.natali.service.impl.RentServiceImpl;
import com.natali.service.impl.UserServiceImpl;
import com.natali.service.interfaces.RentService;
import com.natali.service.interfaces.UserService;
import lombok.Getter;

@Getter
public class ServiceFactory {
    @Getter
    private static final ServiceFactory instance = new ServiceFactory();

    private final RentService rentService = new RentServiceImpl();
    private final UserService userService = new UserServiceImpl();
}
