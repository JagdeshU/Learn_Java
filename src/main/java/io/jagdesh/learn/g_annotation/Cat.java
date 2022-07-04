package io.jagdesh.learn.g_annotation;

@VeryImportant
public class Cat {

    @ImportantString
    private String name;
    private Integer age;

    public Cat(String name) {
        this.name = name;
    }

    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("meow..");
    }

    public void eat() {
        System.out.println("nom nom..");
    }
}
