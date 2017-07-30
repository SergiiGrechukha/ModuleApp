package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass330 {

    @Ignore    private SampleClass331 sampleClass;

    public SampleClass330(){
        sampleClass = new SampleClass331();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}