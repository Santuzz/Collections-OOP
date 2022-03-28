package exercises.mylist;

public abstract class MyAbstractList implements MyList{

    public void checkBoundaries(int index, int end){
        if(index < 0 || end < index){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for (int i = 0; i < size(); i++) {
            str.append(String.format("[%s]", get(i).toString())).append(String.format("[%s]", " "));
        }
        str.append("]");
        return str.toString();
    }
}
