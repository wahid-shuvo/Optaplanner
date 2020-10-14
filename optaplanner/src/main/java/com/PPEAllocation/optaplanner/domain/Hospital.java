package com.PPEAllocation.optaplanner.domain;
import com.PPEAllocation.optaplanner.common.domain.AbstractPersistable;
import com.PPEAllocation.optaplanner.common.swingui.components.Labeled;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("Hospital")
public class Hospital extends AbstractPersistable implements Labeled {
    private Integer no_of_patient;
    private Integer no_of_stuff;

    public Hospital(long id) {
        super(id);
    }

    public Integer getNo_of_patient() {
        return no_of_patient;
    }

    public void setNo_of_patient(Integer no_of_patient) {
        this.no_of_patient = no_of_patient;
    }

    public Integer getNo_of_stuff() {
        return no_of_stuff;
    }

    public void setNo_of_stuff(Integer no_of_stuff) {
        this.no_of_stuff = no_of_stuff;
    }

    @Override
    public String getLabel() {
        return "Hospital " + id;
    }

}
