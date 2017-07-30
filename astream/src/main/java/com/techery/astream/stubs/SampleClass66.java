package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass66 {

    @Ignore    private SampleClass67 sampleClass;

    public SampleClass66(){
        sampleClass = new SampleClass67();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}