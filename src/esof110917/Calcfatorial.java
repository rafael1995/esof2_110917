package esof110917;


public class Calcfatorial {
	
    public static long fatorial(int num) throws NotValidNumber {
    	if(num < 0 || num > 25){
    		throw new NotValidNumber("Parametro Inválido: "+num);
    	}
        if (num <= 1) {
            return 1;
        } else {
            return fatorial(num - 1) * num;
        }
    }
    
}
