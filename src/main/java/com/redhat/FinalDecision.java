package com.redhat;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class FinalDecision implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(generator = "FINALDECISION_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(sequenceName = "FINALDECISION_ID_SEQ", name = "FINALDECISION_ID_GENERATOR")
    private java.lang.Long id;

    public FinalDecision() {
    }
    
    public FinalDecision(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}