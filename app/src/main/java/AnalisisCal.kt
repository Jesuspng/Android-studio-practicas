package alalis.cal

fun main(){
val cal = AnalisisCal();

    cal.llenar();
    print(cal.calcularPromedio());
    print("\ncantidad de aprobadas ${cal.contarcalAprobadas()}");
    print("\ncantidad de reprobadas ${cal.contarReprobadas()}");
    print("\nCalificacion minima: ${cal.calificacionMinnima()}");
    print("\nCalificacion maxima: ${cal.calificacionMaxima()}");



}

class AnalisisCal {

    var calificaciones=mutableListOf<Float>()

    fun llenar(){

        for(i in 1..7){
            println("Captura la calificacion ${i}: ");
            val cal: Float=readln().toFloat();
            calificaciones.add(cal);
        }


    }
    fun calcularPromedio(): Float{
        var prom: Float;
        prom=0F;
        for(i in 1..7){
            prom+=calificaciones.get(i-1);

        }
        return prom/7;
    }

    fun contarcalAprobadas():Int{
        var aprobadas:Int;
        aprobadas=0;

        for(i in 0..6){
            if(calificaciones.get(i)>=7)
            aprobadas+=1;


        }
        return aprobadas
    }

        fun contarReprobadas():Int{
            var reprobadas:Int;
            reprobadas=0;

            for(i in 0..6){
                if(calificaciones.get(i)<7){
                    reprobadas+=1;
                }
            }
            return reprobadas
        }

    fun calificacionMaxima():Float{
        var max: Float;
        max=0F;
        for(i in 0..6){
            if(calificaciones.get(i)>max){
                max=calificaciones.get(i);
            }
        }
        return max
    }

    fun calificacionMinnima(): Float{
        var min: Float;
        min=this.calificacionMaxima();
        for(i in 0..6){
            if(calificaciones.get(i)<min){
                min=calificaciones.get(i);
            }
        }
        return min
    }

}
