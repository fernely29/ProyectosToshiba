package ejerciciostring;
public class EjercicioString {
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres= "Ludwin Fernely", apellidos = "Ajualip Morales", edad ="27", genero ="Masculino", 
                autor ="Miguel Angel Asturias", color = "Cafe", comida= "Pizza", cadena;
        
        cadena = "Mi nombre es: "+nombres+" "+apellidos+" tengo "+edad+" años de edad y me gusta leer obras literarias "
                + "del autor: "+autor+" mi color favorito es: "+color+" y mi comida favorita es la: "+"mi genero es: "+genero;
        System.out.println(cadena);
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
    }
    
}
