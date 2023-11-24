class Main {
    public static void main(String[] args) {
        // Crear una instancia de SpellChecker
        IocSpellChecker sc = new SpellChecker();

        // Inyectar la dependencia en TextEditor
        TextEditor textEditor = new TextEditor(sc);

        // Ahora puedes usar tu objeto textEditor con la dependencia inyectada
        textEditor.checkText("Hola mundo");
    }
}