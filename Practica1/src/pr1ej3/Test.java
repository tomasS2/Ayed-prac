//3. Creaci√≥n de instancias mediante el uso del operador new
//a. Cree una clase llamada Estudiante con los atributos especificados abajo y
//sus correspondientes m√©todos getters y setters (haga uso de las facilidades
//que brinda eclipse)
//‚ó? nombre
//‚ó? apellido
//‚ó? comision
//‚ó? email
//‚ó? direccion
//b. Cree una clase llamada Profesor con los atributos especificados abajo y sus
//correspondientes m√©todos getters y setters (haga uso de las facilidades que
//brinda eclipse)
//‚ó? nombre
//‚ó? apellido
//‚ó? email
//‚ó? catedra
//‚ó? facultad
//c. Agregue un m√©todo de instancia llamado tusDatos() en la clase Estudiante
//y en la clase Profesor, que retorne un String con los datos de los atributos
//de las mismas. Para acceder a los valores de los atributos utilice los getters
//previamente definidos.
//d. Escriba una clase llamada Test con el m√©todo main, el cual cree un arreglo
//con 2 objetos Estudiante, otro arreglo con 3 objetos Profesor, y luego
//recorra ambos arreglos imprimiendo los valores obtenidos mediante el
//m√©todo tusDatos(). Recuerde asignar los valores de los atributos de los
//objetos Estudiante y Profesor invocando los respectivos m√©todos setters.
//e. Agregue dos breakpoints, uno en la l√≠nea donde itera sobre los estudiantes y
//otro en la l√≠nea donde itera sobre los profesores
//f. Ejecute el Test en modo debug y avance paso a paso visualizando si
//estudiante o el profesor recuperado es lo esperado.

package pr1ej3;

public class Test {

	public static void main(String[] args) {
		Estudiante aEstudiantes[]   = new Estudiante[2];
		Profesor aProfesores[] = new Profesor [3];
		
		
		//seteo los estudiantes.
		aEstudiantes[0]=new Estudiante();
		aEstudiantes[0].setNombre("tomas");
		aEstudiantes[0].setApellido("gomez");
		aEstudiantes[0].setComision("3");
		aEstudiantes[0].setDireccion("23 entre 32");
		aEstudiantes[0].setMail("pepepe gmail");
		
		aEstudiantes[1]=new Estudiante();
		aEstudiantes[1].setNombre("jorfe");
		aEstudiantes[1].setApellido("pere");
		aEstudiantes[1].setComision("2");
		aEstudiantes[1].setDireccion("59 entre 4");
		aEstudiantes[1].setMail("martin gmail");
			
			
		//seteo los profesores
		
		aProfesores[0]= new Profesor();
		aProfesores[0].setNombre("martin");
		aProfesores[0].setApellido("martinez");
		aProfesores[0].setCatedra("cadp");
		aProfesores[0].setMail("martin gmail");
		aProfesores[0].setFacultad("informatica");
		
		aProfesores[1]= new Profesor();
		aProfesores[1].setNombre("pedro");
		aProfesores[1].setApellido("perez");
		aProfesores[1].setCatedra("matematica 1");
		aProfesores[1].setMail("pepe gmail");
		aProfesores[1].setFacultad("arquitectura");
		
		aProfesores[2]= new Profesor();
		aProfesores[2].setNombre("jose");
		aProfesores[2].setApellido("basualdo");
		aProfesores[2].setCatedra("literatura romana");
		aProfesores[2].setMail("joseloco gmail");
		aProfesores[2].setFacultad("derecho");
		int i;
		for (i=0; i<aEstudiantes.length; i++) {
			System.out.println(aEstudiantes[i].tusDatos());
		}
		for (i=0; i<aProfesores.length; i++) {
			System.out.println(aProfesores[i].tusDatos());
		}
	}

}
