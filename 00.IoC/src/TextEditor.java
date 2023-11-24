class TextEditor {
    private IocSpellChecker checker;

    public TextEditor(IocSpellChecker checker) {
        this.checker = checker;
    }

    public void checkText(String text) {
        checker.checkSpelling(text);
    }
}