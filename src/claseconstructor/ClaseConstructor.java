
package claseconstructor;


public class ClaseConstructor {

    public static void main(String[] args) {
   int idCliente;
   String nombre;
   String direccion;
//creando objeto en base al constructor por defecto
   
    Cliente cli1=new Cliente();
        System.out.println(cli1.getNombre());
        System.out.println(cli1.getIdCliente());
        System.out.println(cli1.getDireccion());
        

//Creando objeto en base al constructor que que recibe tres parametros
    Cliente cli2=new Cliente(20, "Maria Lora", "Duarte #8");
        System.out.println(cli2.getNombre());
        System.out.println(cli2.getIdCliente());
        System.out.println(cli2.getDireccion());
    
//Creando objeto en base al constructor que recibe 2 parametros
    Cliente cli3=new Cliente(30, "Carlos Vive", "El vive lejos!!");
        System.out.println(cli3.getNombre());
        System.out.println(cli3.getIdCliente());
        System.out.println(cli3.getDireccion());
    
    
    }
    
}
