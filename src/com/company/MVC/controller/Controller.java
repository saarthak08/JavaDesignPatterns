package com.company.MVC.controller;

import com.company.MVC.model.Model;
import com.company.MVC.view.LoginFormEvent;
import com.company.MVC.view.LoginListener;
import com.company.MVC.view.View;

public class Controller implements LoginListener {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());

    }


}