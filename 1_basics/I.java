class X {
    // variable declaration is an allowed statement inside a class.
    
    // just variable declaration is also a valid statement direct inside a class
    int a;

    // variable type declaration cum initialization is a valid statement 
    int y = 67;
    
    // apart from variable creation statement, method defnition statement and constructor definition statements, 
    // all other statements must go inside a code block(method or a constructor).    
    // a = 90;    //NOT OK   
    // System.out.println("hello");  //NOT OK

    int add(int a, int b) {
        // variable declaration is an allowed statement inside a method.
        int sum = 0;
        sum = a + b;
        System.out.println(sum);
        return sum;
    }
}