package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass486 {

    @Ignore    private SampleClass487 sampleClass;

    public SampleClass486(){
        sampleClass = new SampleClass487();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}