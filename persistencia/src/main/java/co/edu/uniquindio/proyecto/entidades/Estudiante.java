package co.edu.uniquindio.proyecto.entidades;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Estudiante implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nombre;

    @ToString.Exclude
    @OneToMany(mappedBy = "resultado")
    private List<Resultado> resultadoList;

    @OneToOne(mappedBy = "estudiante")
    private Encuesta encuesta;
}
