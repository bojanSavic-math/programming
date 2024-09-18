package programi;

public enum SkriptJezik {
    PYTHON,
    PERL,
    PHP,
    JAVA_SCRIPT,
    RUBY,
    LUA;

    public static String ekstenzijaJezika(SkriptJezik sj) {
        switch (sj) {
            case PYTHON: return "py";
            case PERL: return "prl";
            case PHP: return "php";
            case JAVA_SCRIPT: return "js";
            case RUBY: return "rby";
            case LUA: return "lua";
            default: return "";
        }
    }
}
