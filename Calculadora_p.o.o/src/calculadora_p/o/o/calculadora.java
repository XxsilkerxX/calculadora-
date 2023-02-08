            
package calculadora_p.o.o;


public class calculadora
{
    //atributos 
    private String digito;
    private double resultado;
    private boolean suma; // solo va a almacenar los valores true o false
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean raiz;
    private boolean power;
    private boolean IVA;
    private boolean sen;
    private boolean cos;
    private boolean tan;

//constructor
    public calculadora()
    {
        digito = "";
        resultado = 0;
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        raiz = false;
        power = false;
        IVA = false;
        sen = false;
        cos = false;
        tan = false;
        
    }
//getter y setter 
    public String getDigito() {//obtener valor del digito
        return digito;
    }

    public void setDigito(String digito) {//dar valor al digito
        this.digito = digito;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
//METODOS Y FUNCIONES
    
   public void agregarNum(int num)
   {
       setDigito(digito+num);
   }

   public void suma(String num)//se utiliza string porque se maneja el numero que se genera en el display de la calcu del boxtxt
   {
       this.resultado= Double.parseDouble(num);
       suma= true;// se utiliza esta linea para explicarle al programa que estoy usando la suma 
       setDigito("");
   }
    
   public void resta(String num)//se utiliza string porque se maneja el numero que se genera en el display de la calcu del boxtxt
   {
       this.resultado= Double.parseDouble(num);
       resta= true;// se utiliza esta linea para explicarle al programa que estoy usando la resta 
       setDigito("");
   }
   
   public void multiplicacion(String num)//se utiliza string porque se maneja el numero que se genera en el display de la calcu del boxtxt
   {
       this.resultado= Double.parseDouble(num);
       multiplicacion= true;// se utiliza esta linea para explicarle al programa que estoy usando la multiplicacion 
       setDigito("");
   }
   
   public void division(String num)//se utiliza string porque se maneja el numero que se genera en el display de la calcu del boxtxt
   {
       this.resultado= Double.parseDouble(num);
       division= true;// se utiliza esta linea para explicarle al programa que estoy usando la division 
       setDigito("");
   }
   
   public void raiz_n(String num)
   {
       this.resultado= Double.parseDouble(num);
       raiz= true;
       setDigito("");
   }   
   
   public void power(String num)
   {
       this.resultado= Double.parseDouble(num);
       power= true;
       setDigito("");
   }   
   
   public void IVA(String num)
   {
       this.resultado= Double.parseDouble(num);
       IVA= true;
       setDigito("");
   }   
   
    public void seno(String num)
   {
       this.resultado= Double.parseDouble(num);
       resultado=Math.toRadians(resultado);
       sen= true;
       setDigito("");
   }
    
    public void coseno(String num)
   {
       this.resultado= Double.parseDouble(num);
       resultado=Math.toRadians(resultado);
       cos= true;
       setDigito("");
   } 
   
    public void tangente(String num)
   {
       this.resultado= Double.parseDouble(num);
       resultado=Math.toRadians(resultado);
       tan= true;
       setDigito("");
   }
   
  public double calculo(String numero)
  {
      if(suma == true)
      {
          resultado = resultado + Double.parseDouble(numero);
      }
      
      if(resta == true)
      {
          resultado = resultado - Double.parseDouble(numero);
      }
      
      if(multiplicacion == true)
      {
          resultado = resultado * Double.parseDouble(numero);
      }
      
      if(division == true)
      {
          resultado = resultado / Double.parseDouble(numero);
      }
      
      if(raiz == true)
      {
          resultado = Math.pow( Double.parseDouble(numero),(1/resultado));
      }
      
      if(power == true)
      {
          resultado = Math.pow(resultado, Double.parseDouble(numero));
      }
      
      if(IVA == true)
      {
          resultado = (resultado/100)*Double.parseDouble(numero);
      }
      
      if(sen == true)
      {
          resultado = Math.sin(resultado);
      }
      
      if(cos == true)
      {
          resultado = Math.cos(resultado);
      }
      
      if(tan == true)
      {
          resultado = Math.tan(resultado);
      }
      
      //reseteo de valores 
      suma= false;
      resta= false;
      multiplicacion= false;
      division= false;
      raiz = false;
      power = false;
      IVA = false;
      sen = false;
      cos = false;
      tan = false;
      
      //retorno de valor generado
      return resultado;
      
      
  }
}
