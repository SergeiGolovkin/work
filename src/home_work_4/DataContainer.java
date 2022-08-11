package home_work_4;

import java.util.Arrays;

public class DataContainer <T> {
    private T[] data;

    public  DataContainer(T[] data){
        this.data = data ;
    }

    /**
     * Добовляет новое значение в ближайшую ячейку массива если оно не null.
     * Если все ячейки массива заполнены то создает новый массив на одну ячейку больше
     * копирует и добавляет значение в конец массива
     * @param item аргумент переданный для добавления
     * @return возвращает значение индекса записанного аргумента
     */


    public int add(T item) {
        int index = 0;
        if (item == null) {
            return (index-1);
        }
        else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    this.data[i] = item;
                    index = i;
                }else  {
                    this.data = Arrays.copyOf(data, this.data.length + 1);
                    this.data [i +1] = item;
                    index = i +1;
                }
            }
            return index;
        }
    }

    /**
     *
     * @param index
     * @return
     */
    public T get(int index){
        if (index < 0){
            return null;
        }
        else{
            return data[index];
        }

    }

    /**
     *
     * @return
     */

    public T[] getData() {
        return data;
    }

    /**
     *
     * @param index
     * @return
     */
    public boolean delete(int index){
        if (index < 0 ) {
            return true;
        } else if (index > data.length) {
            return false;
        } else {
            data[index] = null;

            for (int i = index; i < data.length; i++) {
                data[i] = data[i + 1];
            }
            this.data = Arrays.copyOf(data, this.data.length + 1);
            return true;
        }
    }

    /**
     *
     * @param item
     * @return
     */
    public boolean delete(T item){
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i].equals(item)) {
                    data[i] = data[i + 1];
                    for (int j = i + 1; j < data.length; j++) {
                        data[j] = data[j + 1];
                    }
                    this.data = Arrays.copyOf(data, this.data.length + 1);
                    return true;
                }
            }
        }
        return false;
    }
}