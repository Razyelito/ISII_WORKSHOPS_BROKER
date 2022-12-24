package lib;

import java.util.Scanner;

/**
 * The Carlnsurance class is a silly example to illustrate documentation.
 */

class Carlnsurance { /* clase principal */
  static int edad; // The age of the customer.
  static String sexo; // The sex of customer.
  static String eCivil;
  static final int PRIMA_BASE = 500;
  static final int CASADO_OMUJER = 200;
  static final int DESCUENTO_EDAD = 100;
  static final int RECARGO_HOMBRE_JOVENSOLTERO = 1500;

  /**
   * Constructor de la clase.
   */
  public Carlnsurance(int valoredad, String valorsexo, String estado) {
    setEdad(valoredad);
    setSexo(valorsexo);
    setEstado(estado);
	
  }

  public static void setEdad(int valoredad) {
    edad = valoredad;
  }

  public static int getEdad() {
    return edad;
  }

  public static void setSexo(String valorsexo) {
    sexo = valorsexo;

  }

  public static String getSexo() {
    return sexo;

  }

  public static void setEstado(String estado) {
    eCivil = estado;

  }

  public static String getEstado() {
    return eCivil;

  }

  public static int calcularInsurance(String licencia) {
    int premium = PRIMA_BASE;
    int recargo=RECARGO_HOMBRE_JOVENSOLTERO;
    Scanner lector = new Scanner(System.in, "utf-8");

    if ((getEdad() >= 80) || licencia.equals("No Valido") || (getEdad() < 18)) {
      System.out.println("No podemos vender seguros a mayores de 80 años, menores de 18 o sin licencias validas");
      premium = 0;
    }

      if ((getSexo().equals("M")) && (getEstado().equals("N")) && (getEdad() <= 24)) {
        premium += recargo;
      }

      if ((getEstado().equals("Y")) || (getSexo().equals("F"))) {
        premium -= CASADO_OMUJER;
      }

      if (((getEdad() >= 45) && (getEdad() < 65)) && (getSexo().equals("M"))) {
        premium -= DESCUENTO_EDAD;
      }
      
      if (((getEdad() >= 45) && (getEdad() < 65)) && getSexo().equals("F")) {
          premium -= DESCUENTO_EDAD;
        }
      
            

    
    lector.close();
    return premium; 
    
  }

 
}