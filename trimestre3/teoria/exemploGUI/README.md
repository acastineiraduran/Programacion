# EXEMPLO GUI
setBounds() // dd lo sustitiye y con que tamaño (largo y ancho)
setVisible(true) // hace que sea visible esa ventana

marco.setDefaultCloseOperation(0) // el 0 no hace nada

* JFrame.EXIT_ON_CLOSE // corresponde al numero 3.
si no añadimos esto, al cerrar la ventana, se seguira ejecutando

## LAYOUTS
en el segundo metodo vamos a pasar de esto
```java
        boton1 = new JButton("BOTON1");
        boton2 = new JButton("BOTON2");
        boton3 = new JButton("BOTON3");
        boton4 = new JButton("BOTON4");
        boton5 = new JButton("BOTON5");
        
        panel = new JPanel();
        marco = new JFrame(" ** LAYOUTS ** ");
        marco.setSize(600, 400);
```

> la parte 3 no funciona bien, no se porque no funcionar --> **PREGUNTAR**