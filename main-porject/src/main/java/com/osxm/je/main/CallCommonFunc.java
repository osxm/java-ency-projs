/**
 * Copyright (C)  Oscar Chen(XM):
 * 
 * Date: 2025-01-12
 * Author: XM
 */
package com.osxm.je.main;

import com.osxm.je.lib.CommonFunc;

public class CallCommonFunc {

    public static void main(String[] args) {
        CommonFunc commonFunc = new CommonFunc();
        String str = commonFunc.commonFunc();
        System.out.println(str);
    }
}
