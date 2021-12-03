///Ejercicio 5.9
//Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta y un saldo
//disponible. Además, se puede consultar el saldo disponible, recibir abonos y realizar pagos.

//Crear además una clase Persona, que se caracteriza por un DNI y un vector (Preguntar al profesor si tienes dudas
//sobre vector) de cuentas bancarias. La Persona puede tener asociada hasta 3 cuentas bancarias, y debe tener un
//método que permita añadir cuentas (hasta 3 que es el máximo). También debe contener un método que
//devuelva si la persona es morosa (si tienen alguna cuenta con saldo negativo).

//En el programa principal, instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta, una
//sin saldo inicial y otra con 700 euros. La persona recibe la nómina mensual, por lo que ingresa 1100 euros en la
//primera cuenta, pero tiene que pagar el alquiler de 750 euros con la segunda. Imprimir por pantalla si la persona
//es morosa.

//Posteriormente hacer una transferencia de una cuenta a otra (de forma que todos los saldos sean positivos) y
//mostrar por pantalla el estado de la persona.
class Cuenta (private var numCuenta: String,private  var saldo:Double){
   fun consultarSaldo(){
       println("El saldo de su cuenta Nº: $numCuenta es $saldo €")
    }
    fun recibirAbono(abono:Double){
       saldo+=abono
        println("Se ha realizado un abono a su cuenta $numCuenta de $abono €")
    }
    fun realizaPago(pago:Double,otraCuenta:String){
        saldo-=pago
        println("pago realizado de $pago € a la cuenta $otraCuenta")
    }
    fun getSaldo():Double{
        return saldo
    }
    fun getNumCuenta():String{
        return numCuenta
    }

}

fun main() {
    val cuenta1=Cuenta("CuentaA",0.0)
    val cuenta2=Cuenta("CuentaA",700.0)

    val misCuentas= arrayOf(cuenta1,cuenta2,null)


    val p1 = Persona ("48977644T", misCuentas)
    //p1.añadirCuenta(1,"CuentaB",700.0)
    p1.misCuentas[0]?.recibirAbono(1100.0)
    p1.misCuentas[1]?.realizaPago(750.0,"Cuenta de el alquiler")
    println("Es $p1 "+p1.comprobarMoroso())
}