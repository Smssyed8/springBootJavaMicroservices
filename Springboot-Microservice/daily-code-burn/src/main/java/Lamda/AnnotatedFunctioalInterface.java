package Lamda;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@FunctionalInterface
public interface AnnotatedFunctioalInterface {
    public void firstWork();  // abstact by default since it is interface
}
