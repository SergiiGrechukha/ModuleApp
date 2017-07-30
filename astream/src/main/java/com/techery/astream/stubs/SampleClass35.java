package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass35 {

    @Ignore    private SampleClass36 sampleClass;

    public SampleClass35(){
        sampleClass = new SampleClass36();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}