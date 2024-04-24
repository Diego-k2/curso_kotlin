fun main(args: Array<String>) {

    //TIPO VARIALVEL
    //VAL -> Constante
    //VAR -> Variavel

    //Comando de LOG
//    println("Começo com Kotlin");

    //DECLARANDO VARIAVEL COM SEU TIPO
    /*val nome:String = "Diego Santos";
    var idade:Int = 23;

    println(nome);
    println(idade);

    val aprendendo: Boolean = true;

    println(aprendendo);*/

    //USO DO WHEN, SE COMPORTA IGUAL A SWITCH CASE
//    val valorResultado: String = "Empate";
//
//    val result = when(valorResultado) {
//
//        "Vitoria" -> 3
//        "Empate" -> 1
//        "Derrota" -> 0
//        else -> 0
//
//    }
//
//    println(result);

    //USO DO WHILE
//    var contador = 0;
//
//    while (contador < 7) {
//        println(contador)
//        contador++
//    }

    //ARRAY
    val arrayMarcas = arrayOf("Nike", "Adidas", "Puma", "BK");

    println(arrayMarcas.size);

    for(i in arrayMarcas) {
        println(i);
    }


}