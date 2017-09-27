/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author T4d3
 */
class ClassC13 {

    void go() {

        ExecutorService anExecutor = Executors.newCachedThreadPool();
        for (int threadCnt = 0; threadCnt < 6; threadCnt++) {
            anExecutor.execute(new ClassC13Runnable());

        }
    }
}
