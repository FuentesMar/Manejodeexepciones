public class NumeroNegativoException extends Exception {

    public NumeroNegativoException(String palabra){

        super(palabra);
    }

    public NumeroNegativoException(String palabra, Throwable error){
        super(palabra, error);
    }
}
