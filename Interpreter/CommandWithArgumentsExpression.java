package Interpreter;

import java.util.List;

public class CommandWithArgumentsExpression extends CommandExpression {
    private CommandTerminalExpression command;
    private List<ArgumentExpression> arguments;

    public CommandWithArgumentsExpression(CommandTerminalExpression command, List<ArgumentExpression> arguments) {}

    public void interpret(CommandContext context) {}
}

