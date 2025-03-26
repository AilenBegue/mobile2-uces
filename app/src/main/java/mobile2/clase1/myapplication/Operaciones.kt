package mobile2.clase1.myapplication

class Operaciones(val operadores: Operadores) {
    fun suma(): Int {
        return operadores.num1 + operadores.num2
    }

    fun resta(): Int {
        return operadores.num1 - operadores.num2
    }

    fun multiplicacion(): Int {
        return operadores.num1 * operadores.num2
    }

    fun division(): Int {
        return operadores.num1 / operadores.num2
    }

    fun checkDivision(): Boolean {
        return operadores.num2 != 0 && operadores.num1 >= operadores.num2 && (operadores.num1 % operadores.num2) == 0
    }

    fun getErrorMessage(errorType: DivError): String {
        return when (errorType) {
            DivError.DIV_0 -> "No se puede dividir por 0"
            DivError.DIV_2_MAYOR_QUE_1 -> "El segundo número ingresado debe ser menor o igual al primero"
            DivError.DIV_RESTO_CERO -> "La operación no puede tener resto"
        }
    }

    fun getError(): DivError {
        return when {
            operadores.num2 == 0 -> DivError.DIV_0
            operadores.num1 < operadores.num2 -> DivError.DIV_2_MAYOR_QUE_1
            else -> DivError.DIV_RESTO_CERO
        }
    }
}


    enum class DivError() {
        DIV_0,
        DIV_2_MAYOR_QUE_1,
        DIV_RESTO_CERO
}