package com.PrepList.servlets.security;

import java.security.Principal;

public class Role implements Principal {

    private final String name;

    public Role(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}