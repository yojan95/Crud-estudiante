package prueba;

public class Main {
	
	public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
	
	 public static double calcularAreaCirculo(double radio) {
	        return Math.PI * Math.pow(radio, 2); 
	    }

	public static void main(String[] args) {
		double result1 = calcularAreaTriangulo(0, 0);
		System.out.println("calcularAreaTriangulo: "+result1);
		double result2 = calcularAreaCirculo(0);
		System.out.println("calcularAreaTriangulo "+result2);
		
	}

	
}
