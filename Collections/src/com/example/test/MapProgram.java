package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("JAVA")) {
            System.out.println("JAVA is already in the map");
        } else {
            languages.put("JAVA", "a compiled high level, object-oriented, platform independent language");
            System.out.println("JAVA is added successfully");
        }
        languages.put("PYTHON", "an interpreted, object - oriented, high-level programing language with dynamic semantics");
        languages.put("ALGOL", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Instruction Code"));
        System.out.println(languages.put("LISP", "Therein lies madness"));


        if(languages.remove("ALGOL","an algorithmic language")){
            System.out.println("Algol was removed");
        }else{
            System.out.println("Algol not removed");
        }
        if(languages.replace("LISP","Therein lies madness","a functional programming language")){
            System.out.println("Lisp was replaced");
        }else{
            System.out.println("Lisp was not replaced");
        }
        for (String key:languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }

}
