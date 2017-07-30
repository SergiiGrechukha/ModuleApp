package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass757 {

    @Ignore    private SampleClass758 sampleClass;

    public SampleClass757(){
        sampleClass = new SampleClass758();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}