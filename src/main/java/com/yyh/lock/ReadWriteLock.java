package com.yyh.lock;
/*     
 created by yangzhizhong at 2020/1/8   
 */

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();
    private static ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();

    public static void main1(String[] args) {

        readLock.lock();
        try {
            System.out.println("get read lock");
            writeLock.lock();
            try {
                System.out.println("get write lock");
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                writeLock.unlock();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            readLock.unlock();
        }



    }

    public static void main(String[] args) {

        int EXCLUSIVE_MASK = (1 << 16) - 1;
        System.out.println("hello, world");
        System.out.println(EXCLUSIVE_MASK);
        writeLock.lock();
        try {
            System.out.println("get write lock");
            readLock.lock();
            try {
                System.out.println("get read lock");
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                readLock.unlock();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            writeLock.unlock();
        }



    }
}
