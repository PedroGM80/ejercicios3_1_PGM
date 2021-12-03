import javax.swing.SizeRequirements

class Persona(private var DNI: String, var misCuentas: Array<Cuenta?> = arrayOfNulls(3) ) {

    override fun toString(): String {
        return "Persona(DNI='$DNI)"
    }
fun añadirCuenta(posCuenta:Int,aNumCuenta:String,saldoInicial:Double){
misCuentas[posCuenta]=Cuenta(aNumCuenta,saldoInicial)
    }
    fun comprobarMoroso():String{
        for (cuenta in misCuentas){
            if (cuenta != null) {
                if(cuenta.getSaldo()<=0.0){
                    return " es moroso."
                }
            }

        }
        return " no es moroso."
    }
}

