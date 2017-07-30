package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1694 {

    @Ignore    private SampleClass1695 sampleClass;

    public SampleClass1694(){
        sampleClass = new SampleClass1695();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}