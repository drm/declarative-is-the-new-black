class Example {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        // our yard is 10 by 4.2 meters
        calc.add(new Rectangle(10.0, 4.2));
        
        // But it has a pool, 3 meter in diameter
        calc.subtract(new Circle(1.5));
        
        System.out.println("The square metrage we need to buy grass seed for is " + calc.total);
    } 
}

