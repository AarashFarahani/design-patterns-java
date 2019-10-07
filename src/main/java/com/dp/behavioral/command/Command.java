package com.dp.behavioral.command;

public abstract class Command {
    abstract void execute(String... params);

    protected String name;

    public Command(String name) {
        this.name = name;
    }

    public boolean checkName(String command) {
        return this.name.equalsIgnoreCase(command);
    }
}
