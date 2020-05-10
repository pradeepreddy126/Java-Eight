package com.coreeight.basics.blocks;

import javax.swing.text.html.StyleSheet;

public class StaticBlocks {

    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 3");
    }

    static {
        System.out.println("Block 2");
    }

    public static void main(String str[]){
        System.out.println("main()");
    }

    static {
        System.out.println("Block 4");
    }

}
