package domain;

public class SortingTask extends Task{
    private int v[];

    AbstractSort sorter;
    @Override
    public void execute() {
        sorter.sort();
    }

    public SortingTask(Long id,String desc,AbstractSort sorter){
        super(id,desc);
        this.sorter=sorter;
    }
}
