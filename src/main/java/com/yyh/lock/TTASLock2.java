package com.yyh.lock;
/*     
 created by yangzhizhong at 2019/11/26   
 */

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class TTASLock2 {

    private volatile long lock;
    private  static final AtomicLongFieldUpdater<TTASLock2> lockFieldUpdater =
            AtomicLongFieldUpdater.newUpdater(TTASLock2.class, "lock");

    boolean lock()
    {

        long t = Thread.currentThread().getId();
        if (t == lockFieldUpdater.get(this))
            return false;
        while (true)
        {
            if (lockFieldUpdater.compareAndSet(this, 0L, t))
                return true;

            // yield control to other thread.
            // Note: we cannot use LockSupport.parkNanos() as that does not
            // provide nanosecond resolution on Windows.
            //while(lockFieldUpdater.get(this) != 0L)
                Thread.yield();
        }
    }

    void unlock(boolean wasFirst)
    {
        if (!wasFirst)
            return;

        long t = Thread.currentThread().getId();
        boolean r = lockFieldUpdater.compareAndSet(this, t, 0L);
        assert r;
    }

}
