package producer;

import java.util.ArrayList;
import java.util.List;

public class Warehourse {//仓库对象

    /*实现单例模式*/
    private static Warehourse warehourse;
    private Warehourse(){ }
    public static Warehourse getInstance() {
        if (warehourse == null) {
            warehourse = new Warehourse();
        }
        return warehourse;
    }


    //仓库里面的集合,用于存放元素
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void add(){//向仓库添加元素

        if (list.size() < 10){
            list.add("a");
        } else {
            notifyAll();       //挂起前先唤醒全部其余线程
            try {
                this.wait();       //进入挂机
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void remove(){//向仓库里获取元素
        synchronized (this) {
            if (list.size() > 0) {
                list.remove(0);
            } else {
                notifyAll();       //挂起前先唤醒全部其余线程
                try {
                    this.wait();       //进入挂机
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
