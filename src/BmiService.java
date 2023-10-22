public class BmiService {
    public int calculate(int massKG, double heightMetre) { //масса вводится в килограммах, вес в метрах
        int index;
        index = (int) (massKG / (heightMetre * heightMetre));
        return index;
    }
}
