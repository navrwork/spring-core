package com.navr.springcore.annotationsdemo.components;

import org.springframework.stereotype.Component;

/**
 * <pre>

 Note: This class can be defined as a Component either
 i.  in this class using '@Component' annotation OR
 ii. in Config class file using '@Bean' annotation to method.
 Both are equivalent and works the same way.

 </pre>
 */
public class ComponentB {

    @Override
    public String toString() {
        return "I'm componentB";
    }
}
