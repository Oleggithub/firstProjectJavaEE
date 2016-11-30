package avto_test_annotation.avto;

/**
 * Created by b_nop on 30.11.2016.
 */
public class Avto {
    String markaAvto;
    int ageAvto;
    String transmissionAvto;

    public String getMarkaAvto() {
        return markaAvto;
    }

    public void setMarkaAvto(String markaAvto) {
        this.markaAvto = markaAvto;
    }

    public int getAgeAvto() {
        return ageAvto;
    }

    public void setAgeAvto(int ageAvto) {
        this.ageAvto = ageAvto;
    }

    public String getTransmissionAvto() {
        return transmissionAvto;
    }

    public void setTransmissionAvto(String transmissionAvto) {
        this.transmissionAvto = transmissionAvto;
    }

    public Avto() {
    }

    public Avto(String markaAvto, int ageAvto, String transmissionAvto) {
        this.markaAvto = markaAvto;
        this.ageAvto = ageAvto;
        this.transmissionAvto = transmissionAvto;

    }

    @Override
    public String toString() {
        return "Avto{" +
                "markaAvto='" + markaAvto + '\'' +
                ", ageAvto=" + ageAvto +
                ", transmissionAvto='" + transmissionAvto + '\'' +
                '}';
    }
}
