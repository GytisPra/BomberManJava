package Interpreter;

import java.util.List;
import java.util.Map;

public class CommandContext {
    private String input;
    private String command;
    private List<String> arguments;
    private Map<String, Object> variables;
    private String output;
    private boolean isValid;

    public String getInput() { return null; }
    public void setInput(String input) {}
    public String getCommand() { return null; }
    public void setCommand(String command) {}
    public List<String> getArguments() { return null; }
    public void setArguments(List<String> arguments) {}
    public Map<String, Object> getVariables() { return null; }
    public void setVariables(Map<String, Object> variables) {}
    public String getOutput() { return null; }
    public void setOutput(String output) {}
    public boolean isValid() { return false; }
    public void setValid(boolean valid) {}
}

