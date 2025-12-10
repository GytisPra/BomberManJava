package Interpreter;

import java.util.Map;

public class CommandInterpreter {
    private Map<String, ICommandExecutor> executors;

    public CommandInterpreter() {}

    private void registerExecutors() {}
    public String interpret(String input) { return null; }
    private CommandExpression parse(String input) { return null; }
}

