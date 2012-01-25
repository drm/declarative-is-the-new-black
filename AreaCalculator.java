class AreaCalculator {
    public float total = 0;
    
    public void add(HasArea obj) {
        total += obj.getArea();
    }
    
    
    public void subtract(HasArea obj) {
        total -= obj.getArea();
    }
}

