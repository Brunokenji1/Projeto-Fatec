//usando o metodo contains para verificar se contem tal letra em tal string
String texto = "Copilot";
char letra = 'o';
if (texto.contains(String.valueOf(letra))) {
    System.out.println("A letra está na string!");
}


// usando o indexOf para verificar em qual posição
String texto = "Copilot";
char letra = 'o';
int posicao = texto.indexOf(letra);
if (posicao != -1) {
    System.out.println("A letra está na posição: " + posicao);
}


// percorre a string pelo loop
String texto = "Copilot";
char letra = 'o';
int contador = 0;
for (int i = 0; i < texto.length(); i++) {
    if (texto.charAt(i) == letra) {
        contador++;
    }
}
System.out.println("A letra aparece " + contador + " vez(es).");
