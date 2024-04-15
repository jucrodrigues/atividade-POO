public class Contador {
    private int count;

    public Contador(int count) {

        this.count = count;
    }

    public void Zerar() {
       this.count =0;
    }

    public void Incrementar() {

        this.count++;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
