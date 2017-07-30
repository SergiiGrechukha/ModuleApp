package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1523 {

    @Ignore    private SampleClass1524 sampleClass;

    public SampleClass1523(){
        sampleClass = new SampleClass1524();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}