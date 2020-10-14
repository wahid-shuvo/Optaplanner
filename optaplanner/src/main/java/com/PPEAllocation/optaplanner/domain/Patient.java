package com.PPEAllocation.optaplanner.domain;
import com.PPEAllocation.optaplanner.common.domain.AbstractPersistable;
import com.PPEAllocation.optaplanner.common.swingui.components.Labeled;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Patient")
public class Patient extends AbstractPersistable implements Labeled{
    private Integer severity_level;
    public Patient() {
    }

    public Patient(long id,Integer severity_level) {
        super(id);
        this.severity_level=severity_level;
    }

    public void setSeverity_level(Integer severity_level)
    {
        this.severity_level=severity_level;
    }
    public Integer getSeverity_level() {
        return severity_level;
    }

    @Override
    public String getLabel() {
        return "Patient " + id;
    }

}
