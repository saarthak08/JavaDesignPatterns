package com.company.MVC;

import com.company.MVC.model.Model;
import com.company.MVC.view.View;

import javax.swing.*;

public class Application {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp(){
        Model model=new Model();
        View view=new View(model);
    }

}
