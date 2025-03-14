public class Practic {
    public static void main(String[] args) throws Exception {
        byte edad = 20;
        float altura = 1.73f;
        char inicialNombre = 'L';
        boolean esMayor;
        if (edad>=18) {
            esMayor = true;
        } else {
            esMayor = false;
        }  
            System.out.println("edad : " + edad);
            System.out.println("altura : " + altura);
            System.out.println("inicialNombre :" + inicialNombre);
            System.out.println("esMayor :" + esMayor);
        }
    }