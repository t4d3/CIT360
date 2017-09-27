/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignc;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author T4d3
 */
class ClassC12 {

    void go() {

        Executor anExecutor = Executors.newFixedThreadPool(3);
        for (int threadCnt = 0; threadCnt < 4; threadCnt++) {
            anExecutor.execute(new ClassC12Runnable());
        }
    }
}
