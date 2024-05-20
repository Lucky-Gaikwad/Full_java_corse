/*•	Create three threads.
 Ensure that the second thread starts only after the first thread ends
 and the third thread starts only after the second thread 
 end using the join method. 
 Each thread should print its start and along with its name.
 */

package com.example.ThreadChallange3;

import java.lang.RuntimeException;

public class PrintThread extends Thread {

    private final int threadNumber;

    public PrintThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
            System.out.printf("%s Thread Starting-%d\n",
            Thread.currentThread().getName(), threadNumber);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException();
                // TODO: handle exception
            }

            System.out.printf("%s Thread ending-%d\n",
            Thread.currentThread().getName(), threadNumber);
        
    }

}
