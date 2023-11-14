import java.util.Arrays;

public class Farm {
    String address;
    String OwnerName;

    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;

    public Farm() {
    }

    public Farm(String address, String ownerName, Cow[] cows, Horse[] horses, Sheep[] sheeps) {
        this.address = address;
        OwnerName = ownerName;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", OwnerName='" + OwnerName + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheeps=" + Arrays.toString(sheeps) +
                '}';
    }
}
