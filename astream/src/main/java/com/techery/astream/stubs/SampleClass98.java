package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass98 {

    @Ignore    private SampleClass99 sampleClass;

    public SampleClass98(){
        sampleClass = new SampleClass99();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}