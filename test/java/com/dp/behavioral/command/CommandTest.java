package com.dp.behavioral.command;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CommandTest {
    private static List<Command> commands;

    @BeforeClass
    public static void initialize() {
        commands = Arrays.asList(new SvnCommand(), new GitCommand());
    }

    @Test
    public void executeGit() {
        commands.stream()
                .filter(a-> a.checkName("git"))
                .findAny()
                .orElse(null)
                .execute("Param 1", "Param 2");
    }

    @Test
    public void executeSvn() {
        commands.stream()
                .filter(a-> a.checkName("svn"))
                .findAny()
                .orElse(null)
                .execute("Param 1", "Param 2");
    }
}
