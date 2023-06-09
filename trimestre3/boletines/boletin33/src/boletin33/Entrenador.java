/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33;

/**
 *
 * @author dam1
 */
public class Entrenador extends SeleccionFutbol{
    private Integer idFedereacion;

    @Override
    public void concentrarse() {
        System.out.println("concentrase o entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("viaja o entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("non entrena o entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("non xoga o entrenador");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("planifica entreno entrenador");
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entrenador{");
        sb.append("idFedereacion=").append(idFedereacion);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
