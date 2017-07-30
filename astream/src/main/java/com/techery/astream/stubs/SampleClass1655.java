package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1655 {

    @Ignore    private SampleClass1656 sampleClass;

    public SampleClass1655(){
        sampleClass = new SampleClass1656();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}