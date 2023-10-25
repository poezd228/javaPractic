public class TestClass <T, V, K> {
    private T newT;
    private V newV;
    private K newK;
    public TestClass(T t, V v, K k){
        this.newT = t;
        this.newV = v;
        this.newK = k;

    }
    public void PrintClass(TestClass<T,V,K> object){
        System.out.println(object.getNewT().getClass());
        System.out.println(object.getNewV().getClass());
        System.out.println(object.getNewK().getClass());

    }

    public K getNewK() {
        return newK;
    }

    public void setNewK(K newK) {
        this.newK = newK;
    }

    public V getNewV() {
        return newV;
    }

    public void setNewV(V newV) {
        this.newV = newV;
    }

    public T getNewT() {
        return newT;
    }

    public void setNewT(T newT) {
        this.newT = newT;
    }
}
