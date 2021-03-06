public class RockPlanet extends Planet {
    private boolean habitable;

    RockPlanet(int orbitTime, String designation, boolean habitable){
        super(orbitTime, designation);
        this.habitable = habitable;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString() {
        return "Orbit Time: " + getOrbitTime() + "Designation: " + getDesignation() + "Is Habitable?: " + habitable;
    }
}
