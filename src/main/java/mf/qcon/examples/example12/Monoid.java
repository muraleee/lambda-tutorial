package mf.qcon.examples.example12;

import java.util.function.*;

public interface Monoid<A> extends BinaryOperator<A> {

    A zero();
}
