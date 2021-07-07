package com.tian.designcode.eventDriven.a_CommandDriven.registry;

import com.tian.designcode.eventDriven.a_CommandDriven.command.Command;
import com.tian.designcode.eventDriven.a_CommandDriven.command.Query;
import com.tian.designcode.eventDriven.a_CommandDriven.handler.CommandHandler;
import com.tian.designcode.eventDriven.a_CommandDriven.handler.QueryHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.core.GenericTypeResolver;

import java.util.HashMap;
import java.util.Map;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 21:47
 */
public class Registry {

    private Map<Class<? extends Command>, CommandProvider> commandProviderMap = new HashMap<>();
    
    private Map<Class<? extends Query>, QueryProvider> queryProviderMap = new HashMap<>();

    private Registry(ApplicationContext applicationContext) {

        String[] commandHandlerNames = applicationContext.getBeanNamesForType(CommandHandler.class);
        for(String name : commandHandlerNames){
            registerCommand(applicationContext, name);
        }
        
        String[] queryHandlerNames = applicationContext.getBeanNamesForType(Query.class);
        for(String name : queryHandlerNames){
            registerQuery(applicationContext, name);
        }
    }

    private void registerCommand(ApplicationContext applicationContext, String name) {
        Class<CommandHandler<?,?>> handlerClass = (Class<CommandHandler<?,?>>)applicationContext.getType(name);
        // 获取class上的泛型
        Class<?>[] generics = GenericTypeResolver.resolveTypeArguments(handlerClass, CommandHandler.class);
        Class<? extends Command> commandType = (Class<? extends Command>) generics[1];
        commandProviderMap.put(commandType,new CommandProvider(applicationContext,handlerClass));
    }

    private void registerQuery(ApplicationContext applicationContext, String name) {
        Class<QueryHandler<?,?>> handlerClass = (Class<QueryHandler<?,?>>)applicationContext.getType(name);
        // 获取class上的泛型
        Class<?>[] generics = GenericTypeResolver.resolveTypeArguments(handlerClass, CommandHandler.class);
        Class<? extends Query> queryType = (Class<? extends Query>)generics[1];
        queryProviderMap.put(queryType,new QueryProvider(applicationContext,handlerClass));
    }

    public <R,C extends Command<R>> CommandHandler<R,C> getCmd(Class<C> commandClass) {

        return commandProviderMap.get(commandClass).get();
    }

    public <R,Q extends Query<R>> QueryHandler<R,Q> getQuery(Class<? extends Query> queryClass){

        return queryProviderMap.get(queryClass).get();
    }
    
    
}
