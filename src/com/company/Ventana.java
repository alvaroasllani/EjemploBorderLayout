package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;

    public Ventana() {
        super("Ejemeplo de BorderLayout");
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");
        boton5 = new JButton("Boton 5");
        setLayout(new BorderLayout());
        add(boton1, BorderLayout.NORTH);
        add(boton2, BorderLayout.SOUTH);
        add(boton3, BorderLayout.EAST);
        add(boton4, BorderLayout.WEST);
        add(boton5, BorderLayout.CENTER);
    }
}
