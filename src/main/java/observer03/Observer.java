package observer03;

public interface Observer<T> {
    void update(Observable<T> observable, T arg);
}
