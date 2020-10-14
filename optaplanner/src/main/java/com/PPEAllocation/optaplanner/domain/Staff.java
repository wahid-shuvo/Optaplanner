package com.PPEAllocation.optaplanner.domain;
import com.PPEAllocation.optaplanner.common.domain.AbstractPersistable;
import com.PPEAllocation.optaplanner.common.swingui.components.Labeled;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("Staff")
public class Staff extends AbstractPersistable implements Labeled {

    public Staff(long id) {
        super(id);
    }
    @Override
    public String getLabel() {
        return "Staff " + id;
    }

}
