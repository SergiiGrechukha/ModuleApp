package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1590 {

    @Ignore    private SampleClass1591 sampleClass;

    public SampleClass1590(){
        sampleClass = new SampleClass1591();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}