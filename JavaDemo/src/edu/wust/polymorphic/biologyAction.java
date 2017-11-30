package edu.wust.polymorphic;

import java.util.function.Function;

@FunctionalInterface
public interface biologyAction<T,R> 
{
public void action(Function<T,R> F);
}
