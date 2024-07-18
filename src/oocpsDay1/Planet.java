// Create a class that captures planets. Each planet has a name, a distance from the sun, and its gravity relative to Earth’s gravity. For distance and gravity, use the type double which captures real numbers. Make objects for Earth and your favorite non-earth planet.



package oocpsDay1;

class Planet {
    private String name;
    private double distanceFromSun;
    private double gravity;

    public Planet(String name, double distanceFromSun, double gravity) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.gravity = gravity;
    }

    @Override
    public String toString() {
        return "Planet(" + name + ", Distance: " + distanceFromSun + " AU, Gravity: " + gravity + "g)";
    }

    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1.0, 1.0);
        Planet mars = new Planet("Mars", 1.52, 0.38);

        System.out.println(earth);
        System.out.println(mars);
    }
}

