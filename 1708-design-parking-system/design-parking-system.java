class ParkingSystem {
    int b,m,s;

    public ParkingSystem(int b, int m, int s) {
        this.b = b;
        this.m = m;
        this.s = s;

    }
    
    public boolean addCar(int ct) {
        if(ct == 1 && b>0){
            b--;
            return true;
        }
        if(ct == 2 && m>0){
            m--;
            return true;
        }
        if(ct == 3 && s>0){
            s--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */