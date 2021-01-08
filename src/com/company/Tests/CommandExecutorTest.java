package com.company.Tests;

import com.company.Coffee.PackageType;
import com.company.Commands.CommandExecutor;
import com.company.Commands.GoodsPrinter;
import com.company.Van.VanFiller;
import org.junit.jupiter.api.Test;


class CommandExecutorTest {

    @Test
    void executeCommand() {
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.executeCommand(new GoodsPrinter(VanFiller.Fill(1000,1000, PackageType.JAR).getGoods()));
    }
}