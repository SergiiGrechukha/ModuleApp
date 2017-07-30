package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1732 {

    @Ignore    private SampleClass1733 sampleClass;

    public SampleClass1732(){
        sampleClass = new SampleClass1733();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}