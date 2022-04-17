public class Ejercicios {

    public void EjercicioIf(int numeroIf){
        System.out.println("---- IF---------");
        if(numeroIf  > 0){
            System.out.println("Es número positivo");
        }else if(numeroIf<0){
            System.out.println("Número negativo");
        }else{
            System.out.println("Es 0");
        }

    }

    public void EjercicioWhile(){
        int numeroWhile = 0;

        System.out.println("---- WHILE---------");
        while(numeroWhile < 3){

            System.out.println(numeroWhile);
            numeroWhile++;
        }

    }

    public void EjercicioDoWhile(){
        int  numeroWhile = 0;

        System.out.println("---- DO - WHILE---------");
        do{

            System.out.println(numeroWhile);

            numeroWhile++;
        }while (numeroWhile <1);
    }

    public void EjercicioFor(){

        System.out.println("---- FOR---------");

        for(int numeroFor = 0; numeroFor<=3; numeroFor++){
             System.out.println(numeroFor);
         }
    }

    public void EjercicioSwitch( String estacion){



        System.out.println("---- SWITCH--------");

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;

            default:
                System.out.println("Esa estación no existe");

        }
    }
}
