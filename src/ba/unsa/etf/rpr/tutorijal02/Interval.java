package ba.unsa.etf.rpr.tutorijal02;

import java.util.Objects;

public class Interval {
    double tacka1, tacka2;
    boolean istacka1, istacka2;
    public Interval(double tacka1, double tacka2, boolean istacka1, boolean istacka2) throws IllegalArgumentException {
        this.tacka1=tacka1;
        this.tacka2=tacka2;
        this.istacka1=istacka1;
        this.istacka2=istacka2;
        if (tacka1<tacka2) throw new IllegalArgumentException("Tacka2 manja od Tacka1");

    }
    public Interval (){
        this.tacka1=0;
        this.tacka2=0;
        this.istacka2=false;
        this.istacka1=false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Double.compare(interval.tacka1, tacka1) == 0 &&
                Double.compare(interval.tacka2, tacka2) == 0 &&
                istacka1 == interval.istacka1 &&
                istacka2 == interval.istacka2;
    }



    public boolean isNull(){
        Interval nullti= new Interval();
        return this.equals(nullti);
    }
    public boolean isIn(double tacka){
        return this.tacka1 < tacka && tacka < this.tacka2;
    }
    /*public Interval intersect(Interval interval){
        double lijeva = this.tacka1<interval.tacka1?interval.tacka1:this.tacka1;
        double desna = this.tacka2<interval.tacka2?interval.tacka2:this.tacka2;
        boolean islijeva = isIn(lijeva);
        boolean isdesna = isIn(desna);
    }*/

}
