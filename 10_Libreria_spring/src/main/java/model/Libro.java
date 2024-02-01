package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="libros")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Libro {
	
	@Id
	private int isbn;
	private String titulo;
	private String autor;
	private double precio;
	private int idTema;

	
	

}
