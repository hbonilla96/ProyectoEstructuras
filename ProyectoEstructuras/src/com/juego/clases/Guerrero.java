package com.juego.clases;

public enum Guerrero {
		FIORA(1),
	    GAREN(2),
	    VOLIBEAR(3),
	    RIVEN(4),
	    IRELIA(5);

	    private final int id; //se puede utilizar el ordinal, pero se usa esto por claridad

	    Guerrero(int id) {
	        this.id = id;
	    }

	    public int getId() {
	        return id;
	    }

	    /**
	     * Obtiene la enumeracion a partir de un id
	     *
	     * @param id el id de la enumeracion
	     * @return el Guerrero
	     */
	    public static Guerrero getTipo(int id) {
	    	Guerrero t = null;
	        for (Guerrero tipo : Guerrero.values()) {
	            if (tipo.getId() == id) {
	                t = tipo;
	            }
	        }
	        return t;
	    }

	    @Override
	    public String toString() {
	        return super.toString();
	    }
}
