import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import sun.misc.Version.println

fun main(args: Array<String>) {
    val num = readLine()!!.toInt()
    //Se manda llamar la funcion fizz de acuerdo al numero que se ingresa en consola
    if(num in 0...99999){
        //si cumple con el rango se manda llamar la funcon fizz con el numero de prueba

        fizz(num)
    }else printl("Numero no valido")
    //Si no cumple se manda mensaje de que no era un valor valido
}
fun fizz(num: Int){
    if(num%5==0&&num%3!=0){
        println("Fizz!")
        //Si es multiplo de 5 solamente se manda la cadena fizz
    }else if(num%3==0&&num%5!=0){
        println("Buzz!")
        //Si es multiplo de 3 solamente se manda la cadena buzz
    }else if(num%3==0 && num%5==0){
        println("FizzBuzz!")
        //Si es multiplo de 5 y 3 se manda la cadena fizzBuzz
    }else{
        noFizz(num)
        //se manda llamar la funcion noFizz cuando el numero no es multiplo ni de 3 ni de 5
    }
}
fun noFizz(num: Int){
    //en esta parte el numero se descompone en centenas, decenas, unidades y se manda
    //imprimir segun sea el modulo de los numeros en los que se descompone el numero
    //original
    var aux: Int =num
    if(aux/10000!=0) {
        var x: Int = aux / 10000
        aux-=x*10000
        if (x == 1) {
            println("Diez")
        } else if (x == 2) {
            println("Veinte")
        } else if (x == 3) {
            println("Treinta")
        } else if (x == 4) {
            println("Cuarenta")
        } else if (x == 5) {
            println("Cincuenta")
        } else if (x == 6) {
            println("Seisienos")
        } else if (x == 7) {
            println("Setecientos")
        } else if (x == 8) {
            println("Ochocientos")
        } else if (x == 9) {
            println("Noventa")
        }
    }
    if(aux/1000!=0) {
        var x: Int = aux / 1000
        aux-=x*1000
        if (x == 1) {
            println("Mil")
        } else if (x == 2) {
            println("Dos mil")
        } else if (x == 3) {
            println("Tres mil")
        } else if (x == 4) {
            println("Cuatro mil")
        } else if (x == 5) {
            println("Cinco mil")
        } else if (x == 6) {
            println("Seis mil")
        } else if (x == 7) {
            println("Siete mil")
        } else if (x == 8) {
            println("Ocho mil")
        } else if (x == 9) {
            println("Nueve mil")
        }
    }


    if(aux/100!=0) {
        var x: Int = aux/100
        aux-=x*100
        if (x == 1) {
            println("Cien")
        } else if (x == 2) {
            println("Docientos")
        } else if (x == 3) {
            println("Trecientos")
        } else if (x == 4) {
            println("Cuatrocientos")
        } else if (x == 5) {
            println("Quinientos")
        } else if (x == 6) {
            println("Seicientos")
        } else if (x == 7) {
            println("Setecientos")
        } else if (x == 8) {
            println("Ochocientos")
        } else if (x == 9) {
            println("Novecientos")
        }
    }
    if(aux/10!=0) {
        var x: Int = aux/10
        aux-=x*10
        if (x == 2) {
            println("Veinte")
        } else if (x == 3) {
            println("Treinta")
        } else if (x == 4) {
            println("Cuarenta")
        } else if (x == 5) {
            println("Cincuenta")
        } else if (x == 6) {
            println("Sesenta")
        } else if (x == 7) {
            println("Setenta")
        } else if (x == 8) {
            println("Ochenta")
        } else if (x == 9) {
            println("Noventa")
        }
    }

    if(aux/1!=0) {
        var x: Int = aux/1
        aux-=x*1
        if (x == 1) {
            println("UNO")
        } else
            if (x == 2) {
                println("DOS")
            } else if (x == 3) {
                println("TRES")
            } else if (x == 4) {
                println("CUATRO")
            } else if (x == 5) {
                println("CINCO")
            } else if (x == 6) {
                println("SEIS")
            } else if (x == 7) {
                println("SIETE")
            } else if (x == 8) {
                println("OCHO")
            } else if (x == 9) {
                println("NUEVE")
            }
    }

}
