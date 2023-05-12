package entidades;


public class Reservas {

    private String propriedadeReservada;
    private String hospedeReserva;
    private String checkin;
    private String checkout;

    public Reservas(String propriedadeReservada, String hospedeReserva, String checkin, String checkout) {
        this.propriedadeReservada = propriedadeReservada;
        this.hospedeReserva = hospedeReserva;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getPropriedadeReservada() {
        return propriedadeReservada;
    }

    public void setPropriedadeReservada(String propriedadeReservada) {
        this.propriedadeReservada = propriedadeReservada;
    }

    public String getHospedeReserva() {
        return hospedeReserva;
    }

    public void setHospedeReserva(String hospedeReserva) {
        this.hospedeReserva = hospedeReserva;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
}


