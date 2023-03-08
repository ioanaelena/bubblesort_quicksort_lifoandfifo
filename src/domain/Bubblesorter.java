package domain;

public class Bubblesorter extends AbstractSort{
    private int [] v;

    public Bubblesorter(int[] v) {
        this.v = v;
    }

    @Override
    public void sort() {
        int n = v.length;
        int aux = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(v[j-1] > v[j]){
                    //swap elements
                    aux = v[j-1];
                    v[j-1] = v[j];
                    v[j] = aux;
                }

            }
        }
    }
    }


