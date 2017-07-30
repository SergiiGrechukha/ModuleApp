package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1779 {

    @Ignore    private SampleClass1780 sampleClass;

    public SampleClass1779(){
        sampleClass = new SampleClass1780();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}