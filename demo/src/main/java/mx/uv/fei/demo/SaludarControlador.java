package mx.uv.fei.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
public class SaludarControlador {

    String nombre;

    @GetMapping("/saludos")
    public String saludar() {
        return "Hola mundo!" + nombre;
    }

    @GetMapping("/despedidas")
    public String despedirse() {
        return "Adiós mundo!";
    }

    @GetMapping("/nombres")
    public void nombre(){
        nombre="Ian";
    }

    @PutMapping("/renombes")
    public void metodo1(){
        nombre="actualizar";
    }

    @DeleteMapping("/nombres")
    public void metodo2(){
        nombre=null;
    }

}