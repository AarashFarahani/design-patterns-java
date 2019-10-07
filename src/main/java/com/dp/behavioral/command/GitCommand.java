package com.dp.behavioral.command;

public class GitCommand extends Command {
    public GitCommand() {
        super("git");
    }

    @Override
    public void execute(String... params) {
        System.out.println("git executed");

        if (params != null) {
            for (String item : params) {
                System.out.println(item);
            }
        }
    }
}
