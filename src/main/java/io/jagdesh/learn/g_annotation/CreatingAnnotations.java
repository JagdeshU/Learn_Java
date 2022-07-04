package io.jagdesh.learn.g_annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

public class CreatingAnnotations {
    public static void main(String[] args) throws Exception {
        System.out.println();
        Cat myCat = new Cat("peepy");

        if (Optional.ofNullable(myCat.getClass().isAnnotationPresent(VeryImportant.class)).get()) {
            System.out.println("This thing is very important");
        }
        System.out.println();

        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                method.invoke(myCat);
                System.out.println();
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(myCat);
                }
            }
        }
        System.out.println();

        for (Field field : myCat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objValue = field.get(myCat);
                if (objValue instanceof String strValue) {
                    System.out.println(strValue.toUpperCase());
                }
            }
        }
    }
}
