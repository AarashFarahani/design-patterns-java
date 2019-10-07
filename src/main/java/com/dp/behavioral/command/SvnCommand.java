package com.dp.behavioral.command;

public class SvnCommand extends Command {
    public SvnCommand() {
        super("svn");
    }

    @Override
    public void execute(String... params) {
        System.out.println("svn executed");

        if (params != null) {
            for (String item : params) {
                System.out.println(item);
            }
        }
    }
}
