class Circle implements HasArea {
    private double _radius;

    public Circle(double radius) {
        _radius = radius;
    }
    
    public double getArea() {
        return Math.PI * Math.PI * _radius;
    }
}

