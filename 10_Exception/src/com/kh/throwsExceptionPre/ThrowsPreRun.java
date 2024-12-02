package com.kh.throwsExceptionPre;

import java.io.FileNotFoundException;

public class ThrowsPreRun {
    public static void main(String[] args) throws FileNotFoundException {
        ThrowsPre t = new ThrowsPre();
        t.method2();
    }
}
