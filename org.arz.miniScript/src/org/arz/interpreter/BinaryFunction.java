package org.arz.interpreter;

public interface BinaryFunction<TResult,P1,P2> {
   public TResult apply(P1 p1,P2 p2);
}
