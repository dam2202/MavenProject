package org.example;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
}