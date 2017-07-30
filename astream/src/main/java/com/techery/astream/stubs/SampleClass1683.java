package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1683 {

    @Ignore    private SampleClass1684 sampleClass;

    public SampleClass1683(){
        sampleClass = new SampleClass1684();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}