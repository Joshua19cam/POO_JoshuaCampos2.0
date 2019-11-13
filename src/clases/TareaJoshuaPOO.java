/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


/**
 *
 * @author Joshua C.H
 */
public class TareaJoshuaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Los atributos de las clases ya estan encapsulados :)
 //-----------------------------Alumno------------------------------------------
        Alumno juan=new Alumno("Juan Carlos", 2019670071,"Mecatronica"); 
        Alumno luis=new Alumno("Luis", 2019670073,"Sistemas");
        System.out.println(juan.getNombre());//aqui ya esta ncapsulado y podemos cambiar el atributo
        juan.setNombre("Juan Palonino");
        System.out.println(juan.getNombre());
//-----------------------------Audifonos----------------------------------------      
        Audifonos a=new Audifonos("Skullcandy", 500, "Buds");
        Audifonos b=new Audifonos("Pionner", 1400, "BIg bass");
        System.out.println(a.getMarca());
        a.setMarca("Sony");
        System.out.println(a.getMarca());
//-----------------------------Billete------------------------------------------        
        Billete benito=new Billete(500, "Azul", "Benito Juarez");
        Billete morelos=new Billete(50, "Rosa", "Morelos");
        System.out.println(benito.getCantidad());
        benito.setCantidad(20);
        System.out.println(benito.getCantidad());
//-----------------------------Caja---------------------------------------------        
        Caja chica=new Caja(20, 20, 10);
        Caja grande=new Caja(100, 120, 110);
        System.out.println(grande.getProfundidad());
        grande.setProfundidad(200);
        System.out.println(grande.getProfundidad());
//-----------------------------Camisa-------------------------------------------        
        Camisa uno=new Camisa("Adidas", 400, "s");
        Camisa dos=new Camisa("Cuidado con el perro", 450, "m");
        System.out.println(dos.getMarca());
        dos.setMarca("Nike");
        System.out.println(dos.getMarca());
//-----------------------------Cancion------------------------------------------        
        Cancion cumbia=new Cancion("Cumbia", "Los angeles azules", 1990);
        Cancion electronica1=new Cancion("Dubstep", "Skrillex", 2000);
        System.out.println(cumbia.getArtista());
        cumbia.setArtista("Cañaveral");
        System.out.println(cumbia.getArtista());
//-----------------------------Carro--------------------------------------------        
        Carro nissan=new Carro("Nissan", "Versa", 4);
        Carro ferrari=new Carro("Ferrari", "Legion 3", 4);
        System.out.println(nissan.getModelo());
        nissan.setModelo("Tida");
        System.out.println(nissan.getModelo());
//-----------------------------Casa---------------------------------------------        
        Casa big=new Casa(6, 7, 5);
        Casa peque=new Casa(4, 3, 4);
        System.out.println(big.getPuertas());
        big.setPuertas(10);
        System.out.println(big.getPuertas());
//-----------------------------Celular------------------------------------------       
        Celular xiaomi=new Celular("Xiaomi", "Redmi note 4", 3000);
        Celular iphone=new Celular("iPhone", "Xs", 15000);
        System.out.println(xiaomi.getPrecio());
        xiaomi.setPrecio(20000);
        System.out.println(xiaomi.getPrecio());
//-----------------------------Ciudad-------------------------------------------        
        Ciudad zac=new Ciudad("Guadalupe", "Zacatecas", 150000);
        Ciudad rio=new Ciudad("Rio grande", "Zacatecas", 1000000);
        System.out.println(rio.getNombre());
        rio.setNombre("Tlaltenango");
        System.out.println(rio.getNombre());
//-----------------------------Empleado-----------------------------------------
        Empleado x=new Empleado("Joshua", "1234joshua", 200);
        Empleado y=new Empleado("Omar", "2346omar", 800);
        System.out.println(x.getSalario());
        x.setSalario(10000);
        System.out.println(x.getSalario());
//-----------------------------Escuela------------------------------------------        
        Escuela upiiz=new Escuela("UPIIZ", "1U2P3I4I5IZ", 4000);
        Escuela uaz=new Escuela("UAZ", "UAZ777", 10000);
        System.out.println(upiiz.getAlumnos());
        upiiz.setAlumnos(5785);
        System.out.println(upiiz.getAlumnos());        
//-----------------------------Figura-------------------------------------------       
        Figura tri=new Figura(3, "Triangulo");
        Figura penta=new Figura(5, "Pentagono");
        System.out.println(tri.getNombre()+"-"+tri.getLados());
        tri.setLados(9);
        tri.setNombre("eneagono");
        System.out.println(tri.getNombre()+"-"+tri.getLados());
//-----------------------------Libro--------------------------------------------        
        Libro libro1=new Libro("La cabaña", "Young L.", 300);
        Libro libro2=new Libro("Calculo", "Cosmy P.", 100);
        System.out.println(libro2.getAutor());
        libro2.setAutor("Pana");
        System.out.println(libro2.getAutor());
//-----------------------------Perro--------------------------------------------        
        Perro chaneke=new Perro("Chaneke", "Pitbull", "+culino", 2, "Blanco");
        Perro firu=new Perro("Firulais", "Callegera", "+culino", 2, "Cafe");
        System.out.println(firu.getEdad());
        firu.setEdad(7);
        System.out.println(firu.getEdad());
//-----------------------------Procesador---------------------------------------     
        Procesador amd=new Procesador("AMD", "Ryzen 2400G", 8);
        Procesador intel=new Procesador("Intel", "Core i9 8100k", 10);
        System.out.println(intel.getNucleos());
        intel.setNucleos(5);
        System.out.println(intel.getNucleos());
//-----------------------------Sabritas-----------------------------------------        
        Sabritas limon=new Sabritas("Sabritas", "Limon", 55);
        Sabritas rufles=new Sabritas("Rufles Flammin hot", "Chile habanero", 60);
        System.out.println(rufles.getSabor());
        rufles.setSabor("Queso");
        System.out.println(rufles.getSabor());
//-----------------------------Tennis-------------------------------------------        
        Tennis vans=new Tennis("VANS", "SK8", 27);
        Tennis puma=new Tennis("Puma", "Los correlones", 23);
        System.out.println(vans.getTalla());
        vans.setTalla(29);
        System.out.println(vans.getTalla());
//-----------------------------Usuario------------------------------------------        
        Usuario entrante1=new Usuario("JoshuaxXx19", "joshuacam.mx@gmail.com", "contraseña111");
        Usuario entrante2=new Usuario("Om4rXmaicra", "omarmaicra@gmail.com", "ilovemainca");
        System.out.println(entrante2.getNombre());
        entrante2.setNombre("OMARRRRR");
        System.out.println(entrante2.getNombre());
//-----------------------------Cama---------------------------------------------        
        Cama one=new Cama("SprinAir", "Matrimonial", "Roja"); 
        Cama two=new Cama("Flex", "Individual", "Cafe");
        System.out.println(two.getColor());
        two.setColor("Anaranjado");
        System.out.println(two.getColor());
        
        System.out.println();
        
    }
    
}
