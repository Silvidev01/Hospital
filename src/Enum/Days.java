package Enum;

public enum Days {
    Monday(true), Tuesday(true), Wednesday(true), Thursday(true), Friday(true), Saturday(false), Sunday(false);
    private boolean workingday;

    private Days(boolean workingday) {
        this.workingday = workingday;
    }
    @Override
    public String toString(){
        if (workingday) {
            return this.name() " is working day"
        }else{
            return this.name() "is not a working day"
        }
    }
}