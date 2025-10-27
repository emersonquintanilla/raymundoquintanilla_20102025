/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raymundoquintanilla_20102025;

/**
 *
 * @author magod
 */
public class Pila 
{ 
    private int[] elementos;
    private int cima;
    private int capacidad;
    
    //metodo de clase pila    
    public Pila(int tamano)
    {        
        //elementos que se almacenara en la pila
        this.capacidad = tamano;
        //se crea un nuevo arreglo tipo enterp
        this.elementos = new int[this.capacidad];
        this.cima = -1;        
    }
    
    //metodo para verificar que la pila este vacia    
    public boolean estaVacia()
    {        
        if(this.cima == -1)
        {
            //el valor de la cima es -1 por lo que la pila esta vacia
            return true;
        }
        else
        {
            //si el valor es diferente a -1 significa que hay al menos 
            //1 elemento esta en la pila
            return false;
        }        
    }
    
        //método para verificar si la pila está llena, de esta manera tomar la decisión
        //de no seguir alimentando la pila
        public boolean estaLlena()
        {        
        if(this.cima == (this.capacidad -1))
        {
        //el valor de la cima es igual a los elementos
        return true;
        }
        else
            {
            //el valor de la cima es diferente a la cantidad de elementos
            return false;
            }
        }

    //devuelve el valor de la cima, es decir el valor del último elemento
    //que fue insertado al arreglo
    public int tamano()
    {
    return this.cima + 1;
    }    

    public void push(int elemento)
  {        
    //primero se verifica si la pila está llena
    if(estaLlena()){
        System.out.println("La pila está llena, no puede agregar el valor: " + elemento);
        //return;
    }
    else
    {
    //se incrementa el valor de la cima
    this.cima++; 
        
    //se agrega el nuevo elemento al arreglo de la pila
    this.elementos[this.cima] = elemento;         
    System.out.println("El valor " + elemento + " fue agregado a la pila");
    }
   }

    //método para extraer un elemento de la pila (el último que ha sido insertado al arreglo)
    public int pop()
{        
    //se verifica que la pila no esté vacía para poder extraer un elemento
    if(estaVacia())
    {
        //si está vacía, se notifica al usuario
        System.out.println("La pila está vacía, no puede hacer la extracción del elemento");
        //no se realiza ninguna acción
        return -1;
    }
    else
    {
        //si hay elementos que extraer, se crea una nueva variable
        //que almacenará el valor que será extraído
        //la nueva variable posee el valor del último elemento insertado al arreglo
        int elementoExtraido = this.elementos[this.cima]; 
        
        //se reduce el valor de la cima debido a que ya se extrajo el elemento
        this.cima--; 
        
        //se devuelve al usuario el valor que fue extraído
        return elementoExtraido; 
    }
}  

    //método para verificar el último valor insertado, es decir,
    //ver el valor que se puede extraer de la pila
    public int peek()
{        
    //se verifica si está vacía
    if(estaVacia())
    {
        //si está vacía, se muestra el mensaje al usuario
        System.out.println("La pila está vacía");
        //no se realiza ninguna acción
        return -1;
    }
    else
    {
        //se devuelve al usuario el último elemento que fue insertado
        //y que es el próximo elemento a ser extraído
        return this.elementos[this.cima];
    }
}
    //método para imprimir los valores que posee una pila, es decir,
    //imprimir todos los valores del arreglo, desde el último que fue
    //agregado, hasta el primero (en ese orden)
       public void mostrar()
{        
    //se verifica que la pila no esté vacía
    if(estaVacia())
    {
        //si está vacía, no se realiza nada
        System.out.println("La pila está vacía");
    }
    else
    {
        //se imprime la salida al usuario
        System.out.print("Contenido de la pila (desde la cima, hasta la base de la pila)");

        //se inicia la estructura con corchete de apertura "["
        System.out.print("[");
        
        //se debe recorrer el arreglo de la pila para poder imprimir cada valor
        //el recorrido inicia desde el valor de la cima, es decir,
        //desde la última posición agregada al arreglo, mientras el valor de "i" sea
        //mayor o igual a cero (es decir que aún no ha llegado a la base de la pila),
        //el valor de "i" estará en decremento hasta llegar a cero
        for(int i = this.cima; i >= 0; i--)
        {
            //se imprime cada valor en su posición correspondiente de manera continua (sin saltos de línea)
            System.out.print(this.elementos[i]);
            
            //se verifica si el valor de "i" es mayor que cero para poder imprimir una coma
            if(i > 0)
            {
                //"i" no ha llegado a cero, por lo tanto, se puede imprimir una coma
                //se imprime una coma
                System.out.print(",");                    
            }
        }
        
            //se cierra la estructura de corchete para la salida final del usuario
            System.out.print("]");
        }
    }
}