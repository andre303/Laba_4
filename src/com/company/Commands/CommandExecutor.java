package com.company.Commands;

import com.company.Van.UnitOfGoods;

import java.util.ArrayList;

public class CommandExecutor {
    private final ArrayList<Command> commands = new ArrayList<>();
    public ArrayList<UnitOfGoods> executeCommand(Command command){
        if ( !commands.contains(command) )
            commands.add(command);
        return command.execute();
    }
}
