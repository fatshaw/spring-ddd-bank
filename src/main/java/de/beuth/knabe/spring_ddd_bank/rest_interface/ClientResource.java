package de.beuth.knabe.spring_ddd_bank.rest_interface;

import de.beuth.knabe.spring_ddd_bank.domain.Client;

/**Data about a client of a bank. Usable as Data Transfer Object.*/
public class ClientResource {

    /**Unique ID of the client.*/
	public Long id;

    /**Username of the client. It has to be unique, too.*/
    public String username;

	/**The birth date of the client in format 1999-01-01.*/
    public String birthDate;


    /**Necessary for Jackson*/
	public ClientResource() {}

    /**Constructs a ClientResource with the data of the passed Client entity.*/
    public ClientResource(final Client entity) {
    	this.id = entity.getId();
        this.username = entity.getUsername();
        this.birthDate = Util.MEDIUM_DATE_FORMATTER.format(entity.getBirthDate());
    }

    @Override
    public String toString() {
        return String.format(
                "Client{id=%d, username='%s', birthDate='%s'}",
                id, username, birthDate);
    }
    
}

